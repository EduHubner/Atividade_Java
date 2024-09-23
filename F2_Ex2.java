package Exercicios;

import java.util.Scanner;

public class F2_Ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int n;
		String num;
		
		
		System.out.print("Informe um número: ");
		n = entrada.nextInt();
		
		if (n > 0) {
			num = "Positivo";
		}
		else {
			if (n == 0) {
				num = "Zero";
			}
			else {
				num = "Negativo";
			}
		}
		
		System.out.println("O número informado é " + num);
		
		entrada.close();
			
	}
}