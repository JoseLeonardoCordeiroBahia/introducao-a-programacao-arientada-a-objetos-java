package exercicio.exercicio3.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio.exercicio3.entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Name: ");
		student.name = scanner.nextLine();

		System.out.print("Grade 1: ");
		student.grade1 = scanner.nextDouble();

		System.out.print("Grade 2: ");
		student.grade2 = scanner.nextDouble();

		System.out.print("Grade 3: ");
		student.grade3 = scanner.nextDouble();

		double finalGrade = student.finalGrade();
		
		System.out.printf("FINAL GRADE = %.2f\n", finalGrade);
		
		if (finalGrade < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS\n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		;

		scanner.close();
	}

}
