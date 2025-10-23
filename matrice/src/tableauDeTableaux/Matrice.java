package tableauDeTableaux;

public class Matrice {
	private Matrice() {
	}

	public static void afficher(double[][] t) {
		for (double[] ligne : t) {
			for (double val : ligne) {
				System.out.print(" " + val + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static boolean regulier(double[][] t) {

		for (int i = 0; i < t.length - 1; i++) {
			if (t[0].length != t[i + 1].length) {
				return false;
			}
		}
		return true;
	}

	public static double[] sommeLigne(double[][] t) {
		double[] tab = new double[t.length];
		for (int i = 0; i < t.length; i++) {
			double somme = 0.0;
			for (int j = 0; j < t[i].length; j++) {
				somme += t[i][j];
			}
			tab[i] = somme;
		}
		return tab;
	}

	public static double[][] somme(double[][] t1, double[][] t2) {

		double[][] t3 = new double[t1.length][t1[0].length];

		if (regulier(t1) && Matrice.regulier(t2) && t1.length == t2.length && t1[0].length == t2[0].length) {

			for (int i = 0; i < t3.length; i++) {
				for (int j = 0; j < t3[i].length; j++) {
					t3[i][j] = t1[i][j] + t2[i][j];
				}
			}
		} else {
			return null;
		}

		return t3;
	}

}
