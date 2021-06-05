package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee_Polimorfismo;
import entities.OutsourcedEmployee_Polimorfismo;

public class Program_Polimorfismo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee_Polimorfismo> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				//Employee_Polimorfismo emp = new OutsourcedEmployee_Polimorfismo(name, hours, valuePerHour, additionalCharge);
				list.add(new OutsourcedEmployee_Polimorfismo(name, hours, valuePerHour, additionalCharge));
			}
			else {
				//Employee_Polimorfismo emp = new Employee_Polimorfismo(name, hours, valuePerHour);
				list.add(new Employee_Polimorfismo(name, hours, valuePerHour)); //dessa maneira, não precisa declarar a variavel emp
			}
		}
		
		System.out.println();
		System.out.println("Payments: ");
		for(Employee_Polimorfismo emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
