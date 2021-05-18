package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program_Rectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("�rea = %.2f\n", rect.Area());	
		System.out.printf("Perimeter = %.2f\n", rect.Perimeter());
		System.out.printf("Diagonal = %.2f\n", rect.Diagonal());
		
		sc.close();

	}

}
