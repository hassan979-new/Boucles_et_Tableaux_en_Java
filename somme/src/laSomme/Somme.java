package laSomme;

import java.util.Scanner;

public class Somme {

	public static void main(String[] args) {

		System.out.println("donner le n de la somme");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double somme = 0.0;

		for (int i = 1; i <= n; i++) {
			somme += 1.0 / i;
		}

		System.out.println("la somme est: " + somme);

		sc.close();
	}

}
