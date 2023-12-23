import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;




   public class rrer{
    public static void main(String[] args) {
        
    }


   }
    // public static void main(String args[]) {
    //     int arr[]= {1,2,3,4,5};
//         int minsum = Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 int currentsum = 0;
//                 for(int k=i;k<j;k++){
//                     currentsum+=arr[k];

//                 }
//                 minsum = Math.min(minsum,currentsum);
//             }
           

//         }
//         System.out.println(minsum);
//     }
// }



       

    // public static void rotate(int arr[],int s){
    //     reverse(arr,0,arr.length-1);
    //     reverse(arr,0,s-1);
    //     reverse(arr,s,arr.length-1);

    // }
    // public static void reverse(int arr[],int start,int end){
    //     while(start<=end){
    //         int temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         start++;
    //         end--;
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5};
    //     int s=3;
    //     rotate(arr, s);
    //     for(int i:arr){
    //         System.out.print(i + " ");
    //     }
    // }



    
    
   
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6};
       
//         int  maxsum = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                  int  curretsum =0;
//                 for(int k=i;k<=j;k++){
//                     curretsum+=arr[k];
                 
//                 }
//                 maxsum = Math.max(maxsum,curretsum);
//             }

//         }
//          System.out.println(maxsum);
        
//     }
//    }




//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8,9};
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 for(int k=i;k<j;k++){
//                   System.out.print(arr[k] + " "); 
//                 }
//                 System.out.println();
                
//             }
//         }
    

        
//     }
//    }
//     public static void main(String args[]){
//         int arr[] ={1,1,2,2,3,3,4,4};
//         HashMap<Integer,Integer>map = new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i],map.get(arr[i])+1);

//             }
//             else{
//                 map.put(arr[i],1);

//             }
//         }
//         for(Integer key :map.keySet()){
//            System.out.println( key +" -> "+ map.get(key) + " "); 
//         }
//       //  System.out.println(map);



//     }
//    }



//     public static void main(String args[]){
//         int arr[] = {1,2,3,1,2,3,4,5,5,6};
//         HashSet<Integer> map = new HashSet<>();
//         for(Integer key : arr){
//             map.add(key);
//         }
//         System.out.println(map);


//     }
    
//    }
//     public static boolean containdupli(int arr[]){
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i] , map.get(arr[i]) +1);
//             }
//             else{
//                 map.put(arr[i],1);
//             }
//         }

//        for(Integer key: map.keySet()){
//         if(map.get(key)>1){
//             return true;

//         }

//     }
//     return false;
// }
//     public static void main(String arrgs[]){
//         int arr[]={1,2,3,5,4};
//         System.out.println(containdupli(arr));
        
        
//        }

    
       

//     }


//         int arr[]= {1,234,3,456,231};
//         int largest = Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(largest>arr[i]){
//                 largest =arr[i];
//             }
//         }
//         System.out.println(largest);

//     }
// }
  
//     public static void main(String[] args) {
//         int arr[] = {1,234,3,435,78,};
//         Arrays.sort(arr);
    
//           System.out.println(arr[arr.length-1]);
     
//     }
// }

 
//         String s = "akshat muskan khan kashyap";
//         int count = 0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i) == ' '){
//                 count++;
//             }

//         }
//         System.out.println(count+1);
//     }
// }
//     public static void main(String[] args) {
//         int n =5;
//         int a=0;

//         int b=1;
//         for(int i=0;i<n;i++){
//             int c=a+b;
//             System.out.print(c +" ");
//             a=b;
//             b=c;

//         }
        
//     }
// }
//     public static boolean ispalindrome(String a){
//         for(int i=0;i<a.length();i++){
//             if(a.charAt(i)!=a.charAt(a.length()-1-i)){
//                 return false;
//             }
//         }
//         return true;
       
//     }
//     public static void main(String[] args) {
//         String a ="madam";
//         System.out.println(ispalindrome(a));

        
//     }
// }
//     public static boolean isprime(int n){
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 return false;
//             }

//         }
//         return true;

//     }
//     public static void main(String[] args) {
//         int n = 577;
//         System.out.println(isprime(n));


//     }
// }










//     public static void main(String[] args) {
//         int n = 5;
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;

//         }
//         System.out.println(fact);
       
       
        
//     }
// }



//     public static boolean ispalindrome(int n){
//         int temp = n ;
//         int revnum = 0;
//         while(n>0){
//             revnum = revnum*10+n%10;
//             n=n/10;
//         }
//         return temp==revnum;
//     }
//     public static void main(String[] args) {
//         int n =195891;
//         System.out.println(ispalindrome(n));

        
//     }
// }

   

