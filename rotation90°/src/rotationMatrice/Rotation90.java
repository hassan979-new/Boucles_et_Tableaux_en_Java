package rotationMatrice;

public class Rotation90 {
	public static void rotate90ClockwiseInPlace(int[][] M) {
		
		for (int i = 0; i < M.length; i++) {
			int tmp = 0;
			for (int j = i+1; j < M.length; j++) {
				tmp=M[j][i];
				M[j][i]=M[i][j];
				M[i][j]=tmp;
			}
		}
		
		for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length / 2; j++) {
                int temp = M[i][j];
                M[i][j] = M[i][M.length - j - 1];
                M[i][M.length - j - 1] = temp;
            }
        }
		
		
	}
	
	public static void rotate180InPlace(int[][] M) {
		rotate90ClockwiseInPlace(M);
		rotate90ClockwiseInPlace(M);
	}
	
	public static void afficher(int[][] A) {
        for (int[] ligne : A) {
            for (int val : ligne) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
	}
	
}

