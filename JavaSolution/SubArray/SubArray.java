package JavaSolution;

public class SubArray {

	public static void main(String[] args) {

		int[] arr = { 1, -2, 4, -5, 1 };
		int n = 0;
		int start = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				n = i + 1;
				start = j;
				int sum = 0;
				while (n-- > 0 && start <= arr.length - n) {
					sum += arr[start++];
				}
				if (sum < 0)
					count++;
			}
		}
		System.out.println(count);

	}
}
