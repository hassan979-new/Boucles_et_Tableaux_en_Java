package fenetreGlaissante;

import java.util.Scanner;


public class FenetreGlaissante {
	
	public static void elmentsDistict(int[] t,int k){
		int MAXV = 100001;
		int[] freq = new int[MAXV];
		int distinct = 0;
		
		for (int i = 0; i < k; i++) {
			if (freq[t[i]]==0) {
				distinct++;
			}
			freq[t[i]]++;
		}
		System.out.print(distinct+" ");
		
		for (int i = k; i < t.length; i++) {
			int out = t[i-k];
			int in = t[i];
			
			freq[out]--;
			if (freq[out]==0) {
				distinct--;
			}
			
			if (freq[in]==0) {
				distinct++;
			}
			freq[in]++;
			System.out.print(distinct+" ");
		}
	}

	public static void main(String[] args) {
		 System.out.println("donner la valeur de n (<=100000) et de k (1 <= k <= n)");
		 Scanner sc = new Scanner(System.in);
		  
		 int n = sc.nextInt();
		 int k = sc.nextInt();
		 int[] T = new int[n];
		 
		 for (int i = 0; i < T.length; i++) {
			System.out.println("donner la valeur: "+(i+1));
			T[i]= sc.nextInt();
		}
		 
		 elmentsDistict(T,k);
		 
	}

}
