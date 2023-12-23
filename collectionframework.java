import java.util.ArrayList;
import java.util.List;

public class collectionframework {
    public static void main(String args[]){
//         List<Integer>list = new ArrayList<>();
//         list.add(90);                // this will add elements in the list . TIME COMPLEXITY O(n)
//         list.add(28);
//         list.add(33);
//         list.add(78);
//         list.add(69);
//         list.add(43);
//         list.add(21);
//         list.add(55);
//         list.add(45);


//         System.out.println(list);

//     list.set(2,99);    // this is used to changed the value at a particular index

//   System.out.println(list);






    //     list.remove(3);                 // this will remove the element which is present in the index 3

    //     System.out.println(list);

    //     list.remove(Integer.valueOf(55));  // this will remove the element 55 from the list. TIME COMPLEXITY O(n)
    //     System.out.println(list);


    //    list.clear();                       // this will remove all the elements present in the list
    //    System.out.print(list);

      
  



        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(3);
        System.out.println(list);

        list.add(9);             // this will add 9 at the end of the list
        System.out.println(list);
        

        list.add(0, 28);    // this will add 28 at 0 index
        System.out.println(list);

        List<Integer>newList = new ArrayList();  // cretaing a new list
        newList.add(170);
        newList.add(190);
        list.addAll(newList);             // this will add all the element in the list
        System.out.println(list);


        System.out.println(list.get(4));   // this will give you the element which is present in the 4th index

    }
    
}
