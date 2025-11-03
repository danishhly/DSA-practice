package programmes;
import java.util.*;

public class MoveZeroes{
	public static void main(String[] args) {
		int[] arr = {0, 1, 4, 0, 3, 12};

		System.out.println("OriginalArray: ");
		printArray(arr);

		moveZeroes(arr);

		System.out.println("After Moving arrays: ");
		printArray(arr);
	}

	static void moveZeroes(int[] arr){
		int index = 0;
		for(int num : arr) {
			if (num != 0) {
			arr[index++] = num;
		
		}
	}

	while (index < arr.length) {
		arr[index++] = 0;
	}
	}

	static void printArray(int[] arr) {
		for(int num : arr) {
			System.out.println(num + " ");
		}
		System.out.println();
	}
}