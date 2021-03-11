package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Programa utilizando um vetor tipo primitivo

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, Enter Vector´s Size");
		int n = sc.nextInt();

		System.out.println(" Enter Vector´s Values");
		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.print("Average Rate: = " + avg);

		sc.close();
	}

}
