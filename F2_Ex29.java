package Exercicios;
import java.util.Scanner;
public class F2_Ex29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n=0;
		char resposta;
		
		System.out.println("Telefonou para a vítima? (s/n)");
		resposta = in.nextLine().charAt(0);
		if (resposta == 's') {
			n++;
		}
		System.out.println("Esteve no local do crime? (s/n)");
		resposta = in.nextLine().charAt(0);
		if (resposta == 's') {
			n++;
		}
		System.out.println("Mora perto da vítima? (s/n)");
		resposta = in.nextLine().charAt(0);
		if (resposta == 's') {
			n++;
		}
		System.out.println("Devia para a vítima? (s/n)");
		resposta = in.nextLine().charAt(0);
		if (resposta == 's') {
			n++;
		}
		System.out.println("Já trabalhou com a vítima? (s/n)");
		resposta = in.nextLine().charAt(0);
		if (resposta == 's') {
			n++;
		}
		
		if (n == 5) {
			System.out.println("Assassino");
		}
		else {
			if (n >= 3) {
				System.out.println("Cúmplice");
			}
			else {
				if (n == 2) {
					System.out.println("Suspeito");
				}
				else {
					System.out.println("Inocente");
				}
			}
		}
		
		in.close();
	}

}
