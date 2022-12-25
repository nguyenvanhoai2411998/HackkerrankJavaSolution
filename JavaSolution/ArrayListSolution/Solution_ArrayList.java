package JavaSolution;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_ArrayList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n, d, q, x, y;
		ArrayList<ArrayList<Integer>> arrayMom = new ArrayList<>();
		n = scanner.nextInt();

		// insert element into array
		while (n-- > 0) {
			ArrayList<Integer> arraySon = new ArrayList<>();
			d = scanner.nextInt();
			while (d-- > 0) {
				arraySon.add(scanner.nextInt());
			}
			arrayMom.add(arraySon);
		}

		// insert querries
		q = scanner.nextInt();
		while (q-- > 0) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			// get (x,y) locate value
			if (x >= 0 && x <= arrayMom.size()) {
				if (y >= 0 && y <= arrayMom.get(x - 1).size()) {
					System.out.println(arrayMom.get(x - 1).get(y - 1));
					continue;
				}
			}
			System.out.println("ERROR!");
		}
		scanner.close();
	}
}
