package funcionario;

import java.util.Locale;
import java.util.Scanner;

import empregado.employee;

public class salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		employee emplo = new employee();
		
		System.out.println("name");
		emplo.name = sc.nextLine();
		System.out.println(" Gross Salary");
		emplo.grossSalary = sc.nextDouble();
		System.out.println("Tax");
		emplo.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee : " + emplo);
		System.out.println();
		System.out.println(" Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emplo.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data " + emplo);
		
		sc.close();
		}

}
