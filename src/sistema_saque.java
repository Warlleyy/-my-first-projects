import java.util.Locale;
import java.util.Scanner;

import banco.new_conta;

public class sistema_saque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		new_conta new_conta;
		
		System.out.print("Entre com o número da conta");
		int número = sc.nextInt();
		System.out.print("Entre com seu nome ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Tem deposito inicial (s/n )?");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Entre com o valor do deposito ");
			double depositoInicial = sc.nextDouble();
			new_conta = New_conta (saldo, suporte, depositoInicial);
		}
		
		
		
		
		
		sc.close();
		

	}

}
