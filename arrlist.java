import java.util.ArrayList;
import java.util.Collections;


public class arrlist {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();

        // add function  


        list.add("one");
        list.add("six");
        list.add("three");
        list.add("nine");
        list.add("two");
        System.out.println(list);
        // add function at a particular index

        list.add(3, "five");
        System.out.println(list);

       // set function


        list.set(4, "zero");
        System.out.println(list);

        // remove function


        list.remove(0);
        System.out.println(list);
     
           // loops 


        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");

        }
        System.out.println();

           // sorting


        Collections.sort(list);
        System.out.println(list);

         // reverse 

         
        Collections.reverse(list);
        System.out.print(list);


    }
}
       





   
    

    


    
   
