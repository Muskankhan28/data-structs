import java.util.*;
public class stringss{
  public static void main(String args[]){
  }
}

  
  
//   public static void main(String args[]){
//     String s="qwerty";
  
//     int mid=(s.length()-1)/2;
// if(s.length()%2==0){
 
//   String b=s.substring(mid, mid+2);
//   System.out.println(b);
// }else{
//   System.out.println(s.charAt(mid));

// }
//   }
// }

   
    
  


   
  



  






   // REMOVE DUPLICATE IN STRING USING SET


//   public static void main(String args[]){
//     String s="gfg";
    
//     LinkedHashSet<Character> set=new LinkedHashSet<>();
//     for(int i=0;i<s.length();i++){
//       set.add(s.charAt(i));
//     }
//     //  System.out.println(set);
//      String a= set.toString();
//    a=a.replaceAll("[^A-Za-z0-9]","");
//      System.out.println(a);


//   }
  

// }


// VALID ANAGRAM 


//   public static boolean isvalidanagram(String s,String t){
//   char b []=s.toCharArray();
//   char c []=t.toCharArray();
//   Arrays.sort(b);
//   Arrays.sort(c);
//   for(int i=0;i<b.length;i++){
//     if(b[i]!=c[i]){
//       return false;
//     }
//   }


  
//   return true;
// }
//   public static void main(String args[]){
//     String s="anagram";
//     String t="nagaram";
//     System.out.print(isvalidanagram(s, t));
//   }

// }



  // PALINDRONE 


//   public static boolean palindrome(String s){
//     s= s.toLowerCase();
//     s=s.replaceAll("[^A-Za-z0-9]","");
//     for(int i=0;i<s.length()/2;i++){
//      if(s.charAt(i)!=s.charAt(s.length()-1-i)){
//        return false;
//      }
     
//     }
//     return true;
//   }


//   public static void main(String args[]){
//     String s="A man, a plan, a canal :Panama";
//     System.out.print(palindrome(s));
//   }
// }
   



  // PLINDRONE USING TWO POINTERS


//   public static boolean pali(String s){
//     int start=0;
//     int end=s.length()-1;
//     while(start<=end){
//       if(s.charAt(start)!=s.charAt(end)){
       
        
//         return false;
//       }
//       start++;
//       end--;
      
//     }
//    return true;
   
//   }
//   public static void main(String args[]){
//     String s="madam";
//     System.out.print(pali(s));
//   }


// }

  
  // public static boolean dupli(String s){
  //   for(int i=0;i<s.length();i++){
  //     for(int j=i+1;j<s.length();j++){
  //       if(s.charAt(i)==s.charAt(j)){
  //         return true;
  //       }
  //     }
    
  //   }
  //   return false;
  // }
  // public static void main(String args[]){
  //   String s="proaming";
  //   System.out.print(dupli(s));
  
  //     }
  //   }

  

   
      
  

  
  
   
  

  

  // ANAGRAM 

//   public static boolean anagram(String s,String a){
//     if(s.length()!=a.length()){
//       return false;
//     }
//     char b[]=s.toCharArray();
//     char c[]=a.toCharArray();
//     Arrays.sort(b);
//     Arrays.sort(c);
//     for(int i=0;i<b.length;i++){
      
//         if(b[i]!=c[i]){
//           return false;
//         }
      

//     }
//     return true;
  
//   }
//   public static void main(String args[]){
//     String s="aab";
//     String a="aba";
//     System.out.print(anagram(s,a));
//   }
 





//   public static void main(String args[]){

//   int a=-8654;
//   int c=a;
  
//   if(c<0){
//     c=c*-1;
//   }
//   String s=Integer.toString(a);
//   String p="";
//   for(int i=s.length()-1;i>0;i--){
//     p+=s.charAt(i);

//   }
//   int b=Integer.parseInt(p);
//   if(a<0){
//     b=b*-1;
//   }
//   else{
//     b=b*1;
//   }
//   System.out.print(b);




//   }
// }



 











// LEXOGRAPHICALLY LARGEST STRING 

 //   public static void main(String args[]){
//    String arr[] ={"apple","mango","pineapple"};
//    String largest =arr[0];
//    for(int i=0;i<arr.length;i++){
//     if(largest.compareTo(arr[i])<0){
//       largest=arr[i];
//     }
    
