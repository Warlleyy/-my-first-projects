package lista_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import lista.Employye;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employye> list = new ArrayList<>();
		
		System.out.println(" A Quantos funcionarios registrados ?");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println( "Employee #" + (i+1) +":" );
			System.out.print("id");
			Integer id= sc.nextInt();
			System.out.print("Name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employye emp = new Employye(id,name,salary);
			
			list.add(emp);
					
		}
		
		System.out.print("Entre com id do empregado que ira receber o reajuste ");
		 int idsalary = sc.nextInt();
		 Integer pos = position(list, idsalary);
		 if(pos == null) {
			 System.out.println("Esse id não existe!");
		 }
		 else {
			 System.out.println("Entre com a porcentagem ");
			 double percent = sc.nextDouble();
			 list.get(pos).increaseSalary(percent);
		 }
		 System.out.println();
		 System.out.println("Lista de empregados:");
		 for (Employye emp : list ) {
			 System.out.println(emp);
		 }
		
		sc.close();
		

	}
	public static Integer hasId(List<Employye> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
		
	}

}
