package ejercicio15;

import java.util.Scanner;

public class ejer15 {

	public static void main(String[] args) {
		
		// Definición de variables
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Scanner input = new Scanner(System.in);
		
		// Creación de programa
		// Se pide el primer número
		System.out.println("Introduce el primer número: ");
		// Se recoge el valor de la variable num1
		num1 = input.nextInt();
		// Se pide el segundo número
		System.out.println("Introduce el segundo número: ");
		// Se recoge el valor de la variable num2
		num2 = input.nextInt();
		// Se pide el tercer número
		System.out.println("Introduce el tercer número: ");
		// Se recoge el valor de la variable num3
		num3 = input.nextInt();
		
		// Se verifica que num1 sea menor que los otros números
		if (num1 < num2 && num1 < num3 && num3 > num2) {
			System.out.println(num1+" \n"+num2+" \n"+""+num3);
			
		// Se verifica que num2 sea menor que los otros números
		} else if (num2 < num1 && num2 < num3 && num3 > num1) {
			System.out.println(num2+" \n"+num1+" \n"+""+num3);
			
		// Se verifica que num3 sea menor que los otros números
		} else if (num3 < num1 && num3 < num2 && num1 < num2) {
			System.out.println(num3+" \n"+num1+" \n"+""+num2);
			
		// Se verifica si no se cumple ninguna de las condiciones
		} else {
			System.out.println("No puedes introducir números iguales.");
		}
	}
}
