import java.util.*;

// IMPLEMENTATION OF STACK USING JAVA COLLECTION FRAMEWORK



public class stackk {
    public static void main(String args[]){
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}


// IMPLEMENTTATION OF STACK USING LINKEDLIST


//    static class node{
//     int  data;
//     node next;
//     public node(int data){
//         this.data = data;
//         this.next = null;
//     }
//    }
//    static class stack {
//     public static node head;
//     public static boolean isempty(){
//          return head ==null;
//     }
//     public static void push(int data){
//         node newnode = new node(data);
//         if(isempty()){
//             head = newnode;
//             return;
//         }
//         newnode.next = head ;
//         head = newnode;
//     }
//     public static int pop(){
//         if(isempty()){
//             return -1;
//         }
//         int top = head.data;
//         head = head.next;
//         return top;
//     }
//     public static int peek(){
//         if(isempty()){
//             return -1;
//         }
//         return head.data;
//     }
//    }
//    public static void main(String[] args) {
//     stack satckk = new stack();
//     satckk.push(1);
//     satckk.push(2);
//     satckk.push(3);
//     satckk.push(4);
//     satckk.push(5);

//     while(!satckk.isempty()){
//         System.out.println(satckk.peek());
//         satckk.pop();
//     }

//    }
// }





// IMPLEMENTATION OF STACK USING ARRAY LIST 




//     static class stack{

//     static ArrayList<Integer>list = new ArrayList<>();

    
//     public static boolean isempty(){

//         return list.size()==0;

//     }
//     public static void push(int data){

//         list.add(data);

//     }
//     public static int pop(){

//         if(isempty()){
//             return -1;
//         }

//         int top = list.get(list.size()-1);
//         list.remove(list.size()-1);
//         return top;
//     }
//     public static int peek(){

//         if(isempty()){
//             return -1;
//         }

//         return list.get(list.size()-1);

//     }
//    }
//    public static void main(String[] args) {
//     stack s = new stack();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//     s.push(4);
//     s.push(5);
     

//     while(!s.isempty()){
//         System.out.println(s.peek());
//         s.pop();
//     }
//    }
   
    
// }
