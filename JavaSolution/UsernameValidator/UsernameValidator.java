package JavaSolution;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {

	public static void main(String[] args) {
		// username consists of 8 to 30 character inclusive
		// the username can only contain alphanumeric character and underscore(_)
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter num:");
		int n = Integer.parseInt(scanner.next());
		while (n-- > 0) {
			System.out.println("enter your username:");
			String input = scanner.next();
			if (check(input)) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}

		}
		scanner.close();
	}

	public static boolean check(String input) {
		final String regex = "^[a-zA-Z]\\w{7,29}";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(input).matches();
	}
}
