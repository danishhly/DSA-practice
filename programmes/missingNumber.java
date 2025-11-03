package programmes;
import java.util.Scanner;

public class missingNumber {
static int MissingNumber(int[] arr, int n) {
	long expected = (long) n * (n + 1) / 2;


long actual = 0;
for(int x : arr) {
	actual += x;
}
return (int) (expected - actual);
}


}

