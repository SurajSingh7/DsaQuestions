//A lot of sum infosys 24 april
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=i+1;
		}
		
	  for(int i=0;i<k;i++){	
		for(int j=1;j<n;j++){
		    a[j]+=a[j-1];
		}
	  }
		int sum=0;
		for(int x:a)
		 sum+=x;
    	System.out.println(sum);
    	
		}
	}
}

