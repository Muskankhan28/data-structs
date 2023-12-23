import java.util.*;

public class interviewrevs {
    public static boolean ispalindrome(String s){
    }
}
     


    // armstrong 

 
//     public static boolean isnoarmstrong(int n){
//         int temp = n;

//         int sum = 0 ;
//         while(n>0){
        
//             int digit = n%10 ;
//             digit = digit*digit*digit;
//             sum += digit;
//             n=n/10;
            
//         }
//         return sum == temp;
//     }
//     public static void main(String args[]){
//         int n = 153;
//         System.out.println(isnoarmstrong(n));
      


//     }
// }



//         String s = "muskan1234khan";
//         int sum = 0;
//         int count = 0;
//         s=s.replaceAll("[^0-9]","");
//          int num =  Integer.parseInt(s);
//         while(num>0){
//             int digit = num%10;
//             sum +=  digit;
//             num = num/10;
//             count++;

//         }
//        double average = (double)sum/count;
//        System.out.println(average);


//     }
// }


            // count even digits  

//     public static void main(String args[]){
//         int n = 123456;
//         int count =0;
//         while(n>0){
//             int digit = n%10;
//             if(digit%2==0){
//                 count++;
//             }
//             n=n/10;
//         }
//         System.out.println(count); 
//     }
// }

             // swap two number without creating a third variable


//         int num1=4;
//         int num2=6;
//          num1=num1+num2;

//          num2=num1-num2;
//          num1=num1-num2;
//          System.out.println(num1);
//          System.out.println(num2);


//     }
// }

    


    // no is prime



    // public static boolean isnoprime(int n){
    //      for(int i=2;i<n;i++){
    //         if(n%i==0){
    //             return false;
    //         }
          
    //     }
    //     return true;
        
    // }
    // public static void main(String args[]){
    //     int n = 13;
    //     System.out.println(isnoprime(n));
       
        
    //     }
    // }


    // fibonacci series



//     public static void main(String args[]){
//         int n = 9;
//         int a=0;
//         int b=1;
    
//         System.out.print( a + " " + b + " ");
//         for(int i=1;i<n;i++){
//             int c=a+b;
//             System.out.print(c + " ");
//             a=b; 
//             b=c;

//         }

         

//     }
// }



      








// factorial
 
//         int n=5;
//         int fac = 1 ;
//         for(int i=1;i<=n;i++){
//             fac= fac*i;

//         }
//         System.out.println(fac);
       

//     }

// }


//     public static boolean isduplicatepresent(int arr[]){
//         HashMap<Integer,Integer>map = new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i],map.get(arr[i])+1);
//             }
//             else{
//                 map.put(arr[i],1);
//             }
//         }
//         for(Integer key:map.keySet()){
//             if(map.get(key)>1){
//                 return true;
//             }
//         }
//         return false;
//     }


//    public static void main(String args[]){
//     int arr[] = {1,3,6,1,2,4};
//     System.out.println(isduplicatepresent(arr));
//    }
// } 




//     public static void main(String args[]){
//         int arr[] = {1,1,1,1,2,2,2,3,3,3};
//         int max = Integer.MIN_VALUE;
//         int maxkey = 0;
//         HashMap<Integer,Integer>map = new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i],map.get(arr[i])+1);

//             }
//             else{
//                 map.put(arr[i],1);
//             }
//         }
//         // System.out.print(map);
//         for(Integer key:map.keySet()){
//             if(map.get(key)>max){
//                 max = map.get(key);
//                 maxkey = key;
//             }

//         }
//         System.out.println(maxkey + "->" + max);
        

//     }
// }




    // reverse a string 

    // public static void main(String args[]){
    //     String  s ="mutti";
    //     String p = "";
    //     for(int i=s.length()-1; i>=0;i--){
    //         p +=s.charAt(i);
    //     }
    //     System.out.println(p);
        

        
      
    // }


//}
   


// anagram


//     public static void main(String args[]){
//         int arr[] = {3,4,2,6,8,9,342,689,113};
//         // int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<min){
//                 min = arr[i];
//             }
//         }
//         System.out.println(min);


