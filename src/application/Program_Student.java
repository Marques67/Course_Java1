package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program_Student {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Final Grade = %.2f\n", student.Media());
		
		if(student.Media() > 60.0) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
			System.out.println("Missing " + student.missingPoints() + " points");
		}
		
		
		sc.close();

	}

}
