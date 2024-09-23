package Exercicios;
import java.util.Scanner;

public class F2_Ex14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int dia;
		System.out.println("Informe um número que corresponde com o dia da semana: ");
		dia = in.nextInt();
		
		if (dia < 1 || dia > 7) {
			System.out.println("Valor informado é incopatível");
		}
		else {
			if (dia == 1) {
				System.out.println("Domingo");
			}
			else {
				if (dia == 2) {
					System.out.println("Segunda");
				}
				else {
					if (dia == 3) {
						System.out.println("Terça");
					}
					else {
						if (dia == 4) {
							System.out.println("Quarta");
						}
						else {
							if (dia == 5) {
								System.out.println("Quinta");
							}
							else {
								if (dia == 6) {
									System.out.println("Sexta");
								}
								else {
									System.out.println("Sábado");
								}
							}
						}
					}
				}
			}
		}
		
		in.close();

	}

}
