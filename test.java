import java.util.Arrays;



public class test {

    public static boolean isanagram(String a , String b){

        char c[] = a.toCharArray();
        char d[] = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);
        for(int i=0;i<c.length;i++){
            if(c[i]!=d[i]){
                return false;

            }
           
        }
        return true;


    }
    public static void main(String args[]){
        String a = "eat";
        String b = "tea";
       System.out.print(isanagram(a, b));

    }
}


   

    
    










       







    //     ArrayList<Integer> list = new ArrayList<>();
    //     for(int i=5;i>=0;i--){
    //         list.add(i);
    // }
    //   System.out.println(list);
    //   Collections.sort(list);
    //   System.out.print(list);
    


