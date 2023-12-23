public class bubull {
    public static void main(String args[]){
        LL list = new LL();
      

    
        list.addfirst(1);
        list.addlast(2);
        list.addlast(6);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.addlast(6);
        list.printlist();
        System.out.println();
       System.out.println( list.findsizell());
  
        
       
        
        // list.printlist();
        // // list.removefirst();
        // // list.removelast();
        // System.out.println();





        //  list.printlist();  
        // list.reverselinkedlist();
        //  list.printlist();
        // System.out.print( list.searchkey(4));
        // list.printlist();
        // System.out.println();
        // System.out.print(list.findmid());
        // list.insertatmid(29, 3);
        // list.printlist();
        // list.detectloopinalinkedlist();
        // list.removelinkedlistelement(6);
        // list.printlist();
     
       
       

        

    }
    
}
class LL{
    node head;
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int findsizell(){
        if(head == null ){
            return 0;
        }
        node currentNode = head ;
        int size = 1;
        while(currentNode.next != null){
            currentNode = currentNode.next;
            size++;
        }
        return size;

    }
  
































    public void addfirst(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addlast(int data){
         node newNode = new node(data);
         if(head == null){
            head = newNode;
            return;
         }
          
         node currentNode = head;
         while(currentNode.next != null){
            currentNode = currentNode.next;
         }
         currentNode.next = newNode;

    }
    public void printlist(){
        if(head == null){
            System.out.print("'list is empty");
        }
        node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }
    public void removefirst(){
        if(head == null){
            System.out.print("list is empty");
        }
        head = head.next;
    }
    public void removelast(){
        if(head == null){
            System.out.print("list is empty");
        }
        if(head.next == null){
            head = null;
        }
        node previousNode = head;
        node currentNode = head.next;
        while(currentNode.next != null){
            currentNode = currentNode.next;
            previousNode = previousNode.next;

        }
        previousNode.next = null;
    }
   



    // REVERSE A LINKEDLIST

    public void reverselinkedlist(){
        if(head == null || head.next == null){
            return;
        }
        node previousNode = head;
        node currentNode = head.next;
        while(currentNode != null){
            node nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;

        }
        head.next = null;
        head = previousNode;

        }
        // SEARCHING INDEX IN A LINKED LIST

        public  int searchkey(int key){
            node searchNode = head;
            int indx = 0;
            while(searchNode != null){
               
                if(searchNode.data == key){
                    return indx;

                }
                searchNode = searchNode.next;
                indx++;
            }
            return -1;
           
        }

        // FIND MID OF A LINKEDLIST

       public int findmid(){
        node slowNode = head;
        node fastNode = head;
        while(fastNode!=null && fastNode.next!=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        return slowNode.data;
       }

    //     INSERT AT MIDDLE OF A LINKEDLIST
       public void insertatmid(int data , int index){
    
        int i=1;
        node newNode = new node(data);
        node previousNode = head;
        while(i<index){
            previousNode = previousNode.next;
           
            i++;
        }
        newNode.next = previousNode.next;
        previousNode.next = newNode;
       }
       public boolean detectloopinalinkedlist(){
        node slowNode = head;
        node fastNode = head;
        while(fastNode !=null && fastNode.next !=null ){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode){
                return true;
            }
            
        }
        return false;
      

       }
    }
