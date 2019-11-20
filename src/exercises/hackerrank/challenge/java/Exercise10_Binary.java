package exercises.hackerrank.challenge.java;

import java.util.*;

public class Exercise10_Binary {
	

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //Convierte numero en binario
        String binary = Integer.toBinaryString(n);
        
        //Separo los 0 y meto los 1 resultantes dentro de un Array
        String[] parts = binary.split("0");

        //Declaro variable control max
        int max = parts[0].length();

        //Loop que almacena el numero total de 1 consecutivos
        for(int i = 0; i < parts.length; i++){
            max = (max > parts[i].length())? max: parts[i].length();
        }

        System.out.println(max); 


        scanner.close();
    }

}
