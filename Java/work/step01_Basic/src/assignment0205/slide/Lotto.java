package assignment0205.slide;

class LottoTech {
		// 중복 체크 메서드
		public boolean isDuplicate(int[] arr) {
			for(int i=0;i<6;i++) {
				for(int j=i+1;j<6;j++) {
					if(arr[j] == arr[i]) {
						return true;
					}
				}
			}
			return false;
		}
	
		// 숫자 6개를 배열방에 저장하는 메서드 : lotto[index] = 값
		
		/**
		 * 전체를 중복체크하지 않고 이미 만들어진 값들만가지고 중복체크?
		 * 
		 */
		public int[] getRandom() {
			int[] numbers = new int [6];
			for(int i=0; i<numbers.length; i++) {
				numbers[i] = (int)(Math.random()*45+1);
			}
			return numbers;
		}
		
		// 배열방의 값을 내림차순으로 정렬하는 메서드
		public int[] selectSort(int arr[]) {
			int len = arr.length;
			for(int i=0; i<len; i++) {
				int max = 0;
				for(int j=i; j<len; j++) {
					if(max < arr[j]) {
						max = arr[j];
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			return arr;
		}
		
		// 배열의 값을 화면에 출력하는 메서드
		public void printArray(int[] arr) {
			for(int i: arr) {
				System.out.print(i + " ");
			}
		}
}
public class Lotto {
	
	public static void main(String[] args) {
		// 로또 번호 6개를 배열 방에서 중복되지 않게 만들어서 출력하기
		// 1~45까지 출력을 할 때 내림차순으로 출력.
		LottoTech lt = new LottoTech();
		while(true) {
			int [] lotto_number = lt.getRandom();

			if(lt.isDuplicate(lotto_number)) {
				System.out.println("중복");
			} else {
				int [] sorted = lt.selectSort(lotto_number);
				for(int i:sorted) {
					System.out.print(i + " ");
				}
				break;
			}
		}
		
	}
	
}
