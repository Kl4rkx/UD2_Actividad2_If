package ejercicio2;
import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		// Definición de variables
		int num1 = 0;
		int num2 = 0;
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
		
		// Se verifica si los números son iguales
		if (num1 == num2) {
			// Se imprime la respuesta
            System.out.println("Los números introducidos tienen el mismo valor.");
         // Se verifica si hay un número mayor que el otro
        } else if (num1 > num2) {
        	// Se imprime la respuesta
            		System.out.println(num1+" Es mayor que "+num2);
                } else {
                	// Se imprime la respuesta
                	System.out.println(num2+" Es mayor que "+num1);
                }
	}

}
