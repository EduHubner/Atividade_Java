package Exercicios;
import java.util.Scanner;
public class F1_Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float raio;
		
		System.out.print("Informe o valor do raio da circunferencia: ");
		raio = entrada.nextFloat();
		
		System.out.println("A área da circuferencia é: " + Math.PI*(raio*raio));
		
		entrada.close();

	}

}
