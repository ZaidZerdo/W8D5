package main;

public class ExampleSearch {

	public static void main(String[] args) {
		int[] array = {1, 2, 4, 5, 7, 12, 13};
		
		System.out.println(binarySearchR(array, 3));
	}
	
	private static int binarySearchR(int[] array, int element) {
		return binarySearchR(array, element, 0, array.length - 1);
	}
	
	private static int binarySearchR(int[] array, int element, int start, int end) {
		if (start >= end) {
			return -1;
		}
		
		int middle = (start + end) / 2;
		if (array[middle] == element) {
			return middle;
		}
		
		if (array[middle] > element) {
			return binarySearchR(array, element, start, middle);
		} else {
			return binarySearchR(array, element, middle + 1, end);
		}
	}
	
	private static int binarySearch(int[] array, int element) {
		int start = 0;
		int end = array.length - 1;
		int middle = (start + end) / 2;
		
		while (array[middle] != element) {
			if (start >= end) {
				return -1;
			}
			
			if (array[middle] > element) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
			middle = (start + end) / 2;
		}
		
		return middle;
	}

}
