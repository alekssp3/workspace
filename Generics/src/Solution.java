import java.lang.reflect.Array;

public class Solution<T> {
	
	public static void printArray(Object a){
		System.out.println(a.getClass());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ints = {1, 2, 3};
		String[] strings = {"a", "b", "c"};
		
		printArray(ints);
		printArray(strings);

	}

}
