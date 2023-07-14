package oneConversor;
import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int input=0;
		
		while (input!=9) {
			Conversor.mostrarMenu();
			input=entrada.nextInt();
			
			switch (input) {
			case 1:
				Conversor.conversion("cm", "metros", 0.01, entrada);
				break;
			case 2: 
				Conversor.conversion("metros", "cm", 100.0, entrada);
				break;
			case 9: 
				System.out.println("Que pena Saliendo del Programa");
				break;
			
			default:
				System.out.println("Elija una opcion valida!!");
				break;
			}
			
		}

	}

}