//    }
//    System.out.print(largest);

//   }
// }





   // COMPARSION OF TWO STRINGS



//   public static void main(String args[]){
//     String a="akshat";
//     String b="akshat";
//     String c= new String("akshat");
//     if(a.equals(c)){
//       System.out.print(true);
//     }
//     else{
//       System.out.print(false);
//     }
//   }
// }




  // CHECK NO IS PRIME OR NOT

  // OPTIMIXED APPROACH

//   public static boolean isprime(int n){
//     for(int i=2;i<=Math.sqrt(n);i++){
//       if(n%i==0){
//         return false;
//       }
//     }
//     return true;
//   }
//   public static void main(String args[]){
//     int n=44;
//     System.out.print(isprime(n));
//   }

// }


  // CHECK NO IS PRIME OR NOT



//   public static boolean isprime(int n){
//     for(int i=2;i<n-1;i++){
//       if(n%i==0){
//         return false;
//       }
//     }
//     return true;

//   }


  
//   public static void main(String args[]){
//     int n=8;
//     System.out.print(isprime(5));

//   }
// }






//PRINT STRING WITHOUT USING s.length()



//   public static void main(String args[]){
//     String s="muskankhan";
//     char ch[] =s.toCharArray();
//     int i=0;
//     for(char j:ch){
//       i++;
//     }
//     System.out.print(i);

//   }
// }




  // PRINT LENGTH OF A STRING



//     public static void main(String args[]){
//         String s="akshat";
//         for(int i=0;i<s.length();i++){
          
//         }
//         System.out.print(s.length());
//     }
// }
  


    // COPY A STRING



//     public static void main(String args[]){
//         String s="muskan";
//         String a="";
//         for(int i=0;i<s.length();i++){
//             a+=s.charAt(i);
        
//         }
//         System.out.print(a);

//     }
// }


   // INTEGER REVERSE



//     public static void main(String args[]){
//         int a=8852;
//         int c=a;
//         int b=0;
//         if(c<0){
//             c=c*-1;

//         }
//         String s=Integer.toString(c);
//         String p="";
//         for(int i=s.length()-1;i>=0;i--){
//             p+=s.charAt(i);

//         }
//         b=Integer.parseInt(p);
//         if(a<0){
//             b=Integer.parseInt(p)*-1;
//             System.out.print(b);
//         }
//         else{
//             b=Integer.parseInt(p);
//             System.out.print(b);

//         }
        
     


//     }
// }



//BUBBLE SORT


//     public static void main(String args[]){
//         int arr[]={1,2,34,4,5,65,998,45,1234};
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int i:arr){
//             System.out.print(i+" ");
//         }
//     }
// }



// PALINDROME



//     public static boolean pali(String s){
//         for(int i=0;i<s.length()/2;i++){
//             if(s.charAt(i)!=s.charAt(s.length()-1-i)){
//                 return false;
//             }

//         }
//         return true;
//     }
//     public static void main(String args[]){
//         String s ="civic";
//         System.out.print(pali(s));

//     }
// }


// SQUARE ROOT



//     public static void main(String args[]){
//         int num=625;
//         System.out.print(Math.sqrt(num));
//     }
// }




 //INTEGER TO STRING



//     public static int count(int n){
//         String s =Integer.toString(n);
//         return s.length();
//     }
//     public static void main(String args[]){
//         int n = 123456789;
//         System.out.print(count(n));

    

//     }
// }





  // VOWELS AND CONSONENT

  
//     public static boolean alpha(String s, char key){
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==key){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String agrs[]){
//         String s="aeious";
//         char key='b';
//         if(alpha(s,key)==true){
//             System.out.print(" it is a vowels");
//         }
//         else{
//             System.out.print("it is a consonents");
//         }
//     }
// }




// INDEX OF A STRING 


    // public static int keypresent(String a,char key){
    //     for(int i=0;i<a.length();i++){
    //         if(a.charAt(i)==key){
    //             return i;

    //         }
    
    //     }
    //     return -1;
    // }
    // public static void main(String args[]){
    //     String a="muskan";
    //     char key='k';
    //     System.out.print(keypresent(a,key));
    // }
    // }
    

