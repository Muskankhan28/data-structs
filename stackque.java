import java.util.*;



 public class stackque{
    public static void main(String[] args) {
        
    }
 }


 // valid parathesis in string using stack 


//     public static boolean validparanthesis(String p){
//         Stack<Character>stac = new Stack<>();


//         for(char c: p.toCharArray()){
//             if(c=='{'){
//                 stac.push('}');
//             }
//             else if(c=='['){
//                 stac.push(']');
//             }
//             else if(c=='('){
//                 stac.push(')');
//             }
//             else if(stac.isEmpty() || c!=stac.pop()){
//                 return false;
//             }
            

//         }
//           return stac.isEmpty();

//     }
//     public static void main(String[] args) {
//         String p = "{[()]}";
//         System.out.print(validparanthesis(p));
        
        
//     }
// }

  



// push at the bottom of the stack 



// public class stackque {
//     public static void main(String args[]){
//         Stack <Integer> Stack1 = new Stack<>();
//         Stack <Integer> Stack2 = new Stack<>();


//         Stack1.push(1);
//         Stack1.push(2);
//         Stack1.push(3);
        

//         while(!Stack1.isEmpty()){
//             Stack2.push(Stack1.peek());
//             Stack1.pop();
//         }

//         Stack1.push(4);

//         while(!Stack2.isEmpty()){
//             Stack1.push(Stack2.peek());
//             Stack2.pop();
//         }


//         while(!Stack1.isEmpty()){
//             System.out.println(Stack1.peek());
//                 Stack1.pop();
            
//         }
//     }
// }

 
// push at the bottom of the stack using recursion 



// public class stackque{
//     public static void pushatbottom(Stack<Integer>s,int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return ;
//         }
//         int top = s.pop();
//         pushatbottom(s,data);
//         s.push(top);
//     }
    


// public static void main(String args[]){
//     Stack <Integer> s = new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//     pushatbottom(s,4);
//     while(!s.isEmpty()){
//         System.out.println(s.pop());
//     }
// }
// }  



// reverse a string using stack



// public class stackque{
//     public static void reversestringusingstack(String s){
//         String p = " ";
//         Stack<Character>stac = new Stack<>();
//         for(int i=0;i<s.length();i++){
//            stac.push(s.charAt(i));



//         }
//         while(!stac.isEmpty()){
//          p+=stac.pop();

//         }
//         System.out.print(p);
//     }


//     public static void main(String args[]){
//         Stack<Integer>stac = new Stack<>();
//         String s = "akshat";
//         reversestringusingstack(s);

//     }


// reverse a stack 



// public class stackque{  

//     public static void pushatbottom(Stack<Integer>stackk,int data){
//         if(stackk.isEmpty()){
//             stackk.push(data);
//             return;

//         }
//         int top = stackk.pop();
//         pushatbottom(stackk,data);
//         stackk.push(top);
//     }


//     public static void reversestack(Stack<Integer>stackk){
//         if(stackk.isEmpty()){
//             return;
//         }


//         int top = stackk.pop();
//         reversestack(stackk);
//         pushatbottom(stackk, top);

//     }


//     public static void printstack(Stack<Integer>stackk){


//          while(!stackk.isEmpty()){

//             System.out.println(stackk.pop());

//          }

//     }
//     public static void main(String args[]){
//         Stack<Integer> stackk = new Stack<>();
//         stackk.push(1);
//         stackk.push(2);
//         stackk.push(3);
//         stackk.push(4);
//         reversestack(stackk);
//         printstack(stackk);
        
//     }
// }

  








    
