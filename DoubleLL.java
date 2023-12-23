// import java.util.function.IntFunction;


public class DoubleLL {
    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addfirst(9);
        // dll.print();
        dll.addlast(7);
        dll.addlast(4);
        dll.addlast(3);
        dll.addlast(5);
        dll.addlast(22);
        dll.print();
        dll.removelast();
        dll.print();
       // dll.reversedoublelinkedlist();
        //dll.print();
        //dll.print();
        //System.out.println();
        //dll.removelast();
        // dll.print();
        // dll.print();
        // System.out.print(dll.size);
  
}
    public class Node{
        int data;
        Node next;
        Node previous;
         public Node(int data){
            this.data=data;
            this.next=null;
            this.previous=null;

         }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;

   
    public void addfirst(int data){
    Node newnode = new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
       
    }
    newnode.next = head;
    head.previous = newnode;
    head = newnode;


}
    public void print(){
    Node currentnode = head;
    while(currentnode!=null){
        System.out.print(currentnode.data + "<->");
        currentnode=currentnode.next;

    }
        System.out.println("null");
}
public static void remfrst(){
    if(head==null){
        System.out.println("emptylist");
        return;
    }
    if(head.next==null){
        head=tail=null;
        return;
    }
    head=head.next;
    head.previous=null;

}
//     public int removefirst(){
//     if(head==null){
//         System.out.print("double linked list is empty");
      
//         return Integer.MIN_VALUE;
//     }
//     if(size == 1){
//         int val = head.data;
//         head = tail = null;
//         size--;
//         return val;
//     }
//     int val = head.data;
//     head = head.next;
//     head.previous = null;
//     size--;
//     return val;

// }
   public void addlast(int data){
    Node newnode = new Node(data);
    if(head==null){
        head=tail=newnode;
        return;
       
    }
 Node currentnode = head;
 while(currentnode.next !=null){
    currentnode = currentnode.next;
 }
currentnode.next=newnode;
 newnode.previous = currentnode;
 newnode.next = null;


}
   public static void removelast(){
    if(head==null){
        System.out.print("doubly linked list is empty");
        
        return;
    }
    if(head.next==null){
        head=tail=null;
        return;
    }
    
    Node previousnode =head;
    Node currentnode = head.next;
    while(currentnode.next!=null){
        previousnode=previousnode.next;
        currentnode=currentnode.next;
    }
    currentnode.previous = previousnode;
    previousnode.next = null;

    }
    public void reversedoublelinkedlist(){
         Node previousnode = null;
        Node currentnode = head;

    while(currentnode!=null){

       Node nextnode=currentnode.next;
       currentnode.next = previousnode;
       currentnode.previous= nextnode;
       previousnode=currentnode;
       currentnode=nextnode;

    }
    
    head=previousnode;
}
}
