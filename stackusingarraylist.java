import java.util.ArrayList;


public class stackusingarraylist{
    static class stack{
        static ArrayList<Integer>list = new ArrayList<>();
     
     
         public static boolean isempty(){
             return list.size() == 0;
         }
     
     
         public static void push(int data){
             list.add(data);
         }
     
         public static int pop(){
           if(isempty()){
            return -1;
           }
             int top = list.get(list.size()-1);
             list.remove(list.size()-1);
             return top;
         }
     
     
         public static int peek(){
            if(isempty()){
                return -1;
            }
           
             return list.get(list.size()-1) ;
         }
     
       }
     
    public static void main(String args[]){
        stack stackk= new stack();
        stackk.push(2);
        stackk.push(9);
        stackk.push(5);

        while(!stackk.isempty()){
            System.out.println(stackk.peek() );
            stackk.pop();

        }
    }
}