//     }
// }

// palindrome


//     public static boolean ispalindrome(String s){
//         s=s.toLowerCase();
//         s=s.replaceAll("[^A-Za-z0-9]","");
//         int start = 0;
//         int end = s.length()-1;
//         while(start<=end){
//             if(s.charAt(start) != s.charAt(end)){
               
//                 return false;
//             } 
//              start++;
//              end--;
           
//         }
//         return true;

//     }
//     public static void main(String args[]){
//         String s = "A man, a plan, a canal :Panam";
//         System.out.println(ispalindrome(s));
       
        
       
//     }

// }



















//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};

//         int start = 0;
//         int end =arr.length-1;
//         while(start<=end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//         for(int i:arr){
//             System.out.print(i + " ");
//         }
//     }
// }
 
//     public static void main(String args[]){
//         String s = "muskan246ahmedkhan";
//         s=s.replaceAll("[^0-9]","");
//         int num = Integer.parseInt(s);
//         int sum = 0;
//         int count = 0;
//         while(num>0){
//             int digit = num%10;
//             sum+=digit;
//             num=num/10;
//             count++;
//         }
//         int average = sum/count;
//         System.out.println(average);

//     }
// }
    
   
//     public static boolean ispalindrome(String s){
//         s=s.toLowerCase();
//         s=s.replaceAll("[^A-Za-z0-9]" , "");
//         for(int i=0;i<s.length()/2;i++){
//             if(s.charAt(i)!=s.charAt(s.length()-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         String s = "A man, a plan, a canal :Panam";
//         System.out.print(ispalindrome(s));
//     }
// }
   
    



// BINARY SEARCH
  
//     public static int binarysearch(int arr[] , int key){
//         int start = 0;
//         int end  = arr.length-1;
//         while(start<=end){
//             int mid = (start + end)/2;
//             if(arr[mid] == key ){
//                 return mid;
//             }
//             else if(arr[mid]>key){
//                 end = mid-1;
//             }
//             else{
//                 start = mid+1;
//             }
          
//         }
//         return -1;

//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5,6,7,78,9};
//         int key = 78;
//         System.out.println(binarysearch(arr,key));
     
//     }
// }


  

    // PALINDRONE 


//     public static boolean ispalindrome(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] != arr[arr.length-1-i]){
//                 return false;
//             }
//         }
//         return true;

//     }
//     public static void main(String[] args) {
//         int arr[] = {'m','a','d','a','m'};
//         System.out.println(ispalindrome(arr));
    
        
//     }
// }

    // PRINTING PAIR 


    //     public static void main(String args[]){
    //         int arr[] = {1,2,3,4,5};
    //         for(int i=0;i<arr.length;i++){
    //             for(int j=i;j<arr.length;j++){
    //                 System.out.print("{" + arr[i] + "," + arr[j] + "}");
    //             }
    //             System.out.println();
    //         }
          
            
    //     }
          
    // }
       
















     // PRINTING SUBARRAY


//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5,6};
        
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 for(int k=i;k<=j;k++){
//                     System.out.print(arr[k] +" ");
//                 }
                
//                 System.out.println();
//             }
//         }
       
//     }
// }




    // OPTIMISED APPROACH FOR PRINTING SUBARRAY




//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         int maxsum = 0;
//         int currentsum = 0;
//         for(int i=0;i<arr.length;i++){
//             currentsum = Math.max(currentsum+arr[i],arr[i]);
//             maxsum = Math.max(maxsum,currentsum);
//         }
//         System.out.print(maxsum);

        
//     }
// }



      //BRUTFORCE APPRAOCH FOR PRINTING SUBARRAY


//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         int maxsum = 0;
       
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                  int currentsum = 0;
//                 for(int k=i;k<=j;k++){
//                     currentsum += arr[k];
//                     maxsum = Math.max(maxsum, currentsum);


//                 }
//             }
//         }
//         System.out.print(maxsum);
//     }
// }
