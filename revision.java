

import java.util.*;
 public class revision {
   public static int MissingNumber(int array[], int n) {
        Arrays.sort(array);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:array){
            list.add(array[i]);
        }
     Collections.reverse(list);
     for(int i=0;i<n;i++){
        if(list.get(i)!=n-i){
           return n-i;
        }
     }
    //   for(int i=0;i<n;i++){
    //         if(array[i]!=i+1){
    //             return i+1;
    //         }
    //     }
        // return array[array.length-1]+1;
        return -1;
    }

    public static void main(String[] args) {
        int []array={1,2,3,5};
        System.out.println(MissingNumber(array, 5));
    }
 }
  

//     public static void main(String args[]){
//         int a=-5569;
//         int c=a;
//         if(c<0){
//             c=c*-1;
//         }
//         String s=Integer.toString(a);
//         String p="";
//         for(int i=s.length()-1;i>0;i--){
//             p=p+s.charAt(i);


//         }
//         int b=Integer.parseInt(p);
//         if(a<0){
//             b=b*-1;

//         }
//         else{
//             b=b*1;
//         }
//         System.out.print(b);
    

//     }
    
//  }
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5,6};
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 System.out.print("{" + i+","+j  + "}");
//             }
//             System.out.println();
//         }

//     }
// }
//     public static void main(String args[]){
//         int arr[]={45,89,99,5,1,8,2,3,4,5};
//         int smallest=Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(smallest>arr[i]){
//                 smallest=arr[i];
//             }
//         }
//         System.out.print(smallest);
//     }
// }



//         int arr[]={234,889,6,444,56,778};
//         int largest =Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(largest<arr[i]){
//                 largest=arr[i];

//             }
//         }
//         System.out.print(largest);
//     }
// }
   
//     public static void main(String args[]){
//         int a=902750993;
//        String s= Integer.toString(a);
        
        
//         System.out.print(s.length());
        
//     }
//     //int a=902750993
// }
//     public static boolean alpha(String s,char key){
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==key){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         String s="aeiou";
//         char key='a';
//         if(alpha(s,key)==true){
//             System.out.print("vowel");
//         }
//         else{
//             System.out.print("consonent");
//         }
//     }
// }



//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5,6,7};
//        arr[arr.length-1]=10;
//        for(int i:arr){
//         System.out.print(i + " ");
//        }
//     }
// }
    
//      public static void main(String args[]){
//         int arr[]={1,2,3,4,5};
//         int sum=0;
//         int sum2=0;
//       int diff=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 sum+=arr[i];

//             }
//             else{
//                 sum2+=arr[i];
//             }
//         }
//         System.out.println(sum);
//         System.out.println(sum2);

    
// if(sum<sum2){
//     System.out.println( diff=sum2-sum);
// }
// else{
//     System.out.println(diff=sum-sum2);

// }
// }
// }
       


//  public static int binarysearch(int nums[],int key){
//         int start=0;
//         int end=nums.length-1;
//         Arrays.sort(nums);
//         while(start<=end){
//             int mid=(start+end)/2;
//             if(key==nums[mid]){
//                 return mid;

//             }
//             else if(key<nums[mid]){
//                 end=mid-1;
//             }
//             else{
//                 start=mid+1;
//             }

//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int nums[] ={7,9,6,44,99,8,2,3};
//         int key=44;
//         Arrays.sort(nums);
//         for (int i :nums){
//             System.out.print(i + " ");
//         }
//         System.out.print(binarysearch(nums,key));

//     }
// }

    
// }
