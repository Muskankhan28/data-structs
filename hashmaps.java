import java.util.HashMap;
import java.util.*;

public class hashmaps {
    public static void main(String args[]){

        HashMap<String,Integer>mutti = new HashMap<>();
        
        mutti.put("ayaz",56);                    // put function
        mutti.put("nargis",48);
        mutti.put("anam",29);
        mutti.put("shiba",27);
        mutti.put("cheemu",21);


        // System.out.println(mutti);

        // mutti.get("cheemu");                             // get function
        // int age = mutti.get("cheemu");
        // System.out.println(age);


        // mutti.containsKey("akshat");                     // containsKey function
        // System.out.println(mutti.containsKey("akshat")); //false

        // System.out.println(mutti.containsKey("cheemu")); //true


        // mutti.remove("shiba");                           // remove function
        // System.out.println(mutti.remove("shiba"));

        // System.out.print(mutti);



        Set<String>key = mutti.keySet();
        for(String i : key){
            System.out.println( i + " ->" + mutti.get(i));
        }







    }
    
}
