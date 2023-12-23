import java.util.*;

public class rr {

    static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    } 

    static class stackusingll{
      static node head = null; 
    
      LinkedList<Integer> list = new LinkedList<>();

      public static boolean isEmpty(){
        return head == null ;
      }

      public static void push(int data){
        node newnode = new node (data);
          head.next=newnode;

      }
      public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head=head.next;
        return top;

      }
      public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;


      }
    }
    public static void main(String[] args) {
        Stack < Integer> stac = new Stack<>();
        stac.push(1);
        stac.push(2);
        stac.push(3);
        stac.push(4);
        stac.push(5);

        while(!stac.isEmpty()){
            System.out.println(stac.peek());
            stac.pop();
        }
        

    }
}



//     static class stackusingarraylist{
//        static ArrayList<Integer>list = new ArrayList<>();

//         public static boolean isEmpty(){
//            return list.size()==0;
//         }

//         public static void push(int data){
//             list.add(data);
//         }
//         public static int pop(){
//            int top = list.get(list.size()-1);
//            list.remove(list.size()-1);
//            return top;

            

//         }
//         public static int peek(){
//           return list.get(list.size()-1);
//         }

     

//     }
//     public static void main(String args[]){
//         Stack<Integer>stc = new Stack<>();
//         stc.push(1);
//         stc.push(2);
//         stc.push(3);
//         stc.push(4);
     

//         while(!stc.isEmpty()){
//             System.out.println(stc.peek());
//             stc.pop();
//         }

//     }
    
// }
