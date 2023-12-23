import java.util.*;

  public class hashsetque {
    public static void main(String args[]){
        int arr[] = {10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer>map = new HashMap<>();
        int sum =0;
        int ans =0;
        for(int j=0;j<arr.length;j++){
            sum +=arr[j];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
             map.put(sum ,map.getOrDefault(sum, 0)+1);
            
        }
        System.out.print((ans));
    }
  }



//     public static void main(String args[]){
//         int arr[]={ 15,-2,2,-8,1,7,10,23};
//         HashMap<Integer,Integer>map = new HashMap<>();
//         int sum = 0 ;
//         int len = 0 ;
//         for(int j=0;j<arr.length;j++){
//             sum = sum+arr[j];
//             if(map.containsKey(sum)){
//                 len = Math.max(len,j-map.get(sum));
//             }
//             else{
//                 map.put(sum,j);
//             }
//         }
//         System.out.println(len);

      
//     }
// }





//     public static String getstart(HashMap<String,String>map){
//         HashMap<String,String>revmap = new HashMap<>();
//         for(String key: map.keySet()){
//             revmap.put(map.get(key),key);
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

//         String start = getstart(map);
//         System.out.print(start);
      
//         for(String key : map.keySet()){
//             System.out.print( "->"+ map.get(start));
//             start = map.get(start);

//         }
//         System.out.println();

//     }
// }


 


    // public static String getstart( HashMap<String,String>map){
    //      HashMap<String,String>revmap = new HashMap<>();
    //      for(String key:map.keySet()){
    //         revmap.put(map.get(key),key);
    //      }
    //      for(String key:map.keySet()){
    //         if(!revmap.containsKey(key)){
    //             return key;
    //         }

    //      }
    //      return null;

        
    // }
    // public static void main(String args[]){
    //     HashMap<String,String>map = new HashMap<>();
    //     map.put("chennai" , "benguluru");
    //     map.put("mumbai","delhi");
    //     map.put("goa","chennai");
    //     map.put("delhi","goa");

    //     String start = getstart(map);
    //     System.out.print(start);
    //     for(String key : map.keySet()){
    //         System.out.print("->" + map.get(start));
    //         start = map.get(start);
    //     }
    //     System.out.println();



    // }

// }




    // INTERSECTION 




    // public static void main(String[] args) {
    //     int arr1[]={7,3,9};
    //     int arr2[]={6,3,9,2,9,4};
    //     HashSet<Integer>set = new HashSet<>();

    //     for(int i=0;i<arr1.length;i++){
    //         set.add(arr1[i]);

    //     }
    //     int count =0;
    //     for(int j=0;j<arr2.length;j++){
    //         if(set.contains(arr2[j])){
    //             count++;
    //             set.remove(arr2[j]);
    //             System.out.print((arr2[j]) + " ");
                

    //         }
    //     }
        
        






        //union

        // HashSet<Integer>set = new HashSet<>();
        // for(int i=0;i<arr1.length;i++){
        //     set.add(arr1[i]);
        // }
        // for(int j=0;j<arr2.length;j++){
        //     set.add(arr2[j]);
        // }
        // System.out.println(set.size());
        // System.out.print(set);
    










//     public static void main(String[] args) {
//         int nums[] = {4,3,2,5,6,7,3,4,2,1};

//         HashSet<Integer>set = new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             set.add(nums[i]);
//         }
//        System.out.print( set.size());
//     }
    
       
    
// }
