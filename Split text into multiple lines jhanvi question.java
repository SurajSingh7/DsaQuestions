
import java.util.*;
public class Main {
	public static void main(String[] args) {
	
	 String s="Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
	 String str[]=s.split(" ");
	 List<String> l=new ArrayList<>();
	 String s1="";
	 for(int i=0;i<str.length;i++){
	     
	     if(s1.length()+str[i].length()<=13){
	         s1=s1+str[i]+" ";
	     }else{
	         l.add(s1);
	         s1=str[i]+" ";
	         if(i==str.length-1)l.add(str[i]);
	     }
	 }
	 
	 for(int i=0;i<l.size();i++){
	      String s2=l.get(i);
	      int n=s2.length();
        if(s2.charAt(n-1)==' ')
          System.out.println(s2.substring(0,n-1));
        else
          System.out.println(s2);
	 }
	
	}
}
