package rieder;

import java.util.Scanner;

/**
 * Dieses Programm multipliziert 2 vom Benutzer eingebene ganze Zahlen
 * @author Jordi Rieder
 * @version 2018-02-13
 */
public class Projekt2 {
	public static void main(String[] args) {
		System.out.println(Multiplizieren());
	}
	public static int Multiplizieren() {
		System.out.println("Multiplikation:");
		System.out.println("Bitte geben Sie die erste Zahl ein:");
		Scanner s = new Scanner(System.in);
		int eingabe1 = s.nextInt();
		System.out.println("Bitte geben Sie die zweite Zahl ein:");
		int eingabe2 = s.nextInt();
		return (eingabe1 * eingabe2);
	}
}
