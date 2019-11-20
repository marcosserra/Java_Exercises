package exercises.hackerrank.challenge.java;

import java.util.*;

public class Exercise08_Maps {

    public static void main(String argh[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //Declaro el map agenda de Str e Int
        HashMap<String,String> agenda = new HashMap<String,String>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            String namePhone = name+"="+phone;

            //Introduce los valores dentro del map
            agenda.put(name,namePhone);


        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(agenda.get(s)!=null){
                System.out.println(agenda.get(s));
            }
            else{
                System.out.println("Not found");
            }
            
        }
        in.close();
    }
}

