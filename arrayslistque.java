import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class arrayslistque {
}
    

   



  


































 
      // PAIRSUM2 FOR SORTED AND ROTATED ARRAY

    // public static boolean pairsum(ArrayList<Integer>list,int target){
       
    //     int bp = -1;
    //      int n = list.size();
    //     for(int i=0;i<list.size();i++){
    //         if(list.get(i)>list.get(i+1)){
    //             bp = i;
    //             break;
    //         }
    //     }
    //         int lp=bp+1;
    //         int rp=bp;
    //         while(lp!=rp){
    //             if(list.get(lp)+list.get(rp)==target){
    //                 return true;
    //             }
    //             if(list.get(lp)+list.get(rp)<target){
    //                 lp  =(lp+1)%n;

    //             }
    //             else{
    //                 rp = (n+rp-1)%n;
    //             }
    //         }
           
        
            
        
    //      return false;
     
    // }
    // public static void main(String[] args) {
    //     ArrayList<Integer>list = new ArrayList<>();
    //     list.add(11);
    //     list.add(15);
    //     list.add(6);
    //     list.add(8);
    //     list.add(9);
    //     list.add(10);

    //     int target=16;
    //     System.out.println(pairsum(list, target));
        
        
    // }



    


    // PAIR SUM

    
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5};
    //     int target = 5;
    //     ArrayList<Integer>list = new ArrayList<>();
    //     for(int i: arr){
    //         list.add(i);
    //     }
    //     int lp = 0;
    //      int rp=list.size()-1;
    //      while(lp!=rp){
    //         if(list.get(lp)+list.get(rp)==target){
    //             System.out.println("(" + list.get(lp) + " , "+ list.get(rp) + ")");
    //         }
    //         if(list.get(lp) + list.get(rp) < target){
    //             lp++;
    //         }
    //         else{
    //             rp--;
    //         }
         
    //      }
        

    

       
        
    // }


 
    // OPTIMISED APPROCH

    // USING 2 POINTER


    public static int containsmaxwater( ArrayList<Integer>height){
        int maxwater = 0;
        int lp =0;
        int rp = height.size()-1;
        
        while(lp<rp){

            int hgt = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currentwater = hgt*width;


            maxwater = Math.max(maxwater,currentwater);
            if(lp<rp){
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxwater;
       
    }



     

    public static void main(String[] args) {
          
        int arr[]={1,8,6,2,5,4,8,3,7};
        ArrayList<Integer>height = new ArrayList<>();
        for(int i:arr){
        height.add(i);
        }
        System.out.println(containsmaxwater(height));
       
      

        
    }
}

        






// CONTAINER WITH MOST WATER 
  

             // BRUTFORCE APPROACH 

   



//     public static int containsmaxwater(ArrayList<Integer>height){
//         int maxwater = 0;

//         for(int i=0;i<height.size();i++){

//             for(int j=i+1;j<height.size();j++){

//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j-i;
//                 int currentwater = ht*width;
//                 maxwater = Math.max(maxwater,currentwater);

//             }
            

//         }
//         return maxwater;
//     }



//     public static void main(String[] args) {
//         int arr[]={1,8,6,2,5,4,8,3,7};
//         ArrayList<Integer>height = new ArrayList<>();
//         for(int i:arr){
//         height.add(i);
//         }
//        System.out.println(containsmaxwater(height));

        
//     }
// }






//     public static void main(String[] args) {
//         ArrayList<Integer>list = new ArrayList<>();
//         list.add(8);
//         list.add(1);
//         list.add(5);
//         list.add(3);
//         list.add(7);


//         Collections.sort(list);  // THIS FUNCTION WILL SORT THE LIST IN THE ASCENDING ORDER
//         System.out.println(list);

//         Collections.sort(list, Collections.reverseOrder()); // THIS FUNCTION WILL SORT THE LIST IN THE DSCENDING ORDER
//         System.out.print(list);

        
//     }
// }






          // SWAP TWO VALUES IN AN ARRAYLIST





//     public static void swaparraylist(ArrayList<Integer>list,int idx1,int  idx2){
//         int temp = list.get(idx1);
//         list.set(idx1,list.get(idx2));
//         list.set(idx2,temp);


//     }
//     public static void main(String[] args) {
//         ArrayList<Integer>list = new ArrayList<>();
//         list.add(9);
//         list.add(8);
//         list.add(7);
//         list.add(6);
//         list.add(5);


//         int idx1 = 2;
//         int idx2 = 4;

//         System.out.println(list);
//         swaparraylist(list, idx1, idx2);
//         System.out.print(list);

        
//     }
// }






//     public static void main(String args[]){
//         ArrayList<Integer>list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);
//         list.add(1);

//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<list.size()-1;i++){
//             if(list.get(i)>largest){
//                 largest=list.get(i);
//             }
//         }
//         System.out.print(largest);

//     }
// }


   



// TO FIND LARGEST IN AN ARRAYLIST  







//     public static void main(String args[]){

//         int arr[] ={1,2,9,5,7,3,4,8};

//         ArrayList<Integer>list = new ArrayList<>();

//         for(int i:arr){
//             list.add(i);
//         }

//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<list.size()-1;i++){
//             if(list.get(i)>largest){
//                 largest = list.get(i);
//             }
//         }
//         System.out.print(largest);
//     }
// }




    // REVERSING AN ARRAY USING ARRAYLIST


//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5,6,7,8,9};
//         ArrayList<Integer>list = new ArrayList<>();

//         for(int i:arr){
//             list.add(i);
//         }
//         for(int i=list.size()-1;i>=0;i--){
//             System.out.print(list.get(i) + " ");
//         }
//      }
// }
