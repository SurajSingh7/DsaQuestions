// frog jump with distance k
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	     
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int k=sc.nextInt();
	     int heights[]= new int[n];
	     for(int i=0;i<n;i++){
	         heights[i]=sc.nextInt();
	     }
	     
	      int dp[]=new int[n];
        int ind=n-1;
        int k1=fun(ind,heights,dp,k); 
        System.out.println(k1);
       // return  k;
	     
	}
	
	 static int fun(int n,int heights[],int dp[],int k){
        if(n==0)
            return 0;
       
        if(dp[n]!=0) return dp[n];
    
        int min=Integer.MAX_VALUE;
        
       for(int j=1;j<=k;j++){ 
        
         if(n-j>=0){
         int y=fun(n-j,heights,dp,k)+Math.abs(heights[n]-heights[n-j]);
       
         min=Math.min(y,min);
         } 
        
       }
        
        
        return dp[n]=min;    
    }
	
	
}

