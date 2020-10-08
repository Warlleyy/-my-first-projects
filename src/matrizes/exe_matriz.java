package matrizes;

import java.util.Scanner;

public class exe_matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][] mat = new int[m][n];
		
		 for (i=0; i<mat.length; i++){
			 for (j=0; j<n; j++) {
				 mat[i][j] = sc.nextInt();
			 }
			 
		 }
		
		
		sc.close();
	}

}
