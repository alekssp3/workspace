import java.util.*;
import java.io.*;

class Calculator {
	int power(int n, int p) throws Exception {
		if (n < 0  || p < 0) throw new Exception("n and p should be non-negative");
		int pow = 1;
		while (p > 0) {
			pow *= n;
			p--;
		}
		return pow;
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		try {
		int ans = calculator.power(0,0);
		System.out.println(ans);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
