import java.util.Scanner;
public class FlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * switch(condicion) {
		 * case valor:
		 * 			codigo
		 * 			codigo
		 * 			codigo
		 * 			break;
		 * case valor:
		 * 			codigo
		 * 			codigo
		 * 			codigo
		 * 			break;
		 * default:
		 * 
		 */
		
		int dia = 6;
		String mensaje = "";
		switch(dia) {
			case 1:
				mensaje = "Lunes";
				break;
			case 2:
				mensaje = "Martes";
				break;
			case 3:
				mensaje = "Miércoles";
				break;
			case 4:
				mensaje = "Jueves";
				break;
			case 5:
				mensaje = "Viernes";
				break;
			case 6:
				mensaje = "Sábado";
				break;
			case 7:
				mensaje = "Domingo";
				break;
			default:
				mensaje = "Día inválido";
				break;
		}
		
		System.out.println(mensaje);
		
		/*
		 * Crear una calculadora que pueda sumar, restar, multiplicar y dividir
		 * 2 números.
		 * La calculadora debe pedir los dos números y posterior a eso preguntar
		 * qué operación desea realizar, el menu es el siguiente:
		 * 1. Suma
		 * 2. resta
		 * 3. Multiplicación
		 * 4. División
		 * 
		 * Al final debe mostrar los resultados de la operación
		 */
		/*
		Scanner leerNum1 = new Scanner(System.in);
		System.out.println("Bienvenido a la calculadora, escribe un número entero: ");
		int num1 = leerNum1.nextInt();
		
		Scanner leerNum2 = new Scanner(System.in);
		System.out.println("Gracias, escribe otro número entero: ");
		int num2 = leerNum2.nextInt();
		
		Scanner leerOperacion = new Scanner(System.in);
		System.out.println("Escribe el número de la operación deseas realizar: 1. Suma, 2. Resta, 3. Multiplicación, 4. División: ");
		int operacion = leerOperacion.nextInt();
		
		String respuesta = "";
		switch(operacion) {
			case 1:
				int resultadoSum = num1 + num2;
				respuesta = "Su resultado es: " + resultadoSum;
				break;
			case 2:
				int resultadoRes = num1 - num2;
				respuesta = "Su resultado es: " + resultadoRes;
				break;
			case 3:
				int resultadoMul = num1 * num2;
				respuesta = "Su resultado es: " + resultadoMul;
				break;
			case 4:
				float resultadoDiv = (float)num1 / num2;
				respuesta = "Su resultado es: " + resultadoDiv;
				break;
			default:
				respuesta = "Operación inválida, por favor elija un número entre 1 y 4.";
				break;
		}
		
		System.out.println(respuesta);
		
		*/
		
/*
 * Crear un programa donde se introduzcan los tres ángulos internos de un 
 * triángulo y se determine si el triángulo es válido o no.
 */
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Revisemos si tu triángulo es válido, escribe el valor del primer ángulo: ");
		float ang1 = leer.nextFloat();
		
		System.out.println("Ahora, escribe el valor del segundo ángulo: ");
		float ang2 = leer.nextFloat();
		
		System.out.println("Por último, el valor del tercer ángulo: ");
		float ang3 = leer.nextFloat();
		
		float triangulo = ang1 + ang2 + ang3;
		
		if (triangulo == 180 && ang1 != 0 && ang2 != 0 && ang3 != 0) {
			
		System.out.println("La suma de los ángulos es " + triangulo + ". Tu triángulo es válido");
		} else if (triangulo == 180 && ang1 == 0 || ang2 == 0 || ang3 == 0) {
		System.out.println("Aunque la suma de los ángulos es " + triangulo + ", tu triángulo es inválido");
		} else {
			System.out.println("La suma de los ángulos es " + triangulo + ". Tu triángulo es inválido");
		}
		
	}
	
	

}
