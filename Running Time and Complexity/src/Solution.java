import java.util.*;

public class Solution {
	
	private static final String NOT = "Not prime";
	private static final String YES = "Prime";
	
	
	public static String isPrime(Integer num) {
		int n = num;
		int delta = 1;
		if (n == 2) return YES;
		if (n % 2 == 0 || n < 2) return NOT;
		for (int i = 2; i < (int) Math.floor(Math.sqrt((double) n)) + 1; i+=delta) {
			if (i > 2) delta = 2;
			if (n % i == 0) return NOT;
		}
		return YES;
	}

    public static void main(String[] args) {
        /* Enter your code here. */
    	try (Scanner in = new Scanner(System.in)){ 
    		int count = in.nextInt();
    		while (count-- > 0) {
    			int num = in.nextInt();
    			System.out.println(isPrime(num));
    		}
        } catch (Exception e) {
        	System.out.println("Count error!");
        	System.out.println(e.getMessage());
        }
    }
}
