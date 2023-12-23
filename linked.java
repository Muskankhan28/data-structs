
// public class linked {
    
//     public static void main(String[] args) {
//    	 LL list = new LL();
//         list.addFirst("four");
//         list.addFirst("four");
//         list.addFirst("four");
//         list.addFirst("four");
//         list.addLast("one");
//         list.printlist();
//         System.out.println();
//         list.removelast();
//         list.printlist();

//     } 
// }
 
// class LL{
//     node head;
//     class node{
//         String data;
//         node next;
//         node(String data){
//             this.data=data;
//             this.next=null;
//         }

//     }
//     public void addFirst(String data){

//         node newNode = new node(data);
//         if(head == null ){
//             head =newNode;
//             return;

//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(String data){
//         node newNode = new node(data);
//         if(head == null){
//             head=newNode;
//             return;
//         }
//         node currentNode=head;
//         while(currentNode.next!=null){
//             currentNode=currentNode.next;
//         }
//         currentNode.next=newNode;
//     }
//     public void printlist(){
//         if(head==null){
//             System.out.print("list is empty");
//         }
//        node currentNode =head;
//        while(currentNode!=null){
//         System.out.print(currentNode.data+"->");
//         currentNode=currentNode.next;

//        }
//        System.out.print("null");

//     }
//     public void removefirst(){ 
//         if(head==null){
//             System.out.println("list is empty");
//             return;
//         }
//         head=head.next;

//     }
//     public void removelast(){
//      if(head==null){
//         System.out.print("list is empty");
//         return;
//      }
//      if(head.next==null){
//         head=null;
//         return;
//      }
//      node secondlast =head;
//      node last=head.next;
//      while(last.next!=null){
//         secondlast=secondlast.next;
//         last=last.next;

//      }
//      secondlast.next=null;
//     }
//  }