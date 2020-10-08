package escola;

import java.util.Locale;
import java.util.Scanner;

import unip.aluno;

public class nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		aluno alu = new aluno();
		
		alu.nome = sc.nextLine();
		alu.nota1 = sc.nextDouble();
		alu.nota2 = sc.nextDouble();
		alu.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grande: %.2f%n" , alu.notaFinal());
		 if (alu.notaFinal() < 60.0) {
			 System.out.println("falhou");
			 System.out.printf(" faltou %.2f pontos%n" , alu.pontoFinal());
		 }
			 else {
				 System.out.println("Passou");
			 }
		 sc.close();
		 }
		

	}


