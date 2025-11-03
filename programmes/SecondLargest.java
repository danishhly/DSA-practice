package programmes;
import java.util.Scanner;

public class SecondLargest {

	static Integer SecondLargest(int[] arr) {
		Integer first = null, second = null;
		for(int x : arr) {
			if ( first == null || x > first) {
				second = first;
				first = x;
			} else if( x != first && ( second == null || x > second)) {
				second = x;
			}
		}

		return second;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();;

		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();  
		}

		Integer result = SecondLargest(arr);

	if( result == null) {
		System.out.println("no distinct second largest found");
	} else {
		System.out.println("Second largest element = " + result);
	}
}
	}