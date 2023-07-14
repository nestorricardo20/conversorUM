package oneConversor;

import java.util.Scanner;

public class Conversor {
	public static void mostrarMenu() {
		System.out.println("========================================");
		System.out.println("Bienvenido al conversor");
		System.out.println("1.- cm -> metros");
		System.out.println("2.- metors -> cm");
		System.out.println("3.- Salir");
		System.out.println("Elija una opción valida:");
		System.out.println("========================================");
	}
	public static void conversion(String unidOrigen , String unidDestino , Double proporcion, Scanner leitor) {
		System.out.println("Elegiste la opción"+ unidOrigen+"->>"+ unidDestino);
		System.out.println("Ingrese con valor: ");
		double valor=leitor.nextDouble();
		double valorFinal=valor*proporcion;
		System.out.println("el valor es: "+ valorFinal);
	}

}
