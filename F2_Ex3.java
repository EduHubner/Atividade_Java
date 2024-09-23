package Exercicios;

import java.util.Scanner;

public class F2_Ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char letra;
		String sexo;
		
		System.out.print("Informe a letra correspondente ao seu sexo (F/M): ");
		letra = entrada.nextLine().charAt(0);
		
		if (letra != 'M' && letra != 'F') {
			System.out.println("A letra informada não corresponde às opções possiveis!");
		}
		else {
			if (letra == 'M') {
				sexo = "Masculino";
			}
			else {
				sexo = "Feminino";
			}
			
			System.out.println("Sexo: " + sexo);
		}
		
		entrada.close();
		
	}
}