package assignment0205.array;
/**
 * 작성일: 20260205
 * 
 */
public class ArrayQuestion8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int count = 0;
		double avg;
		
		for(int[] row: array) {
			for(int col: row) {
				count++;
				sum+= col;
			}
		}
		avg = (double)sum/count;
		
		System.out.println("sum: " + sum + "  avg: " + avg);
	}

}
