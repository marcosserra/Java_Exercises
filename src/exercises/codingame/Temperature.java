package exercises.codingame;
	
	import java.util.*;
	import java.io.*;
	import java.math.*;

	/**
	 * Auto-generated code below aims at helping you parse
	 * the standard input according to the problem statement.
	 **/
	class Temperature {

	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt(); // the number of temperatures to analyse
	        int max = 5526;
	        int min = -273;
	        for (int i = 0; i < n; i++) {
	            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
	            max = (t-0< max) && (t-0 > 0) ? t : max;
	            min = (t+0>min) && (t+0 < 0) ? t : min;
	            System.err.println(t);
	        }

	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");
	        
	        System.err.println("max " + max);
	        System.err.println("min " + min);
	        
	        if (n>0){
	        
	        if ((max - 0) <= (-min -0)){
	            System.out.println(max);
	            } 
	        else{
	            System.out.println(min);
	            }
	        }
	        else{
	            System.out.println(0);
	            }


	        
	    }
	}

