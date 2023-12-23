import java.util.*;

public class hqr {
    public static void main(String args[]){
         int arr[] = {-2,-6,76,-1,-8,99};
         int currentsum = 0;
         int maxsum = Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
            currentsum = Math.max(currentsum+arr[i], arr[i]);
            maxsum = Math.max(maxsum, currentsum);
            

         }
         System.out.println(maxsum);
        
    }
}
  





























//     public static void main(String args[]){
//         // max sum sub array with tc==O(n) u bad boie me good boie

//         int arr[] = {-2,-6,76,-1,-8,99};
//         int currentsum = 0;
//         int maxsum =Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             currentsum = Math.max(currentsum+arr[i],arr[i]);
//             maxsum =Math.max(maxsum,currentsum );

//         }
//         System.out.println(maxsum);

//     }
// }
   
//     public static void main(String args[]){
//         int n = 123321;
//         int temp = n;
//         int m = 0;
//         while(n>0){
//             m =m*10+n%10;
//             n =n/10;
//         }
//         System.out.println(temp==m);
    
//     }
// }
        































//     public static boolean isarmstrong(int n){
//         int temp = n;
//         int digit = 0;
//         int sum = 0;
//         while(n!=0){
//             digit = n%10;
//             sum += digit*digit*digit;
//             n=n/10;
//         }
//         return sum == temp;
//     }
//     public static void main(String args[]){
//         int n =153;
//         System.out.println(isarmstrong(n));

//     }
// }






























//     public static boolean isprime(int n){
//         for(int i=2;i<n;i++){
//             if(n%i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         int n = 69;
//         System.out.println(isprime(n));
//     }
 

// }
  


































//     public static boolean isanagram(String a , String b){
//           HashMap<Character,Integer>map = new HashMap<>();
//           if(a.length() !=b.length()){
//             return false;
//           }

//         for(int i=0;i<a.length();i++){
//             if(map.containsKey(a.charAt(i))){
//                 map.put(a.charAt(i),map.get(a.charAt(i))+1);
//             }
//             else{
//                 map.put(a.charAt(i) , 1);
//             }
            
//         }
//         for(int j=0;j<b.length();j++){
//             if(map.get(b.charAt(j))!=null){
//                 if(map.get(b.charAt(j)) == 1){
//                     map.remove(b.charAt(j));
//                 }
//             else{
//                 map.put(b.charAt(j),map.get(b.charAt(j))-1);
//             } 
//         }
//         else{
//             return false;
//         }
       

       
//     }
//      return map.isEmpty();
// }
//     public static void main(String args[]){
//         String a = "aab";
//         String b = "bba";
//         System.out.println(isanagram(a, b));
      
//     }

// }









































//     public static boolean isarmstrong(int n){
//         int digit = 0;
//         int temp = n ;
//         int sum = 0;
//         while(n!=0){
//             digit = n%10;
//             sum += digit*digit*digit;
//             n=n/10;
            

//         }
//         return sum == temp;
       

       
//     }
//     public static void main(String args[]){
//         int n = 153;
//         System.out.println(isarmstrong(n));

//     }
// }































//     public static boolean isanagram(String s,String p){
//         if(s.length()!=p.length()){
//             return false;
//         }
//          HashMap<Character,Integer>map = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             if(map.containsKey(s.charAt(i))){
//                 map.put(s.charAt(i),map.get(s.charAt(i))+1);
//             }
//             else{
//                 map.put(s.charAt(i),1);
//             }
//         }
//         for(int j=0;j<p.length();j++){
//         if(map.get(p.charAt(j))!=null){
//              if(map.get(p.charAt(j))==1){   
//                   map.remove(p.charAt(j));
              

//             }
//             else{
              
//                   map.put(p.charAt(j),map.get(p.charAt(j))-1);
//             }
//         }else {
//             return false;
//         }
//         }
//         return map.isEmpty();

      

//     }
   
//     public static void main(String args[]){
//         String s = "aab";
//         String p = "abb";
//         System.out.println(isanagram(s, p));
       
        
//     }
// }
























    // public static boolean ispalindrome(String s){
    //      s=s.toLowerCase();
    //      s=s.replaceAll("[^A-Za-z0-9]","");
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)!=s.charAt(s.length()-1-i)){
    //             return false;
    //         }
    //     }
    //     return true;

    // }
    // public static void main(String args[]){
    // String s ="A man, a plan, a canal: Panama";
    // System.out.println(ispalindrome(s));
   


    
//     }
// }























//     public static boolean ispalindrome(String s){
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)!=s.charAt(s.length()-1-i)){
//                 return false;
//             }

//         }
//         return true;
//     }
//     public static void main(String args[]){
//         String s ="mAdam";
//          s = s.toLowerCase();
//         System.out.println(ispalindrome(s));



//     }
// }


















//         String s = "mutti";
//         String p= "";
       
//         for(int i=s.length()-1;i>=0;i--){
//             p += s.charAt(i);

        
//         }
//         System.out.println(p);
//     }
// }
















//         St+ring s = "mutti";
//         for(int i=s.length()-1;i>=0;i--){
//             System.out.print(s.charAt(i));
//         }
//     }
// }

























//        int arr[]={1,2,3,4,5};
//        int maxsum = 0;
      
//        for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//             int currentsum = 0;
//             for(int k=i;k<=j;k++){
//                 currentsum += arr[k];
//                 maxsum = Math.max(maxsum,currentsum); 
                 

//             }

//         }

//     }
//     System.out.println(maxsum);

// }
// } 


























//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5,6,7,8,9};
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 for(int k=i;k<j;k++){
//                     System.out.print(arr[k]);

//                 }
//             System.out.println();
//             }
        
//         }
        
//     }
// }










//     public static int linearsearch(int arr[],int temp){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==temp){
//                 return i;
//             }
//         }
//         return -1;
//     }
//    public static void main(String args[]){
//     int arr[] = {1,2,3,4,5,6,7,8};
//     int temp = 5;
//     System.out.println(linearsearch(arr, temp));
//    }
// }

























//     public static int binarysearch(int arr[],int temp){
//         int start = 0;
//         int end = arr.length-1;
//         while(start<=end){
//             int mid = (start+end)/2;
//             if(arr[mid]==temp){
//                 return mid;
//             }
//             else if(arr[mid]<temp){
//                 start = mid+1;
//             }
//             else{
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }


//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5,6};
//         int temp = 6;
//         System.out.println(binarysearch(arr, temp));
//     }
// }
   











        // int arr[] = {1,2,3,4,5,5,5,6,6,6,6,6,7,7,7,8,8};
        // HashMap<Integer,Integer>map = new HashMap<>();
        // int max = Integer.MIN_VALUE;
        // int temp =0;
        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i],map.get(arr[i])+1);
        //     }
        //     else{
        //         map.put(arr[i],1);
        //     }
            
        // }
        // for(Integer key : map.keySet()){
        //     if(map.get(key)>max){
        //        max = map.get(key);
        //        temp = key;
        //     }
        // }
        // System.out.println(temp + "->" + map.get(temp));

    