// public class mergsortLL {
//     public static void main(String args[]){
//         LL list = new LL();
//         list.addfirst(8);
//         list.addfirst(4);
//         list.addfirst(6);
//         list.addfirst(2);
//         list.printlist();
//         System.out.println();
//         list.head = list.mergesort(list.head);
//         list.printlist();




//     }

    
// }
// class LL{
//     node head;

//     class node{
//         int data;
//         node next;
//         node(int data){
//             this.data=data;
//             this.next=next;
           
//         }
        
//     }
//     public void addfirst(int data){
//         node newNode = new node (data);
//         if(head == null){
//             head=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
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
//     public node mergesort(node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//             node mid = getmid(head);
//             node righthead = mid.next;
//             mid.next =null ;
//             node newleft = mergesort(head);
//             node newright = mergesort(righthead);
//             return mergedLL(newleft, newright);
            
        
        

//     }
//     public node getmid (node head){
//         node slow = head;
//         node fast = head.next;
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     public node mergedLL(node head1,node head2){
//         node mergeLL = new node(-1);
//         node temp = mergeLL;
//         while(head1 != null && head2 != null){
//             if(head1.data <= head2.data){
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp=temp.next;
//             }
//             else{
//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }
//         }
//             while(head1 !=null){
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp=temp.next;

//             }
//             while(head2 !=null){
//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;

//             }
//             return mergeLL.next;
//         }
        

//     }


