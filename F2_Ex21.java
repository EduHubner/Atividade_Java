package Exercicios;
import java.util.Scanner;

public class F2_Ex21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int dia, mes, ano;
		boolean valido = true;
		
		System.out.println("Informe a dia: ");
		dia = in.nextInt();
		System.out.println("Informe a mes: ");
		mes = in.nextInt();
		System.out.println("Informe a ano: ");
		ano = in.nextInt();
		
		if (dia < 1 || dia > 30) {
			valido = false;
		}
		if (mes < 1 || mes > 12) {
			valido = false;
		}
		if (ano > 2024) {
			valido = false;
		}
		
		if (valido) {
			System.out.println("Data válida;");
		}
		else {
			System.out.println("Data não válida");
		}
		
		in.close();
	}

}
