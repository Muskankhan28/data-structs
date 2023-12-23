import java.util.*;

public class hashmapque {

    public static boolean isanagram(String a , String b){

        HashMap<Character,Integer>map=new HashMap<>();

        if(a.length() == b.length()){
            return false;
        }

        for(int i=0;i<a.length();i++){
            if(map.containsKey(a.charAt(i))){
                map.put(a.charAt(i),map.get(a.charAt(i)) +1);
            }
            else{
                map.put(a.charAt(i),1);
            }
        }

        for(int j=0;j<b.length();j++){
            if(map.get(b.charAt(j))!=null){
                if(map.get(b.charAt(j))== 1){
                    map.remove(b.charAt(j));
                }
                else{
                    map.put(b.charAt(j), map.get(b.charAt(j))-1);
                }
            }
            else{
                return false;
            }
        }
        return  map.isEmpty();



    }

    public static void  main(String args[]){
        String a ="aab";
        String b ="bba";
        System.out.println(isanagram(a, b));
    }
}





































    


        
//         HashMap<Character,Integer>map = new HashMap<>();
//         for(int i=0;i<a.length();i++){
//             if(map.containsKey(a.charAt(i))){
//                 map.put(a.charAt(i),map.get(a.charAt(i) ) + 1);
//             }
//             else{
//                 map.put(a.charAt(i) , 1);
//             }

//         }
//         for (int j=0;j<b.length();j++){
//             if(map.get(b.charAt(j))!= null){
//                 if(map.get(b.charAt(j))==1){
//                     map.remove(b.charAt(j));
//                 }
//                 else{
//                     map.put(b.charAt(j),map.get(b.charAt(j))-1);
//                 }
               
//             }
//             else{
//                 return false;
//             }
         

//         }
//         return map.isEmpty();
//     }


//     public static void main(String args[]){

//         String a = "aab";
//         String b = "baa";
//         System.out.println(isanagram(a, b));  

       
    





//         int arr [] ={1,3,2,5,1,3,1,5,1};
//         HashMap<Integer,Integer>map = new HashMap<>();

//         for(int i=0;i<arr.length;i++){

//             if(map.containsKey(arr[i])){
//                 map.put(arr[i] ,map.get(arr[i])+1);
//             }
//             else{
//                 map.put(arr[i],1);
//             }
//         }
//         for(Integer i: map.keySet()){
//             if(map.get(i)> arr.length/3){
//                 System.out.print(i);
//             }
//         }
   
// }
// }
