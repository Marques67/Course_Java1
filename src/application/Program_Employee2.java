package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Program_Employee2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee2> list = new ArrayList<>();
				
		System.out.print("How many employees will be registered? ");
		Integer num_employee = sc.nextInt();
		
		for (int i=0; i < num_employee; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i +1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee2 emp = new Employee2(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee ID that will be have salary increase: ");
		Integer num_ID = sc.nextInt();
		Integer pos = position(list, num_ID);
		if(pos == null) {
			System.out.println("This ID does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee2 emp : list) {
			System.out.println(emp);
		}
			
		sc.close();
	}
	
	public static Integer position(List<Employee2> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
