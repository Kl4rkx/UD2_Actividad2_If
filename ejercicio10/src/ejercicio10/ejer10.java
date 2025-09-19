package ejercicio10;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		
		
		// Definición de variables
		int num1,num2,num3 = 0;
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
		
		// Se verifica si los números son mayores que el otro
		if (num1 < num2 && num2 < num3) {
			// Se imprime la respuesta
            System.out.println("El tercer número introducido es mayor que los otros 2");
         // Se verifica si los números son menores o iguales
        } else {
        	// Se imprime la respuesta
            		System.out.println("ERROR");
                } 
	}

}