package programa04;

import java.util.Scanner;

public class programa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese su edad: ");
		edad = leer.nextInt();
		if (edad>=18) {
			System.out.println("Usted es mayor de edad");
		}
				

	}

}
