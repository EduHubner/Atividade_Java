package Exercicios;

import java.util.Scanner;

public class F2_Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Informe o primeiro numero: ");
		num1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		num2 = entrada.nextInt();
		
		if (num2 > num1) {
			num1 = num2;
		}
		
		System.out.println("O maior deles é o numero " + num1);
		
		entrada.close();
				
	}

}