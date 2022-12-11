package JavaSolution;

import java.util.Scanner;

public class JavaStringToken {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNext())
			System.out.println("0");
		String string = scanner.nextLine().trim();
		scanner.close();
		String[] sArray = string.split("[ .,!?'_@]+");
		if (1 <= string.length() && string.length() <= 4 * Math.pow(10, 5)) {
			System.out.println(sArray.length);
			for (String element : sArray) {
				System.out.println(element);
			}
		}

	}

}
