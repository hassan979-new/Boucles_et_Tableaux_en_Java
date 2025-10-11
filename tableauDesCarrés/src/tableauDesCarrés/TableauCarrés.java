package tableauDesCarrés;

import java.util.Scanner;

public class TableauCarrés {
	
	public static int[] tableauCarrés(int n, int[] t) {
		for (int i = 0; i < n; i++) {
			t[i]= (int) Math.pow((2.0*i)+1.0, 2.0);
		}
		return t;
	}

	public static void main(String[] args) {
		
		System.out.println("donner n: ");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] tab = new int[n];
		
		tab = tableauCarrés(n, tab);
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println(((2*i)+1)+" a pour carre: "+tab[i]);
		}
	}

}
