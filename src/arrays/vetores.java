package arrays;

import java.util.Locale;
import java.util.Scanner;

import quartos.lives;



public class vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		lives[] vect = new lives[10];
		
		System.out.println("Quantos quartos será alugados ?");
		int n = sc.nextInt();
		
		for(int i=1; i<vect.length; i++) {
			System.out.println();
			System.out.println("Quarto #" + i + ":");
			System.out.print("Name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Quarto");
			int Quarto = sc.nextInt();
			vect[Quarto] = new lives (name , email );
			}
		System.out.println();
		System.out.println("Quartos ocupados!");
		for(int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": "+ vect[i]);
			}
		}
				
				
				sc.close();
	 
	}

}
