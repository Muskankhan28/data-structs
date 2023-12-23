import java.util.*;

public class rvsn{ 
    


    
}





//     public static void main(String args[]){

//         int arr[] = { 10,2,-2,-20,10};
//         int k = -10;

//         HashMap<Integer,Integer> map = new HashMap<>();
//         int sum = 0;
//         int ans = 0;
//         map.put(0,1);

//         for(int j=0;j<arr.length;j++){
//             sum+=arr[j];
//             if(map.containsKey(sum-k)){
//                 ans += map.get(sum-k);
//               }
//             else{
//                 map.put(sum , map.getOrDefault(sum, 0) +1);

//             }
//         }
//         System.out.print(ans);
//     }
// }
















     

//     public static void main(String args[]){
       
//         int arr[] = { 15,-2,2,-8,1,7,10,23};

//         int sum  = 0;
//         int len  = 0;

//         HashMap<Integer,Integer>map = new HashMap<>();

//         for(int j=0 ; j<arr.length ; j++){

//             sum+=arr[j];

//             if(map.containsKey(sum)){
//                 len = Math.max(len , j-map.get(sum));
//             }
//             else{
//                 map.put(sum , j);

//             }
            
//         }
//         System.out.print(len);
//     }
// }

 


































//     public static String getfirst(HashMap<String,String>map){
//         HashMap<String,String>revmap = new HashMap<>();

//         for(String key:map.keySet()){
//             revmap.put(map.get(key), key);


//         }
//         for(String key:map.keySet()){
//             if(!revmap.containsKey(key)){
//                 return key;
                

//             }
//         }
       
       
//         return null;




//     }
//     public static void main(String args[]){
//         HashMap<String,String>map = new HashMap<>();

//         map.put("chennai","bengaluru");
//         map.put("mumbai","delhi");
//         map.put("goa","chennai");
//         map.put("delhi","goa");
        

       


//         String start = getfirst(map);
//         System.out.print(start);
     
//         for(String key:map.keySet()){
               
//             System.out.print("->" + map.get(start));
//             start = map.get(start);
//         }
        


        


//     }
    
// }
