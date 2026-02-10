package assignment0205.slide;

class SortTech {
	
	// 버블 정렬
	public int [] bubbleSort(int arr[]) {
		int len = arr.length;
		for(int i=0; i<len ;i++) {
			for(int j=0; j < len - i -1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	// 선택 정렬
	public int[] selectionSort(int arr[]) { 
		int len = arr.length;
		for(int i=0; i<len; i++) {
			int minIndex = i;
			for(int j=i; j<len; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	// 삽입 정렬
	public int [] insertSort(int arr[]) {
		int tempValue, target;
		int len = arr.length;
		for(int i = 1; i<len; i++) {
			tempValue = arr[i];
			target = i-1;
			while(target >= 0 && arr[target] > tempValue) {
				arr[target + 1] = arr[target];
				target --;
			}
			arr[target + 1] = tempValue;
		}
		return arr;
	}
}

public class Sort {
	public static void main(String[] args) {
		int arr [] = {5,7,1,2,4,8,9,6,10};
		SortTech st = new SortTech();
		int newArr[] = st.insertSort(arr);
		for(int i:newArr) {
			System.out.print(i + " ");
		}
	}
}

