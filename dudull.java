    
    
    // REVISON OF LINKEDLIST


// public class dudull {
//     public static void main(String args[]){
//         LL list = new LL();
//         list.addfirst(1);
//         list.addlast(2);
//         list.addlast(3);
//         list.addlast(8);
//         list.addlast(5);
//         list.addlast(88);
//         list.addlast(28);
//         list.addlast(25);
//         list.addlast(99);
//        // list.printlist();
//         // list.removefirst();
//          list.printlist();
//           System.out.println();
//         //  list.removenthfromlast(3);
//         // list.reverselinkedlist();
//         // list.printlist();
//         //System.out.println( list.searchindex(88));
//         //    list.insertatmiddle(8956, 3);
//         //    list.printlist();
//        System.out.println( list.findmid());
       
        
//         }
    
// }


// class LL{
//     node head;
//     class node{
//         int data;
//         node next;
//         node(int data){
//             this.data = data;
//             this.next = null;
//         }
       
//     }
//      public void addfirst(int data){
//         node newNode = new node(data);
//         if(head == null){
//             head = newNode;
//             return ;

//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addlast(int data){
//         node newNode = new node(data);
//         if(head == null){
//             head = newNode;
//         }
//         node currentNode = head;
//         while(currentNode.next!=null){
//             currentNode = currentNode.next;
//         }
//         currentNode.next = newNode;

//     }

//     public void printlist(){
//         if(head == null){
//             System.out.print("list is empty");
//         }
//         node currentNode = head;
//         while(currentNode!=null){
           
//             System.out.print(currentNode.data + "->" );
//              currentNode = currentNode.next;
//         }
//          System.out.print("null");
       
//     }

//     public void removefirst(){
//         if(head == null){
//             System.out.print("list is empty");
//         }
//         head = head.next;
//     }

//     public void removelast(){
//         if(head == null){
//             System.out.print("list is empty");
//         }
//         if(head.next == null){
//             head = null;
//         }
//         node secondlastNode = head;
//         node lastNode = head.next;
//         while(lastNode.next!=null){
//             secondlastNode = secondlastNode.next;
//             lastNode = lastNode.next;
//         }
//         secondlastNode.next = null;
//     }


//   // REMOVE NTH NODE FROM THE LAST 



//   public void removenthfromlast(int n){
//     int size = 0;
//     node currentNode = head;
//     while(currentNode != null){
//         currentNode = currentNode.next;
//         size ++ ;

//     }
//     if(n==size){
//         head = head.next;
//         return ;
//     }
//     int i = 1;
//     int indxtofind = size - n;
//     node previousNode = head;
//     while(i<indxtofind){
//         previousNode = previousNode.next;
//         i++;

//     }
//     previousNode.next = previousNode.next.next;
//     return ;
//   }


//   // RECVERSE A LINKEDLIST

//    public void reverselinkedlist(){
//     if(head == null || head.next ==null){
//         return;
//     }
//     node previousNode = head;
//     node currentNode = head.next;
//     while(currentNode !=null){

//         node nextNode = currentNode.next;
//         currentNode.next = previousNode;
//         previousNode = currentNode;
//         currentNode = nextNode;


//     }
//     head.next = null;
//     head = previousNode;
  
//     }

//     public int searchindex(int key){
//         node searchNode = head;
//         int indx = 0;
//         while(searchNode!=null){
//             if(searchNode.data == key){
//                 return indx ;

                

//             }
//              searchNode = searchNode.next;
//              indx++;
             
           
//         }
//         return -1;
      
//     }
//     public void insertatmiddle(int data , int indx){
//         int i=1;
//         node newNode = new node(data);
//         node previousNode = head;
//         while(i<indx){
//             previousNode = previousNode.next;
//             i++;
    
//         }
//         newNode.next = previousNode.next;
//         previousNode.next = newNode;

//     }

//    public int findmid(){
//     node slowNode = head ;
//     node fastNode = head;
//     while(fastNode != null && fastNode.next !=null){
//         slowNode = slowNode.next;
//         fastNode = fastNode.next.next;

//     }
//     return slowNode.data;
//    }

//    public boolean  detectloopinlinkedlist(){

//     node slowNode = head;
//     node fastNode = head;
//     while(fastNode !=null && fastNode.next !=null){
//         slowNode =  slowNode.next ;
//         fastNode = fastNode.next.next;
//         if(slowNode == fastNode){
//             return true; 
//         }

//     }
//     return false;
    

//    }

   

//    }

 
 

