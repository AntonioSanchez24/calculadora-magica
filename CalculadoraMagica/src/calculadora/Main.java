package calculadora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int magicnumber = 3; /*
								 * ¿Cual era la canción del final de Spider-Man No Way Home? cual es el magic
								 * number?
								 */
		System.out.println("Selecciona opci�n.");
		System.out.println("1) Sumar.");
		System.out.println("2) Restar.");
		System.out.println("3) Dividir.");
		System.out.println("4) Multiplicar.");
		int eleccion = sc.nextInt();
		switch (eleccion) {
			case 1:
				System.out.print("Inserta el primer número:");
				int numero1 = sc.nextInt();
				System.out.print("Inserta el segundo número:");
				int numero2 = sc.nextInt(); /* David, a�ade mensajes del estilo "Inserte n�mero tal" con el sysout. */
				System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + magicnumber + ", tach�n!");
				break;
			case 2:
				System.out.print("Inserta el primer número:");
				int numero1r = sc.nextInt();
				System.out.print("Inserta el segundo número:");
				int numero2r = sc.nextInt(); /* David, a�ade mensajes del estilo "Inserte n�mero tal" con el sysout. */
				System.out.println("La resta de " + numero1r + " y " + numero2r + " es " + magicnumber + ", tach�n!");
				break;
			case 3:
				System.out.print("Inserta el primer número:");
				int numero1m = sc.nextInt();
				System.out.print("Inserta el segundo número:");
				int numero2m = sc.nextInt(); /* David, añade mensajes del estilo "Inserte n�mero tal" con el sysout. */
				System.out
						.println("La divisi�n de " + numero1m + " y " + numero2m + " es " + magicnumber + ", tach�n!");
			case 4:
				System.out.print("Inserta el primer número:");
				int numero1d = sc.nextInt();
				System.out.print("Inserta el segundo número:");
				int numero2d = sc.nextInt(); /* David, a�ade mensajes del estilo "Inserte n�mero tal" con el sysout. */
				System.out.println(
						"La multiplicación de " + numero1d + " y " + numero2d + " es " + magicnumber + ", tach�n!");
				break;
			default:
				System.out.println("Elige una opción válida");
		}
	}
}
