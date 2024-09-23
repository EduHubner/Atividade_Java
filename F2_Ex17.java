package Exercicios;
import java.util.Scanner;

public class F2_Ex17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float nota1, nota2, media;
		char conceito;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = in.nextFloat();
		System.out.print("Informe a segunda nota: ");
		nota2 = in.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 9) {
			conceito = 'A';
		}
		else {
			if (media >= 7.5) {
				conceito = 'B';
			}
			else {
				if (media >= 6) {
					conceito = 'C';
				}
				else {
					if (media >= 4) {
						conceito = 'D';
					}
					else {
						conceito = 'E';
					}
				}
			}
		}
		
		System.out.println("Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito: " + conceito);
		
		if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
		
		in.close();

	}

}
