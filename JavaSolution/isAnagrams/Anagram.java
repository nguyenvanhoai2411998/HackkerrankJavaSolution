package JavaSolution;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("String a:");
		String a = scanner.next().trim();
		System.out.println("String b:");
		String b = scanner.next().trim();
		scanner.close();
		System.out.println(isAnagrams(a, b) ? "Anagrams" : "Not Anagrams");
	}

	private static boolean isAnagrams(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.length() != b.length())
			return false;
		int[] count = new int[256];

		for (int i = 0; i < a.length(); i++) {
			count[a.charAt(i)]++;
			count[b.charAt(i)]--;
		}
		for (int i = 0; i < 256; i++) {
			if (count[i] != 0)
				return false;
		}
		return true;
	}

}