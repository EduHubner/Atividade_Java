package Exercicios;
import java.util.Scanner;

public class F2_Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int ano;
		
		String bissexto; 
		
		System.out.print("Informe um ano: ");
		ano = entrada.nextInt();
		
		if (ano%400 == 0 || (ano%4 == 0 && ano%100 != 0)) {
			bissexto = "é bissexto";
		}
		else {
			bissexto = "não é bissexto";
		}
		
		System.out.println("O ano " + bissexto);
		
		entrada.close();
	}

}
