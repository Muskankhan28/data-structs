import java.util.*;


public class aarraya {

}


    // remove duplicate elements without using any function 
    // without creating any temp array

//     public static void main(String args[]){
//         int arr[] = {5,6,7,5,4,1,7,3};
//         for(int i=0;i<arr.length;i++){
//             int count = 0 ;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                 }

//             }
//             if(count<2){
//                 System.out.print(arr[i] + " ");
//             }
//         }

//     }
// }



//     public static void main(String args[]){
//         int arr[] = {1,2,3};
//         int arr2[] = {4,5};
//         int temp [] = new int [arr.length-1 + arr2.length-1];
//         int k = 0;
//         for(int i :arr){
//             temp[k] +=arr[i];
            
//         }
//         for(int i:arr2){
//             temp[k] += arr[i];
//         }
//         System.out.println(temp);
//     }
  
// }
    

    // OPTIMISED APPROACH FOR PRINTING SUBARRAY


//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         int maxsum = 0;
//         int currsum = 0;
//         for(int i=0;i<arr.length;i++){
//             currsum = Math.max(currsum+arr[i],arr[i]);
//             maxsum = Math.max(maxsum,currsum);
//         }
//         System.out.println(maxsum);
//      }
// }


//BRUTFORCE APPROACH FOR PRINTING SUBARRAY

//         int arr[] = {1,2,3,4,5};
//         int maxsum = 0; 
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 int currentsum = 0;
//                 for(int k=i;k<=j;k++){
//                     currentsum+=arr[k];
//                     maxsum = Math.max(maxsum, currentsum);
//                 }
//             }
//         }
//         System.out.println(maxsum);
//    } 
// }




//     public static void main(String[] args) {
//         String s = "akshat123kashyap";
//         int sum = 0;
//         int count = 0 ;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)>'0' && s.charAt(i)<'9'){
//                 sum+=s.charAt(i) - '0';
//                 count ++ ;
//             }

//         }
//         System.out.println(sum/count);
        
