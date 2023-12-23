// public class stackusingLL {
//     static class node{
//         int data;
//         node next;
//         public node(int data){
//             this.data = data;
//              this.next = null;
//         }
//     }
//     static class stack{
//         public static node head;
//         public static boolean isempty(){
//             return head==null;
//         }
//         public static void push(int data){
//             node newnode = new node (data);
//             if(isempty()){
//                 head = newnode;
//                 return ;
//             }
            
//             newnode.next = head;
//             head = newnode;
//         }
//         public static int pop(){
//             int top = head.data;
//             head=head.next;
//             return top;
//         }
//         public static int peek(){
//             if(isempty()){
              
//                 return -1 ;
//             }
     
//         return head.data;

//         }
//     }
//     public static void main(String args[]){

//         stack s = new stack();
//         s.push(3);
//         s.push(9);
//         s.push(66);
//         s.push(98);
//         while(!s.isempty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }
    


