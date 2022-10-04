package ListaDeExerciciosPraPraticar;
import java.util.Scanner;

public class ListaDeExercicio5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		 System.out.print("Metros? ");
		  double metros = entrada.nextDouble();

		  double centimetros = metros * 100;
		  System.out.println("A medida do cemtimetro é: " + centimetros);
		  
		  entrada.close();
		
		
	}

}