//     public static boolean ispalindrome(int n){
//         String s = Integer.toString(n);
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)!=s.charAt(s.length()-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int n = 191;
//         System.out.println(ispalindrome(n));


        
//     }
// }




















  //  public static boolean isarmstrong(int n){
//         int sum = 0;
//         int temp = n;
//         while(n>0){
//             int digit = n%10 ;
//              digit = digit*digit*digit;
//              sum+=digit;
//              n=n/10;


//         }
//         return sum==temp;
//     }




//     public static void main(String[] args) {
//         int n=153;
//         System.out.println(isarmstrong(n));
        

        
//     }
// }


//     public static void main(String[] args) {
//         int n = 123456;
//         int sum = 0;
//          while(n>0){
//             int temp = n%10;
//             if(temp%2!=0){
//                 sum+=temp;
//             }
//             n=n/10;
//          }
//          System.out.println(sum);
       
//     }


// }





//     public static void main(String[] args) {
//         int a = 9696;
//         int temp = 0;
//         while(a>0){
//              temp = temp*10+a%10;
//               a=a/10;

//         }
//          System.out.print(temp);
        
//     }
   
       


// }

    // public static void swapno(int num1, int num2){
    //     num1 = num1+num2;
    //     num2 = num1-num2;
    //     num1 = num1-num2;
    //     System.out.println(num1);
    //     System.out.println(num2);
        
    
       
    // }
    // public static void main(String[] args) {
    //     int num1 = 9;
    //     int num2 = 6;
    //    swapno(num1,num2);

        
        
    // }
    



    // SWAPPING TWO VALUES AGT A PARTICULAR INDEX 



    // public static void main(String[] args) {
    //     int arr[]= {1,2,3,4,5,6};
    //     int indx1= 2;
    //     int indx2= 4;


    //     int start = 0;
    //     int end = arr.length-1;


    //      int temp = arr[indx1];
    //      arr[indx1] = arr[indx2];
    //      arr[indx2] = temp;

 
    //     for(int i:arr){
    //         System.out.print(i + " ");
    //     }
        
        
    // }




     //  ARMSTRONG 


//     public static boolean isamstrong(int num){
//         int sum =0;
//         int temp = num;

//         while(num>0){
//             int digit = num%10;
//             digit = digit*digit*digit;
//             sum+=digit;
//             num=num/10;

        

//         }
//         return temp==sum;

//     }
//     public static void main(String[] args) {
//         int num = 254;
//         System.out.println(isamstrong(num));

        
//     }


// }


                // SUM OF EVEN NUMBER


//     public static void main(String[] args) {
//         int num = 1234;
//         int sum = 0;

//         while(num>0){
//             int temp = num%10;
//             if(temp%2==0){
//                 sum+=temp;
//             }
//             num =num/10;
            

//         }
//         System.out.println(sum);
        
//     }

// }



// REVERSE NUMBER



//     public static void main(String args[]){
//         int  num = 1234567;
//         int temp = 0;

//         while(num>0){
//             temp = temp*10+num%10;
//             num=num/10;
//         }
//         System.out.println(temp);


//     }
// }





//     public static  boolean isarmstrong(int num){
//         int sum =0 ;
//         int temp = num;
//         while(num>0){
//             int digit = num%10;
//             digit =digit*digit*digit;
//             sum+=digit;
//             num=num/10;

//         }
//         return temp==sum;

//     }
//     public static void main(String[] args) {
//         int num = 123;
//         System.out.println(isarmstrong(num));
        
//     }

// }




//     public static void main(String[] args) {
//         int num = 370;
//         int sum = 0;
//         int temp = num;


//         while(num>0){
//             int digit = num%10;
//             digit = digit*digit*digit;
//             sum+=digit;
//             num = num/10;
           
//         }

//         if(temp == sum){
//             System.out.println(true);

//         }
//         else{
//             System.out.println(false);
//         } 
//     }
// }



//     public static void main(String[] args) {
//         int num = 1234;
//         int sum = 0;
//         while(num>0){
//             int digit = num%10;
//             if(digit%2 == 0){
//                 sum+=digit;
              
        
//             }
//               num=num/10;
//         }
//         System.out.println(sum);

        
//     }
// }

//     public static void main(String[] args) {
//         int num = 54321;
//         int temp = 0 ;
       

//         while(num>0){
//             temp = temp*10 + num%10;
//             num = num/10;
            
//         }
//         temp=temp*-1;
//         System.out.print(temp);


//     }
// }

    //     int arr[]={1,2,7,4,5,3};
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>largest){
    //             largest =arr[i];
   
    //         }
    //     }
    //     System.out.print(largest);
      
        
    // }
    
// }



//     public static boolean isprime(int n){
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 return false;
//             }

//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int n = 2;
//         System.out.print(isprime(n));
        
//     }

    
// }


//     public static boolean ispalindrome(String s){
//         s=s.toLowerCase();
//         s = s.replaceAll("[^A-Za-z0-9]","");
//         for(int i =0 ;i<s.length();i++){
//             if(s.charAt(i) != s.charAt(s.length()-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String s = "A man, a plan, a canal: Panama";
//         System.out.print(ispalindrome(s));
    
//     }



// }

//     public static boolean isanagram(String a , String b){
//         char c[]=a.toCharArray();
//         char d[]=b.toCharArray();

//         Arrays.sort(c);
//         Arrays.sort(d);

//         for(int i=0;i<c.length;i++){
//             if(c[i]!=d[i]){
//                 return false;

//             }

//         }
//         return true;

//     }
//     public static void main(String[] args) {
//         String a = "eat";
//         String b = "tea";
//         System.out.print( isanagram( a ,  b));


//     }
    
// }
