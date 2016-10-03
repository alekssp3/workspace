import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void swap(Object a, Object b){
        Object tmp = a;
        a = b; 
        b = tmp;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
        int numberOfSwaps = 0;

		for (int i = 0; i < n; i++) {
			// Track number of elements swapped during a single array traversal
			//int numberOfSwaps = 0;

			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					//swap(a[j], a[j + 1]);
					Object tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = (int) tmp;
					numberOfSwaps++;
				}
			}

			// If no elements were swapped during a traversal, array is sorted
			//if (numberOfSwaps == 0) {
			//	break;
			//}
		}
        
        System.out.printf("Array is sorted in %d swaps.\nFirst Element: %d\nLast Element: %d", numberOfSwaps, a[0], a[n-1]);
	}
}
