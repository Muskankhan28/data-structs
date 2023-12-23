// public class bopo {
//     public static void main(String args[]){
//         LL list =new LL ();
//     //     list.addfirst("twenty");
//     //     list.addfirst("one");
//     //     list.addfirst("three");
//     //     list.addfirst("one");
//     //     list.addfirst("twenty");
//     //    list.removefirst();
//     //     list.printlist();
//     //     System.out.println();
//     //     list.printlist();
//     //     list.reverselinkedlist();
//     //     System.out.println();
//     //     list.printlist();
//     //     System.out.println();
//     //     // System.out.println(list.getSize());
//     //     list.deletdenthnode(2);
//     //     list.printlist();
//     //    System.out.print(list.lsll("two"));
//     //   list.printlist();
//     //   System.out.println();
//     //   System.out.println(list.lslli("twenty"));
//     //    list.insertatmiddle(3, "twentyone");
//     //    list.printlist();
//     //    System.out.println();
//     //    System.out.println(list.checkllispalindrome());
    

//     }
    
// }
// class LL{
//     node head;
//     private int size;
//     LL ( ){
//         this.size=0;

//     }

//     class node{
//         String data;
//         node next;
//         node(String data){
//             this.data=data;
//             this.next=null;
//              size++;
//         }
        
//     }
//     public void addfirst(String data){
//         node newNode = new node (data);
//         if(head == null){
//             head=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addlast(String data){
//         node newNode = new node (data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         node currentNode = head;
//         while(currentNode.next!=null){
//             currentNode = currentNode.next;


//         }
//         currentNode.next=newNode;
//     }
//     public void printlist(){
//         if(head==null){
//             System.out.print("list is empty");
//         }
//         node currentNode = head;
//         while(currentNode!=null){
//             System.out.print(currentNode.data+"->");
//            currentNode= currentNode.next;
//         }
//         System.out.print("null");
        

//     }
//     public void removefirst(){

//         if(head==null){
//             System.out.println("list is empty");
//             return;

//         }
//         size--;
//         head=head.next;
//     }
//     public void removelast(){
//         if(head==null){
//             System.out.print("list is empty");
//             return;
//         }
//         size--;
//         if(head.next==null){
//             head=null;
//             return;
//         }
//         node secondlastNode =head;
//         node lastNode=head.next;
//         while(lastNode.next!=null){
//             secondlastNode=secondlastNode.next;
//             lastNode=lastNode.next;
//         }
//         secondlastNode.next=null;
//     }
//     public void reverselinkedlist(){
//         if(head==null || head.next == null){
//             return;
//         }
//         node previousNode =head;
//         node currentNode=head.next;
//         while(currentNode!=null){
//             node nextNode = currentNode.next;
//             currentNode.next =previousNode;
//             previousNode=currentNode;
//             currentNode=nextNode;

//         }
//         head.next=null;
//         head=previousNode;
//     }
//     public int getSize(){
//         return size;

//     }
      

//    public void deletdenthnode(int n){
//     int size2 = 0;
//     node currentNode = head;
//     while(currentNode != null){
//         currentNode = currentNode.next;
//         size2++;
//     }
//     if(n==size2){
//         head=head.next;
//         return;
//     }
//     int i=1;
//     int IndexFromFirst =size2-n;
//     node previousNode = head;
//     while(i<IndexFromFirst){
//         previousNode=previousNode.next;
//         i++;
//     }
//     previousNode.next=previousNode.next.next;
//     return ;
//    }
//    public boolean lsll(String target){
//     node SearchNode =head;
//     while(SearchNode!=null){
//         if(SearchNode.data ==target){
//             return true;
//         }
//         SearchNode= SearchNode.next;
//     }
//     return false;
//    }
//    public int lslli(String target){
//     node SearchNode=head;
//     int IndexFromFirst=0;
//     while(SearchNode!=null){
//         if(SearchNode.data==target){
//             return IndexFromFirst;
//         }
//         SearchNode = SearchNode.next;
//         IndexFromFirst++;
//     }
//     return -1;

// }


//    public void insertatmiddle(int idx,String data){
//     node newNode = new node(data);
//     node previousNode = head;
//     int i=0;
//     while(i<idx-1){
//         previousNode = previousNode.next;
//         i++;
//     }
//     newNode.next = previousNode.next;
//     previousNode.next = newNode;
//     }

//     public node findmid(node head){
//         node slow = head;
//         node fast = head;
//         while(fast!=null && fast.next!=null ){
//             slow = slow.next;
//             fast = fast.next;
//         }
//         return slow;
//     }
//     public  boolean checkllispalindrome(){
//         if(head == null && head.next == null){
//             return true;
//         }
//         node MidNode = findmid(head);
//         node previousNode = null;
//         node currentNode = MidNode;
//         node nextNode;
//         while(currentNode!=null){
//             nextNode = currentNode.next;
//             currentNode.next=previousNode;
//             previousNode=currentNode;
//             currentNode=nextNode;
//         }
//         node rightNode = previousNode;
//         node leftNode = head;
//         while(rightNode!=null){
//             if(leftNode.data!=rightNode.data){
//                 return false;
//             }
//             leftNode = leftNode.next;
//             rightNode = rightNode.next;
//         }
//         return true;


//     }
   
//     public boolean iscycle(){
//         node slow = head;
//         node fast = head;
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){
//                 return true;
//             }
           
//         }
//         return false;

//     }
//     public void removecycle(){
//         node slow = head;
//         node fast = head;
//         boolean cycle= false;
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){
//                 cycle = true;
//                 break;
//             }

//         }
//         if(cycle == false){
//             return;
//         }
//         slow =head ;
//         node previousnode = null;
//         if(slow!=fast){
//             previousnode = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }
//         previousnode.next = null;
//     }
  
//     }

    



    
   
    

    
   




