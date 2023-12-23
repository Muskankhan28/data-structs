import java.util.ArrayList;

public class arrayslist {

    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();

    //     // add function -> 0(1)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // list.add(1,11);  // adding element at a particular index 
        System.out.println(list);


        System.out.println(list.size());



         // get function -> 0(1)

        int element = list.get(2);
        System.out.print(element);
        
        // remove function -> 0(n)

        list.remove(2);
        System.out.print(list);
  
        // set function -> 0(n)

        list.set(3,44);
        System.out.print(list);


         // contains function -> 0(n)

            System.out.println(list.contains(9));
            System.out.println(list.contains(1));


         //  printing an array list 

    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i) + " ");
    }











    }
    
}
