package triangle;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {

		System.out.println("donner le nombre de lignes");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < (2 * i) + 1; k++) {
				System.out.print("*");
			}

			System.out.println();
			sc.close();
		}
	}
}
