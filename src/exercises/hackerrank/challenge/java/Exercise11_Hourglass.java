package exercises.hackerrank.challenge.java;

import java.util.*;

public class Exercise11_Hourglass {
	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int[][] arr = new int[6][6];

	        for (int i = 0; i < 6; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	            }
	        }
	        //Declaracion de variables, auxiliar es equivalente al primer reloj de arena
	        int auxiliar = arr[0][0]+ arr[0][1] + arr[0][2] +                                                                  arr[1][1] +                                                                   arr[2][0] + arr[2][1] + arr[2][2];
	        int result= auxiliar;
	        //Loop que detecta los numeros que no son 0 y suma los numeros dentro de los               relojes de arena y almacena en la variable auxiliar las diferentes sumas y en            la de result el mayor resultado
	        for(int i = 0; i < arr.length-2;i++){
	            for (int j = 0; j < arr[0].length-2;j++){
	                    auxiliar = arr[i][j]+ arr[i][j+1] + arr[i][j+2] +                                                            arr[i+1][j+1] +                                                            arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
	                if(auxiliar>result){
	                    result = auxiliar;
	                }
	                }
	            }
	        System.out.println(result);
	        scanner.close();
	    }

}
