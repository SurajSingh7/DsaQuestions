//Alternating ArrayS infosys 24 april
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
		
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		
		int b[]=new int[n];
		int i=0,j=n-1;
		for(int k=0;k<n;k++){
		    if(k%2==0)
		      b[k]=a[j--];
		    else
		        b[k]=a[i++];
		}
		
		int sum=0;
		for(int i1=0;i1<n;i1++){
		    sum+=b[i1]*Math.pow(10,i1+1);
		}
		
    	System.out.println(sum);
    	
		}
	}
}

