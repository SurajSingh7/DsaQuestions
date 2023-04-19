import java.util.*;
public class Main
{
	public static void main(String[] args) {

		MyStack  st=new MyStack();
		 st.push(20);
		 st.push(11);
		System.out.println(st.display());
	}
}

class MyStack{
          
          ArrayList<Integer> l;
          MyStack(){
              l=new ArrayList<>();
          }
          
           void push(int num){
               l.add(num);
           }
           
            int peek(){
               if(l.size()==0) return -1;
               return l.get(l.size()-1);
           }
           
           int pop(){
               if(l.size()==0) return -1;
               int x=l.get(l.size()-1);
               l.remove(l.size()-1);
               return x;
           }
           
           int size(){
              return l.size();
          }
          ArrayList<Integer> display(){
              return l;
          }
           boolean isEmpty(){
               return l.size()==0;
           }
      }
      
      
      
