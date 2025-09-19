package ejercicio13;

import java.util.Scanner;

public class ejer13 {

	public static void main(String[] args) {
		
		// Definición de variables
		double num1 = 0;
		Scanner input = new Scanner(System.in);
		
		// Creación de programa
		// Se pide el primer número
		System.out.println("Introduce el primer número: ");
		// Se recoge el valor de la variable num1
		num1 = input.nextDouble();

		// Se verifica si la nota es menor que 5
		if (num1 < 5) {
			// Se imprime la respuesta
            System.out.println("Suspenso");
         // Se verifica si la nota es menor que 6 y mayor o igual a 5
        } else if (num1 < 6) {
        	System.out.println("Suficiente");
         // Se verifica si la nota es menor que 7 y mayor o igual a 6
        } else if (num1 < 7) {
        	System.out.println("Bien");
         // Se verifica si la nota es menor que 9 y mayor o igual a 7
        } else if (num1 < 9) {
        	System.out.println("Muy bien");
         // Se verifica si la nota es menor o igual que 10 y mayor o igual a 9
        } else if (num1 <= 10) {
        	System.out.println("Sobresaliente");
         // Si no cumple ninguna condición
        } else {
        	System.out.println("ERROR");
        }
	}

}