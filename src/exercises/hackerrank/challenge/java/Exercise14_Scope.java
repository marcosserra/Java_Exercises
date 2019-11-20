package exercises.hackerrank.challenge.java;

import java.util.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here

    Difference(int[] numbers){
     this.elements = numbers;
 }
 public int computeDifference(){
     int minNum = elements[0];
     int maxNum = elements[0];
     for(int i = 0; i<elements.length; i++){
         minNum = (elements[i]<minNum)?elements[i]:minNum;
         maxNum = (elements[i]>maxNum)?elements[i]:maxNum;
     }

     return maximumDifference = maxNum - minNum; 
 }

} // End of Difference class

public class Exercise14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}