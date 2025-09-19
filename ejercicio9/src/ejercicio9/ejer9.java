package ejercicio9;
import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
		
		// Definición de variables
		String usuario = "ikaslea";
		String contraseña = "ik1920";
		String inpusuario = "";
		String inpcontraseña = "";
		Scanner input = new Scanner(System.in);
		
		// Creación de programa
		// Se pide el usuario
		System.out.println("Introduzca el usuario: ");
		// Se recoge el valor de la variable inpusuario
		inpusuario = input.nextLine();
		// Se pide la contraseña
		System.out.println("Introduzca la contraseña: ");
		// Se recoge el valor de la variable inpcontraseña
		inpcontraseña = input.nextLine();
		
		// Se verifica si el usuario es correcto
		if (inpusuario.equals(usuario) && inpcontraseña.equals(contraseña)) {
			// Se imprime la respuesta
            System.out.println("Las credenciales que has introducido son correctas");
        } else {
        	// Se imprime la respuesta
            		System.out.println("Las credenciales introducidas son incorrectas");
        }
		
	}

}
