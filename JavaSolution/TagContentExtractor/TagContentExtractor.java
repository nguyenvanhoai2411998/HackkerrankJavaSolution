package JavaSolution;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.nextLine());
		String regex = "<(.+)>([^<>]+)</\\1>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher;

		while (testCase-- > 0) {
			String input = scanner.nextLine().trim();
			matcher = pattern.matcher(input);
			if (matcher.find()) {
				matcher.reset();
				while (matcher.find()) {
					System.out.println(matcher.group(2));
				}
			} else {
				System.out.println("none");
			}
		}

		scanner.close();

	}

}
