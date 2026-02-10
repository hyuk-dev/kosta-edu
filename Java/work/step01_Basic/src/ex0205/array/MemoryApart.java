package ex0205.array;

class MultiArray{
//정수형 2차원 배열 8*9
//	int [][] arr = new int[8][0];
//메소드이름 :array99
	
	//for loop 를 사용하여 
	//배열에 곱한 (구구단)결과저장
	//배열에 결과를 꺼내출력
	
//	int [][] arr = new int [][] {
//		{1, 3, 4},
//		{2,4,6,8,10},
//		{2}
//	};
	int [][] arr = new int[8][9];
	
	public void array99() {
		// 각 행의 열을 생성
//		arr[0] = new int [3];
//		arr[1] = new int [1];
//		
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[0][0]);
		
		for(int row = 0; row < arr.length; row ++) { // 8행
			for(int col = 0; col < arr[row].length; col ++) { // 9 
				arr[row][col] = (row+2) * (col+1);
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--- 개선된 for 문 ---");
		for(int[] row : arr) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				arr[i-2][j-1] = i*j;
			}
		}
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%3d ",arr[i-2][j-1] );
				
			}
			System.out.println();
		}
		
		
	}		
}

public class MemoryApart{
//main메소드에서 
//MultiArray객체의 array99메소드호출
	public static void main(String[] args) {
		MultiArray ma = new MultiArray();
		ma.array99();
	}
}

