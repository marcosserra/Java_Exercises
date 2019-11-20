package ExercisesCodeWars;

public class DivisibleByXandY {

	
	public static boolean isDivisible(long n, long x, long y) {
	    boolean result = false;
	    if (n % x == 0 && n % y == 0) {
	      result = true;
}
		return result;
}

	public static void main(String[] args) {
		
		System.out.println(isDivisible(6,3,2));
	}
}


