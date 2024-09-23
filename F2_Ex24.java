package Exercicios;

import java.util.Scanner;

public class F2_Ex24 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = in.nextInt();
		System.out.print("Informe a segunda nota: ");
		nota2 = in.nextInt();
		System.out.print("Informe a terceira nota: ");
		nota3 = in.nextInt();

		if ((nota1 + nota2 + nota3)/3 == 10) {
			System.out.println("Aprovado com Distinção");
		}
		else {
			if ((nota1 + nota2 + nota3)/3 > 7) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
		}
		
		in.close();
		
	}

}
