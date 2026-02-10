package assignment0205.array;

public class ArrayQuestion7 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = Integer.MIN_VALUE;
		for(int i : array) {
			if(max<i) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
