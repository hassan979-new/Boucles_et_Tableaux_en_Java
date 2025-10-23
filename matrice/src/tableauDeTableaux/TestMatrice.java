package tableauDeTableaux;

//import tableauDeTableaux.Matrice;

public class TestMatrice {
	public static void main(String[] args) {
		double[][] t1 = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 }, };

		double[][] t2 = { { 7.0, 8.0, 9.0 }, { 10.0, 11.0, 12.0 } };

		System.out.println("affichage de t1: ");
		Matrice.afficher(t1);
		System.out.println("affichage de t2: ");
		Matrice.afficher(t2);

		if (Matrice.regulier(t1)) {
			System.out.println("le tableau t1 est regulier");
		} else {
			System.out.println("le tableau t1 n'est pas regulier");
		}

		double[] t3 = Matrice.sommeLigne(t1);

		System.out.println("Sommes des lignes de t1 :");

		for (int i = 0; i < t3.length; i++) {
			System.out.print(" " + t3[i] + " ");
		}
		System.out.println();

		double[][] sommeTotale = Matrice.somme(t1, t2);
		if (sommeTotale != null) {
			System.out.println("Somme de t1 et t2 :");
			Matrice.afficher(sommeTotale);
		} else {
			System.out.println("Les tableaux ne sont pas compatibles.");
		}
	}
}
