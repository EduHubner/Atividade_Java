package Exercicios;
import java.util.Scanner;
public class F1_Ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float metros;
		
		System.out.print("Informe um valor em metros: ");
		metros = entrada.nextFloat();
		
		System.out.println("Em centímetros: " + metros*100);
		
		entrada.close();
	}
}
