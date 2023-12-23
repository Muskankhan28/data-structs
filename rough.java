import java.util.ArrayList;
public class rough {








    
}

//     static class stack{
//         static ArrayList<Integer>list = new ArrayList<>();
//         public static boolean isempty(){
//             return list.size() == 0;
//         }
//         public static void push(int data){
//             list.add(data);
//         }
//         public static int pop(){
//             if(isempty()){
//                 return -1;
//             }
//             int top = list.get(list.size()-1);
//             list.remove(list.get(list.size()-1));
//             return top;
//         }
//         public static int peek(){
//             if(isempty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }

//     }
//     public static void main(String args[]){
//         stack stc = new stack();
//         stc.push(1);
//         stc.push(2);
//         stc.push(3);
//         stc.push(4);

//         while(!stc.isempty()){
//             System.out.println(stc.peek());
//             stc.pop();
//         }

//     }

// }


































//     public static int containsmaxwater(ArrayList<Integer>list){
//         int lp = 0;
//         int rp = list.size()-1;
//         int height = 0;
//         int maxwater =0;
//         while(lp<=rp){
//              height= Math.min(list.get(lp),list.get(rp));
//              int width = rp-lp;
//              int currentwater = height*width;
//              maxwater= Math.max(maxwater,currentwater);
             
//               if(lp<rp){
//                 lp++;
//               }
//               else{
//                 rp--;

//               }
          
//         }
//           return maxwater;

//     }
//     public static void main(String args[]){
//         int height [] = {1,8,6,2,5,4,8,3,7};
//         ArrayList<Integer>list = new ArrayList<>();
//         for(int i:height){
//             list.add(i);
//         }
//         System.out.println(containsmaxwater(list));



//     }
// }

    

      
    //     int rows = 5;
    //     for(int i=1;i<=rows;i++){
    //         for(int j=1;j<=rows;j++){
    //             if(i==1||i==2||i==4||i==5||j==5||j==4||j==2||j==1){
    //                 System.out.print("*");

    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
        


    //     }

    // int rows =5;
    // for(int i=1;i<=rows;i++){
    //     for(int j=1;j<=rows;j++){
    //         if(i==1||i==2||i==4||i==5||j==3){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();

    // }
    //  }
    // }
    

