package rotationMatrice;

import java.util.Scanner;

public class TesterRotation {
	public static void main(String[] args) {

		System.out.println("donner un entier (entre 2-200)");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] matrice = new int[n][n];

		int a = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrice[i][j] = a++;
			}
		}

		System.out.println("le matrice originel");

		Rotation90.afficher(matrice);

		Rotation90.rotate90ClockwiseInPlace(matrice);

		System.out.println("le matrice aprés la retation: ");

		Rotation90.afficher(matrice);

		sc.close();

	}
}
