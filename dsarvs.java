import java.util.*;

public class dsarvs {

    public static boolean findduplicate(int arr[]){

         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) +1 );

            }
            else{
                map.put(arr[i], 1);

            }

        }
        for(int key:map.keySet()){
            if(map.get(key)>1){
                return true;

            }
        }
        return false;

    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        int count=0;

       

        System.out.print(findduplicate(arr));


    }
}

//     public static void swap(int num1 , int num2){
       


//         num1 = num1+num2;
        
//         num2=num1-num2;
//         num1=num1-num2;
//         System.out.println(num1);
//          System.out.println(num2);
        
        
//     }
//     public static void main(String args[]){
//             int num1 = 6;
//             int num2 = 9;

//             swap(num1,num2);
          
            

          
     



//     }
// }

//         String a = "a  k s  h    a   t";
//         a=a.replaceAll("[^A-Za-z0-9]","");
//         System.out.print(a);



//     }

// }
        // String a ="a@k@s@h@a@t";
        // a=a.replaceAll("[^A-Za-z0-9]","");
        // System.out.print(a);


//         int arr[] ={1,2,3,4,5,6,7};
//         int start = 0;
//         int end  = arr.length-1;

//         while(start<=end){
//             int temp =arr[start];
//             arr[start] =arr[end];
//             arr[end] = temp;

//             start++ ;
//             end-- ;

//         }

//         for(int i:arr){
//             System.out.print(i + " ");
//         }
        


//     }
    
// }