//     }
// }
























        
        // String p = s.replaceAll("[^0-9]","");
        // int num = Integer.parseInt(p);
        // int sum=0;
        // int count=0;
       

        // while(num>0){
        //     int digit= num%10;
        //     sum+=digit;
        //     num=num/10;
        //     count++;
        // }
        //  int average=sum/count;
        //  System.out.println(average);

  

    //     String p="";
    //     int count = 0;
    //     int sum =0;
        
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)>'0' && s.charAt(i)<'9'){
    //             sum+=s.charAt(i) - '0';
    //             count ++;
                

               
    //         }
            
    //     }
    //     System.out.println(sum / count);  
        
        

    // }
    

        // OPTIMISED APPROACH FOR PRINTING SUBARRAY


//         public static void main(String args[]){
//         int arr[] = {-2,-6,76,-1,-8,99};
//         int currsum = 0;
//         int maxsum =Integer.MIN_VALUE;
//         for(int i =0;i<arr.length;i++){
//             currsum = Math.max(currsum+arr[i],arr[i]);
//             maxsum = Math.max(maxsum,currsum);
//         }
//         System.out.print(maxsum);
//     }
// }



    // maximum product of subarray brutforce approach 
    
//     public static void main(String args[]){
//         int arr[] = {6,-3,-10,0,2};
//         int maxsum = 1;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 int currentsum = 1;
//                 for(int k=i;k<=j;k++){
//                     currentsum *= arr[k];
//                     maxsum = Math.max(maxsum,currentsum);

//                 }
//             }
           

//         }
//          System.out.println(maxsum);
//     }
// }
    

    



























//     public static int trappedwater(int height[]){
//         int leftmax[] = new int [height.length];
//         leftmax[0] = height[0];
//         for(int i=1;i<height.length;i++){
//            leftmax[i] =  Math.max(height[i],leftmax[i-1]);
//         }
//         int rightmax[] = new int[height.length];
//         rightmax[height.length-1] = height[height.length-1];
//         for(int i=height.length-2;i>=0;i--){
//             rightmax[i] = Math.max(height[i],rightmax[i+1]);

//         }
//         int trappedwater = 0;
//         for(int i=0;i<height.length;i++){
//             int maxwater = Math.min(leftmax[i],rightmax[i]);
//             trappedwater += maxwater - height[i];
//         }
//         return trappedwater;

//     }



     
//     public static void main(String[] args) {
//         int heigth[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedwater(heigth));

        
//     }
// } 

























//     public static int trappedrainwater(int height[]){
//     int n = height.length;
//     int leftmax[] = new int[n];
//     leftmax[0]=height[0];
//     for(int i=1;i<n;i++){
//         leftmax[i] = Math.max(height[i],leftmax[i-1]);

//     }
//     int rightmax[] = new int[n];
//     rightmax[n-1]=height[n-1];
//     for(int i=n-2;i>=0;i--){
//         rightmax[i] = Math.max(height[i],rightmax[i+1]);
//     }
//     int trappedwater = 0;
//     for(int i=0;i<n;i++){
//         int maxwater = Math.min(leftmax[i],rightmax[i]);
//         trappedwater += maxwater-height[i];
//     }
//     return trappedwater;

  

// }
//     public static void main(String args[]){
//          int heigth[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedrainwater(heigth));


//     }
   

// }




    // TRAPPED RAIN WATER 


//     public static int trappedrainwater(int height[]){
//         int leftmax[] =  new int [height.length];
//         leftmax[0]= height[0];
//             for(int i=1;i<height.length;i++){
//             leftmax[i] = Math.max(height[i],leftmax[i-1]);

//         }
//         int rightmax[] = new int [height.length];
//         rightmax[height.length-1]=height[height.length-1];
//         for(int i=height.length-2;i>=0;i--){
//             rightmax[i] = Math.max(height[i],rightmax[i+1]);
//         }
//         int trappedwater = 0;
//         for(int i=0;i<height.length;i++){
//             int maxwater = Math.min(leftmax[i],rightmax[i]);
//             trappedwater += maxwater-height[i];


//         }
//         return trappedwater;
//     }
//     public static void main(String[] args) {
//         int height[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedrainwater(height));
//     }
// }




  
//     public static int searchtarget(int num[],int target){
//         for(int i=0;i<num.length;i++){
//             if (num[i]==target){
//                 return i;
//             }
//             else{
//                 if(target<num[i]){
//                     return i;
//                 }
//             }
            
//         }
//         return num.length;
//     }
//     public static void main(String args[]){
//         int nums[]={1,3,5,6};
//         int target=7;
//     System.out.println(searchtarget(nums, target));


//     }
// }





    // ROTATE AN ARRAY


//     public static void rotate(int nums[],int k){
//         reverse(nums,0,nums.length-1);
//         reverse(nums,0,k-1);
//         reverse(nums,k,nums.length-1);
//     }
    
//     public static void reverse(int nums[],int start,int end){
    
//          while(start<=end){
//             int temp=nums[start];
//             nums[start]=nums[end];
//             nums[end]=temp;
//             start++;
//             end--;
//          }
//     }
//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5,6,7};
//         int k=3;
//         rotate(nums,k);
//         for(int i:nums){
//             System.out.print(i+" ");
//         }
    
       
    
//     }
// }

  




    // FIBONACCI SERIES



    // public static void  main(String args[]){
    //     int a=0;
    //     int b=1;
    //     System.out.print(a+" "+b+" ");
    //     for(int i=0;i<10;i++){
    //         int c=a+b;
    //         System.out.print(c+ " ");
    //         a=b;
    //         b=c;
    //     }
    // }

   
    



//       MISSING NUMBER IN AN ARRAY 



//     public static int missingnumber(int nums[]){
//         Arrays.sort(nums)   ;
//         for(int i=0;i<nums[nums.length-1];i++){
//             if(nums[i]!=i){
//                 return i;
//             }
//         }
//         return nums[nums.length-1]+1;
//      }

    
//     public static void main(String args[]){
//        // int nums[]={3,0,1};
//        int nums[]={9,6,4,2,3,5,7,0,1};
//         System.out.print(missingnumber(nums));
//     }
// }
   



//SINGLE VALUE IN AN ARRAY 




//     public static int singlevalue(int nums[]){
//         if(nums.length==1){
//             return nums[0];
//         }
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i+=2){
//             if(nums[i]!=nums[i+1]){
//                 return nums[i];
//             }
//         }
//         return nums[nums.length-1];
//     }

//     public static void main(String args[]){
//         int nums[]={4,1,2,1,2};
//         System.out.print(singlevalue(nums));
//     }
// }




// INSERTION SORT







// time complexity is O(n^2)

//     public static void main(String args[]){
//         int arr[]={7,8,3,1,2};
//         for(int i=1;i<arr.length;i++){
//             int current =arr[i];
//             int j=i-1; // sorted part ko track krne ke liye hm j use krre h
//             while(j>=0 && current<arr[j]){
//                 arr[j+1]=arr[j];
//                 j--;


//             }
//             //placement 
//             arr[j+1]=current;
//         }
//         for(int i:arr){
//             System.out.print(i+" ");
//         }

//     }

// }





    
       
    
  
       
// REPLACE THE ELEMENT IN THE ARRAY




// it is solved using two pointer approach


//     public static int replaceElement(int nums[],int key){
//         int start=0;
//         int end=nums.length-1;
//         while(start<=end){
//             if(nums[end]==key){
//                 end--;
//             }
//             else{ 
//                 if(nums[start]==key){
//                     int temp=nums[start];
//                     nums[start]=nums[end];
//                     nums[end]=temp;
//                     start++;
//                     end--;
//                 }
//                 else{
//                     start++;
//                 }
//             }
//         }
//         return end+1;
//     }
//     public static void main(String args[]){
//         int nums[]= {3,2,2,3};
//         int key=3;
//         replaceElement(nums,key);
//         for(int i:nums){
//             System.out.print(i + " ");
//         }
//     }
// }




      // MAXIMUM SUM OF SUBARRAY



//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5};
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 int currsum=0;
//                 for(int k=i;k<=j;k++){
//                     currsum+=nums[k];

//                 }
//                 maxsum=Math.max(currsum,maxsum);
                
//             }
//         }
//         System.out.print(maxsum);
//     }
// }





// INSERTION SORT


// time complexity is O(n^2)


//     public static void main(String args[]){
//         int arr[]={7,8,3,1,2};
//         for(int i=1;i<arr.length;i++){
//             int current =arr[i];
//             int j=i-1; // sorted part ko track krne ke liye hm j use krre h
//             while(j>=0 && current<arr[j]){
//                 arr[j+1]=arr[j];
//                 j--;
//            }
//             //placement 
//             arr[j+1]=current;
//         }
//         for(int i:arr){
//             System.out.print(i+" ");
//         }

//     }

// }



// SELECTION SORT


// time complexity is 0(n^2)

//     public static void main(String args[]){
//         int nums[]={7,8,3,1,2};
//         for(int i=0;i<nums.length;i++){
//             int smallest =i;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[smallest]>nums[j]){
//                     smallest=j;
                
//                 }
//             }
//             int temp=nums[smallest];
//             nums[smallest]=nums[i];
//             nums[i]=temp;
            
        
//         }
//         for(int i:nums){
//             System.out.print(i + " ");
//         }
//     }
// }




// BUBBLE SORT 


// time complexity is 0(n^2)


//     public static void main(String args[]){
//         int nums[]={2,5,6,8,99,889,4,657};
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length-1-i;j++){
//                 if(nums[j]>nums[j+1]){
//                     int temp=nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=temp;
//                 }
//             }
//         }
//         for(int i:nums){
//             System.out.print(i + " ");
//         }
// }
// }




// PRINTING SUBARRAY


//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5};
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 for(int k=i;k<=j;k++){
//                     System.out.print(nums[k]);
                   
//                 }
//                 count++;
//                 System.out.println();
//             }
//         }
//         System.out.print(count);
        
// }
// }
 



// PRINTING PAIRS OF AN ARRAY 


//     public static void main(String args[]){
//         int nums[]={1,2,3,3,4,5,6,7,8,9};
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 System.out.print("{" + nums[i] +","+ nums[j ]+"}");
//             }
//             System.out.println();
//         }


//     }

// }




// PRINTING LAST ELEMENT OF AN ARRAY    


//     public static void main(String args[]){
//         int nums[]={44,55,89,77,64,98};
//         Arrays.sort(nums);
//         int n=nums.length-1;
//         System.out.print(nums[n]);

//     }

// }




// REVERSING AN ARRAY 



//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5,6,7,8,9};
//         for(int i=nums.length-1;i>=0;i--){
//             System.out.print(nums[i] + " ");
//         }
//     }

// }




// PRINTING LARGEST ELEMENT OF AN ARRAY (OPTIMIZED APPROACH )

// here we are comparing the element with the min valuse(ie Integer.MIN_VALUE) so that we can find the largest element present in the array 



//    public static void main(String args[]){
//         int nums[]={1,43,66,90,88,76,57};
//         int largest=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             if(largest<nums[i]){
//                 largest=nums[i];
//             }
//         }
//         System.out.print(largest);
//     }
// }




// PRINTING LARGEST ELEMENT OF AN ARRRAY (BRUTFORCE APPROACH)

// USING Arrays.sort(arr) method 


//     public static void main(String args[]){
//         int nums[]={8,9,77,65,43,23,44,66,78};
//         Arrays.sort(nums);
//         for(int i:nums){
//             System.out.print(i +" ");

//         }
//     }
// }




    // PRINTING SUM OF INDEX OF AN ARRAY 



//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5};
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             sum+=i;
//         }
//         System.out.print(sum);
//     }

// }




// PRINTING SUM OF ARRAY 


//     public static void main(String args[]){
//         int arr[]={1,2,3,4};
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//         System.out.print(sum);
//     }
// }




// UPDATING A VALUE IN AN ARRAY 



//     public static void main(String args[]){
//         int arr[]={1,2,3,4};
//         int key=2;
//         int upd=9;
//         for(int i=0;i<arr.length;i++){
//             if (arr[i]==key){

            
//             arr[i]=upd;
//             }
//         }
    
//         for(int i:arr){
//             System.out.print(i + " ");

//     }
// }
// }



// SUM AND DIFFERNECE OF AN ARRAY


//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5,6,7};
//         int sum=0;
//         int sum2=0;
//         for(int i =0;i<nums.length;i++){
//             if (nums[i]%2==0){
//                 sum+=nums[i];

//             }
//             else{
//                 sum2+=nums[i];
//             }
//         }
//         System.out.println(sum);
//         System.out.println(sum2);
//         int diff=sum-sum2;
//         if(sum<sum2){
//             diff=sum2-sum;
//         }
//         else{
//             diff=sum-sum2;
//         }
//         System.out.println(diff);

//     }
    
// }




// CHANGING FIRST ELEMENT OF AN ARRAY



//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5,67,7,9};
//         nums[0]=99;
//         for(int i:nums){
//             System.out.print(i+" ");
//         }
//     }

// }




// CHANGING LAST ELEMENT OF AN ARRAY 




//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5,6,7};
//         nums[nums.length-1]=28;
//         for(int i:nums){
//             System.out.print(i +" ");
//         }
//     }

// }



// ALPHABET IS VOWEL OR CONSONENT



//     public static boolean alpha(String s,char key){
//         for(int i=0;i<s.length()-1;i++){
//             if(s.charAt(i)==key){
//                 return true;
//             }
            

//         }
//         return false;
//     }
//     public static void main(String args[]){
//         String s="aeiou";
//         char key='m';
//         if(alpha(s,key)==true){
//             System.out.print("it is a vowel");
//         }
//         else{
//             System.out.print("it is a consonent");
//         }


//     }
// }



// PALIDRONE 



//     public static boolean palidrome(int nums[]){
//         for (int i=0;i<nums.length;i++){
//             if(nums[i]!=nums[nums.length-1-i]){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         int nums[]={'m','a','d','a','m'};
//         System.out.print(palidrome(nums));
//     }

// }



//BINARY SERACH



// import java.util.*;
//public class aarraya {

//     public static int binarysearch(int nums[],int key){
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
//         int nums[]=  {7,88,90,45,66,78,99,345,55,12}  ;
//         int key=99;
//         Arrays.sort(nums);
//         for(int i:nums){
//             System.out.print(i + " ");
//         }
//         System.out.print(binarysearch(nums,key));
      
//     }

// }




// SUMARRAY


//     public static boolean sumarray(int nums[],int key){
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==key){
//                     return true;
//                 }
//             }
//         }
//         return false;

//         }
    
//     public static void main(String args[]){
//         int nums[]={2,7,99,76,12,34,22};
//         int key =9;
//         System.out.print(sumarray(nums,key));
//     }
// }



//   LINEAR SEARCH 



//     public static boolean linearsearch(int nums[],int key){
//         for(int i=0;i<nums.length;i++){
//             if (nums[i]==key){
//                 return true;

//             }
          
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5,6};
//         int key=5;
//         System.out.print(linearsearch(nums,key));
//     }
    
// }



// PRINTING AN ARRAY


//     public static void main(String args[]){
//         int nums[]={11,44,78,99,25,28,66};
//         for(int i:nums){
//             System.out.print(i + " ");
//         }

// }
// }