import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static int maxConsOnes(int num){
		int cur = 0;
		int curMax = 0;
		int totMax = 0; 
		while (num > 0) {
			cur = (num & 0x0001);
			if (cur == 1){
				curMax++;
			} else {				
				curMax = 0;
			}
			if(totMax < curMax) totMax = curMax;
			num >>= 1;
		}
		return totMax;
	}

	public static void test(){
		int[] data= {0, 5, 6, 13, 0b110111, 0b111011, 0b11110111011, 0b11011101111, 0b11101111011, 0b11011110111};
		int[] ans = {0, 1, 2, 2, 3, 3, 4, 4, 4, 4};
		if (data.length != ans.length) {
			System.out.println("Wrong test data");
		}
		for (int i = 0; i < data.length; ++i){
			int d = maxConsOnes(data[i]);
			if ( d == ans[i]){
				System.out.printf("Test %d => OK\n", i);
			} else {
				System.out.printf("Test %d:\n\t%d != %d => ERROR (%d)\n", i, d, ans[i], data[i]);
			}
		}
	}
	
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)){   
        	test();
//        	int n = in.nextInt();
//        	System.out.println(maxConsOnes(n));
        }
    }
}
