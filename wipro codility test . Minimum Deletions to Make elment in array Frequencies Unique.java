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
		int x=fun(a);
		System.out.println(x);
	}
	
	
	public static int fun(int a[]){
	 
	HashMap<Integer ,Integer> hm=new HashMap<>();
    HashSet<Integer> hs=new HashSet<>();
      
    for(int i=0;i<a.length;i++){
    
        if(hm.containsKey(a[i])) hm.put(a[i],hm.get(a[i])+1);
        else hm.put(a[i],1);
    }  
       int c=0;
    for(int x:hm.keySet()){
      int y=hm.get(x);
    
       while(y>0){
         if(hs.contains(y)){
            y=y-1;
            c++;
         }else{
            hs.add(y);
            break;
         }
       } 
    }
      return c; 
	    
	}
	
}

