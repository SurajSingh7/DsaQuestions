import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  
	 Scanner sc=new Scanner(System.in);
	 String L=sc.next();
	 String R=sc.next();
	 
	// write
	 int sum=0;
	 int m=998244353;
	 int l=Integer.parseInt(L)%m;
	 int r=Integer.parseInt(R)%m;
	 
	 for(int i=l;i<=r;i++){
	     
	     if(fun(i)==true){
	     sum=(sum+i%m)%m;
	      System.out.println(i);
	     }
	 }
	 
	 System.out.println(sum);
	}
	 
	 public static boolean fun(int n ){
	     
	    int p2=0,p3=0,p4=0,p5=0,p6=0,p7=0;
	     while(n>0){
	         int r=n%10;
	         
	         if(r==2 || r==3){
	             if(r==2) p2=2;
	             if(r==3) p3=3;
	             if(p2==2 && p3==3){
	                 return true;
	             }
	         }
	         
	          if(r==4 || r==5){
	             if(r==4) p4=4;
	             if(r==5) p5=5;
	             if(p4==4 && p5==5){
	                 return true;
	             }
	         }
	         
	          if(r==6 || r==7){
	             if(r==6) p6=6;
	             if(r==7) p7=7;
	             if(p6==6 && p7==7){
	                 return true;
	             }
	         }
	         n=n/10;
	     }
	     
	     return false;
	 }
	
}
