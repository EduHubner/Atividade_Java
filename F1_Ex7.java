package Exercicios;
import java.util.Scanner;
public class F1_Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int lado;
		System.out.print("Informe o valor do lado do quadrado: ");
		lado = entrada.nextInt();
		
		System.out.println("O valor da área do quadrado: " + (lado*lado));
		
		entrada.close();

	}

}
