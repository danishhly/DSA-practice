package programmes;

import java.util.*;

public class findingTarget {
public static void main(String[] args) {
	int[] arr = {1, 3, 5, 8, 9, 10,  11, 13}; 
	int target = 9;

	int result = binarySearch(arr, target);

	if(result != -1){
	System.out.println("Element Found at index: " +result);
	} else {
	System.out.println("Element not found.");
	}
}


static int binarySearch(int arr[], int target) {
	int left = 0, right = arr.length - 1;
	while(left <= right) {
		int mid = left + (right - left) / 2;
		if(arr[mid] == target) return mid; 
		else if (arr[mid] < target) left = mid + 1;
		else right = mid - 1;
	}

	return -1;
}
}