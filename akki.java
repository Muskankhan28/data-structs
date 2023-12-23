public class akki {
    public static int getlargest(int arr[]){
         int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                largest =  arr[i];
            }
            
        }
        return largest;
        

    }


    // public static int binarysearch(int arr[],int temp){
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start<=end){
    //         int mid = (start+end)/2;
    //         if(arr[mid] == temp){
    //         return mid;

    //         }
    //         else if(arr[mid]<temp){
    //             start = mid+1;

    //         }
    //         else{
    //             end =mid-1;
    //         }
    //     }
    //     return -1;
    
    // }

    public static void main(String[] args) {
        int arr[]={1,2,12,4,99};
        System.out.println(getlargest(arr));
       















        // int temp = 4;
        // System.out.print(binarysearch(arr, temp));
















        // int arr[]={1,2,3,4,5,6,7,8,9,10};
        // int sum = 0;
        // for(int i=0;i<arr.length ;i++){
        //     if(arr[i]%2!=0){
        //         sum = sum + arr[i];

        //     }
        // }
        // System.out.print(sum);
        
    














    // public static boolean ispalindrone (char arr[]){
    //     for(int i=0;i<arr.length/2;i++){
    //         if(arr[i]!=arr[arr.length-1-i]){
    //             return false;
                
    //         }
    //     }
    //     return true;
    // }








    // public static int index(int nums[], int target){
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i] == target){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }






//    public static boolean linearsearch(int arr[],int target){
//     for(int i = 0;i<arr.length;i++){
//         if(arr[i]==target){
//             return true;
//         }
//     }
//     return false;
//    }


    











        // char arr[]={'m','a','d','a','m'};
        // System.out.print(ispalindrone(arr));






        // int nums [] ={1,2,3,4};
        // int target = 2;
        // System.out.print(index(nums, target));
        










        // int sum = 0;
        // for(int i=0;i<nums.length;i++){
        //     sum = sum+nums [i];

        // }
        // System.out.print(sum);












        // String s = "mutti";
        // String p ="";
        // for(int i=s.length()-1;i>=0;i--){

        //   p+=s.charAt(i);


        //
        // System.out.print(p);
        


        // int arr[] = {1,2,3,4};
        // int target = 1;
        // System.out.print(linearsearch(arr, target));
        
    }

    
}
