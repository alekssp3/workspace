
//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;


class Matrix {
	private int[][] matrix;
	public final int BUFFER = 15;
	
	public Matrix(int[][] matrix){
		this.matrix = matrix;
	}
	
	public int getMax(List<Integer> list){
		int max = list.get(0);
		for (int i = 1; i < list.size(); ++i) {
			int cur = list.get(i);
			if (max < cur) max = cur;
		}
		return max;
	}
	
	public int getSubSum(int subSize, int startX, int startY) {
		int sum = 0;
		for (int i = startY; i < startY + subSize; i++) {
			for (int j = startX; j < startX + subSize; j++) {
				if (i == startY + 1 && (j == startX || j == startX + 2)) continue;
				sum += (matrix[i][j]);
			}
		}
		return sum;
		
	}
	
	public List<Integer> getAllSubSum() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 4; ++i){
			for (int j = 0; j < 4; ++j){				
				list.add(getSubSum(3, i, j));
			}
		}
		return list;
	}

	public List<Integer> toList(){
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				list.add(matrix[i][j]);
			}
		}
		return list;
	}	
}

public class Solution {
	public static void main(String[] args) {
		int arr[][] = new int[6][6];
		try (Scanner in = new Scanner(System.in)) {
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
		}
		Matrix matrix = new Matrix(arr);
		System.out.println(matrix.getMax(matrix.getAllSubSum()));

	}
}
