package Exercicios;
import java.util.Scanner;
public class F2_Ex33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
		int nota = 0;
		
		System.out.println("Informe a resposta da 1ª questão: ");
		q1 = in.nextLine().charAt(0);
		System.out.println("Informe a resposta da 2ª questão: ");
		q2 = in.nextLine().charAt(0);
		System.out.println("Informe a resposta da 3ª questão: ");
		q3 = in.nextLine().charAt(0);
		System.out.println("Informe a resposta da 4ª questão: ");
		q4 = in.nextLine().charAt(0);
		System.out.println("Informe a resposta da 5ª questão: ");
		q5 = in.nextLine().charAt(0);
		System.out.println("Informe a resposta da 6ª questão: ");
		q6 = in.nextLine().charAt(0);
		System.out.println("Informe a resposta da 7ª questão: ");
		q7 = in.nextLine().charAt(0);
		System.out.println("Informe a resposta da 8ª questão: ");
		q8 = in.nextLine().charAt(0);
		System.out.println("Informe a resposta da 9ª questão: ");
		q9 = in.nextLine().charAt(0);
		System.out.println("Informe a resposta da 10ª questão: ");
		q10 = in.nextLine().charAt(0);
		
		if (q1 == 'a') {
			System.out.println("Correto");
			nota++;
		}
		else {
			System.out.println("Errado, Reposta certa (a)");
		}
		if (q2 == 'a') {
			System.out.println("Correto");
			nota++;
		}
		else {
			System.out.println("Errado, Reposta certa (a)");
		}
		if (q3 == 'b') {
			System.out.println("Correto");
			nota++;
		}
		else {
			System.out.println("Errado, Reposta certa (b)");
		}
		if (q4 == 'b') {
			System.out.println("Correto");
			nota++;
		}
		else {
			System.out.println("Errado, Reposta certa (b)");
		}
		if (q5 == 'c') {
			System.out.println("Correto");
			nota++;
		}
		else {
			System.out.println("Errado, Reposta certa (c)");
		}
		if (q6 == 'c') {
			System.out.println("Correto");
			nota++;
		}
		else {
			System.out.println("Errado, Reposta certa (c)");
		}
		if (q7 == 'd') {
			System.out.println("Correto");
			nota++;
		}
		else {
			System.out.println("Errado, Reposta certa (d)");
		}
		if (q8 == 'd') {
			System.out.println("Correto");
			nota++;
		}
		else {
			System.out.println("Errado, Reposta certa (d)");
		}
		if (q9 == 'e') {
			System.out.println("Correto");
			nota++;
		}
		else {
			System.out.println("Errado, Reposta certa (e)");
		}
		if (q10 == 'e') {
			System.out.println("Correto");
			nota++;
		}
		else {
			System.out.println("Errado, Reposta certa (e)");
		}
		
		System.out.println("nota final: " + nota);
		
		in.close();
		

	}

}
