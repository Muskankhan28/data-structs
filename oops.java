public class oops {
       public static void main(String args[]){
        horse newHorse=new horse();
        chicken newChicken = new chicken();
        newHorse.eats();
        
        newHorse.legs();



       }
    }
   abstract class Animal{
        void eats(){
            System.out.println("animal eats");
        }
  abstract void legs();
    }
    class horse extends Animal{
        void legs(){
            System.out.println("4 legs");
        }
    }
    class chicken extends Animal{
        void legs(){
            System.out.println("2 legs");
        }
    }































// COMPILE TIME POLYMORPHISM

// class student{
//     String name;
//     int rollno;
//     public void information(String name){
//         System.out.print(name);
//     }
//    public void information(int rollno){
//         System.out.print(rollno);
//     }
//    public void information(String name ,int rollno){

//     System.out.print(name + " " + rollno);
//     }
// }

// public class oops {
//     public static void main(String args[]){
//    student s1=new student();
//      s1.name="mutti";
//      s1.rollno=69;
//     s1.information(s1.rollno);

//     }

//      }
    



    // INHERITANCE EXAMPLE 



   //
   
  // public static void main(String args[]){
//         cse computerscience = new cse();
//         btech tech = new btech();
//         tech.thdc();
//         tech.wit();
//         tech.studentbranch();
//         tech.studentsrollno();
//     }
    
// }
// class cse{
//     int students;
//     void studentsrollno(){
//         System.out.println("studentrollno");
//     }
//     void studentbranch(){
//         System.out.println("studentbranch");

//     }
// }
// class btech extends cse{
//     String collegename;
//     void thdc(){
//         System.out.println("thdc");   
//     }
//     void wit(){
//         System.out.println("wit");
//     }
// }
