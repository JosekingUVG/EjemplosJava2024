/*
Ejemplos de clases
30/7/2012
*/
//Se importa la clase Random del paquete util
import java.util.Random;

public class PruebaClasesJava
{
	public static void main(String[] args)
	{
		//--------------------------------------------------------------------------------------------
		//Clase String
		//--------------------------------------------------------------------------------------------
		String cadena = "Hola como estas";
		char caracter= cadena.charAt(5); //Devuelve el caracter en la posici�n pasada como par�metro
		
		//Mostrando los resultados
		System.out.println("El caracter en la posici�n 5 es: "+caracter);
		
		System.out.println("La longitud de la cadena es: "+cadena.length()); //Longitud de la cadena
		
		System.out.println("El caracter en la �ltima posici�n es: "+cadena.charAt(cadena.length()-1));//muestra el �ltimo caracter de la cadena
		
		//--------------------------------------------------------------------------------------------
		//Clase random
		//--------------------------------------------------------------------------------------------
		
		Random ran = new Random(); //Se crea el objeto ran de la clase Random
		
		int numero = ran.nextInt(); //genera cualquier n�mero entero aleatorio puede generar un n�mero tanto positivo como negativo
		int numero2 = ran.nextInt(100); //genera un n�mero entero aleatorio entre 0 y 99
		
		//Mostrando los los resultados
		System.out.println("El numero entero aleatorio es: "+numero);
		//System.out.println("El numero entero aleatorio con limite es: "+numero2);
		
		//--------------------------------------------------------------------------------------------
		//Clase Math
		//--------------------------------------------------------------------------------------------
		int numeroRaiz = 4;
		double raizCuadrada = Math.sqrt(numeroRaiz); //Se calcula la ra�z cuadrada de un n�mero
		//Mostrando resultados
		//Se muestran resultados
		
	}
}