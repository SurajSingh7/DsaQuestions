import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     
	     
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int a[]=new int[n];
	     for(int i=0;i<n;i++){
	          a[i]=sc.nextInt();
	     }
		System.out.println(dumplings(n,a));
	}
	
	public static int dumplings(int n,int a[]){
	     
	   
	    Arrays.sort(a); 
	    int k=(int)10e9;
	    int s=0,j1=0,j2=0;
	    s=s+a[0];
	    if(a[1]==a[0]+1)
	       a[1]=k;
	       a[0]=k;
	                
	    for(int i=1;i<n-1;i++){
	         
	         if(a[i]==k) continue;
	         
	         j2=i;
	         while(a[j2-1]==a[i]-1){
	          a[j2-1]=k;
	           j2--;
	          }
	          
	          j1=i;
	          while(a[i]+1==a[j1+1]){
	             a[j1+1]=k;
	             j1++;
	          }
	     
	          s=s+a[i];
	          a[i]=k;
	    }
	    
	    if(a[n-1]!=k) s=s+a[n-1];
	    
	   return s;
	    
	}
	
}


