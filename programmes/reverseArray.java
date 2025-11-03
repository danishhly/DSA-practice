package programmes;
import java.util.*;

public class reverseArray {
	public static void main(String[] args) {
	int arr[] = {1, 2, 3, 4, 5};

	System.out.println("Original Array: ");
	printArray(arr);

	reversedArray(arr);

	System.out.println("Reversed Array: ");
	printArray(arr);
	}

	static void reversedArray(int[] arr){
	int left = 0;
    int right = arr.length - 1;
	while(left < right) {
	int temp = arr[left];
	arr[left] = arr[right];
	arr[right] = temp;
	left++;
	right--;
	}
	}

	static void printArray(int[] arr) {
	for(int num: arr) {
	System.out.println(num + " ");
	}
	System.out.println();
	}
}