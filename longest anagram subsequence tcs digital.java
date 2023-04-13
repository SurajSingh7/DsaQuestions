// longest anagram subsequence tcs digital
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	String s=sc.nextLine();
	List<Integer> l=new ArrayList<>(26);
	for(int i=0;i<26;i++){
	    l.add(0);
	}
	List<List<Integer>>ans=new ArrayList<>();
	
	for(int i=0;i<n;i++){
	    int x=s.charAt(i)-'a';
	    l.set(x,l.get(x)+1);
	    ans.add(new ArrayList<>(l));
	    
	}
	    int sum=0;
		for(int i=0;i<n;i++){
	    int x=s.charAt(i)-'a';
	    l.set(x,l.get(x)-1);
	    int c=0;
	    for(int j=0;j<26;j++){
	        c+=Math.min(l.get(j),ans.get(i).get(j));
	    }
	    sum=Math.max(sum,c);
     	}

     System.out.println(sum);

	}
}

