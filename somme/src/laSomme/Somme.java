package laSomme;

import java.util.Scanner;

public class Somme {

	public static void main(String[] args) {
		
		System.out.println("donner le n de la somme");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		float somme = 1;
		
		for (int i = 1; i < n; i++) {
			somme = somme + (1/i); 
		}
		
		System.out.println("la somme est: "+somme);
	}

}
