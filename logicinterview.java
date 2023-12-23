import java.util.*;
public class logicinterview {

    public static int binarysearch(int arr[] , int key){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        int arr[] = {1,4,5,7,9,3,8,56};
        Arrays.sort(arr);
        // for(int i: arr){
        //     System.out.print(i + " ");
        // }
        int key = 8;
        System.out.print(binarysearch(arr,key));
       
    }
    
    
    }
 
    // greatest o 2 number 


//     public static void main(String args[]){
//         int a = 9;
//         int b = 86;
//         if(a>=b){
//             System.out.println("a is the greatest");
//         }
//         else{
//             System.out.print("b is greatest");
//         }
//     }
    
// }



     // check weather the givn no is even or odd



// public static void main(String args[]){
//     int n = 137;
//     if(n%2==0){
//         System.out.println("the given no is even");
//     }
//     else{
//         System.out.println("the given no is odd");
//     }
// }

// }




      // greatest of 3 number

// public static void main(String args[]){
//     int a = 4895;
//     int b = 12;
//     int c = 89;

//     if(a>=b && a>=c){
//         System.out.println(" a is the greatest no");
//     }
//     else if(b>=c){
//         System.out.println("b is the greatest no");
//     }
//     else{
//         System.out.println("c is the greatest no");
//     }

// }

// }




     // print no from 1 to n



// public static void main(String args[]){
//     int n = 200;
//     for(int i=1;i<=n;i++){
//         System.out.println(i);
//     }
// }
// }



// print no from 1 to 10


// public static void main(String args[]){
//     int n=10;
//     for(int i=1;i<=n;i++){
//         System.out.println(i);
//     }
// }
// }




// square pattern

// public static void main(String args[]){
//     int n=4;
//     for(int i=0;i<n;i++){
        
//         for(int j=0;j<n;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
    
// }

// }



 // sum of first n no

// public static void main(String args[]){
//     int n = 5;
//     int sum = 0;
//     for(int i=0;i<=n;i++){
//         sum+=i; 

//     }
//       System.out.print(sum);
// }

// }



// reverse a no


// public static void main(String args[]){
//     int n=12345;
//     while(n>0){
//         int temp = n;
//         temp = n%10;
//         n=n/10;
//           System.out.print(temp);
//     }
// }
// }

// public static void main(String args[]){
//     int n = 12345;
//     int revnum = 0;
//     while(n>0){
//      revnum = revnum*10 + n%10 ;
//         n=n/10;
//     }
//     System.out.print(revnum);

// }

// }

// prime no

// public static boolean isprime(int n){
//     for(int i=2;i<n;i++){
//         if(n%i == 0){
//             return false;
//         }

//     }
//     return true;
   
// }

// public static void main(String args[]){
//     int n = 13;
//     System.out.println(isprime(n));

// }



// product of two number

// public static int multiply2no(int a, int b){
//     int multiply = a*b;
//     return multiply;
// }


// public static void main(String args[]){
//     int a =3;
//     int b =5;
//     System.out.println(multiply2no(a, b));
    
    
// }
// }



// factorial 

// public static void main(String args[]){
//     int n = 5;
//     int fact = 1;
//     for(int i=1;i<=n;i++){
//         fact = fact*i;
//     }
//     System.out.print(fact);
// }
// }



    // binomial cofficient


// public static int binomialcoffeciant(int n ,int r){
//     int a = factorial(n);
//     int b = factorial(r);
//     int c = factorial(n-r);
//     int bc = a/(b*c);
//     return bc;
// }

// public static int factorial(int n){
//     int fact = 1;
//     for(int i=1;i<=n;i++){
//         fact = fact*i;
        
//     }
//     return fact;
//    }
// public static void main(String args[]){
//     int n = 5;
//     int r = 2;
//     System.out.println(binomialcoffeciant(n, r));
// }
// }

 
// prime is in range

// public static void primeisinrange(int n){
//     for(int i=1;i<n;i++){
//         if(isprime(i) ==  true){
//             System.out.println(i);
//         }
//     }

// }

// public static boolean isprime(int n){
//     for(int i=2;i<n;i++){
//         if(n%i == 0){
//             return false;
//         }
//     }
//     return true;
// }
// public static void main(String args[]){
//     int n=10;
//     primeisinrange(n);

// }
// }
