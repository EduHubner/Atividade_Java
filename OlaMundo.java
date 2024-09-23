package Exercicios;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);


		System.out.print("Digite um número (int): ");
		int num = entrada.nextInt();
		
		System.out.print("Digite um número (float): ");
		float fnum = entrada.nextFloat();
		
		//float f2num = 1.845f;
		
		System.out.print("Digite um número (double): ");
		double dnum = entrada.nextDouble();
		
		entrada.nextLine(); // limpeza do buffer, um /n que pula a leitura da string
		
		System.out.print("Digite um nome: ");
		String texto = entrada.nextLine();
		
		System.out.print("Digite uma letra: ");
		char letra = entrada.nextLine().charAt(0);
		
		boolean logico = true;
		
		


		System.out.println("Olá Mundo"); // escreva da vida

		System.out.println("Inteiro: " + num);
		System.out.println("Número float: " + fnum);
		System.out.println("Número double: " + dnum);
		System.out.println("Letra: " + letra);
		System.out.println("Boolean: " + logico);
		System.out.println("Texto: " + texto);


		entrada.close();

	}

}