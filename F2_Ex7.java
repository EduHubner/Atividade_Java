package Exercicios;
import java.util.Scanner;

public class F2_Ex7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1, n2, n3, guarda;
		
		System.out.print("Informe o primeiro número: ");
		n1 = in.nextInt();
		System.out.print("Informe o segundo número: ");
		n2 = in.nextInt();
		System.out.print("Informe o terceiro número: ");
		n3 = in.nextInt();
		
		if (n3 < n2) {
			guarda = n3;
			n3 = n2;
			n2 = guarda;
		}
		if (n3 < n1) {
			guarda = n3;
			n3 = n1;
			n1 = guarda;
		}
		if (n2 < n1) {
			guarda = n2;
			n2 = n1;
			n1 = guarda;
		}
		
		System.out.println("Ordem decrescente: " + n3 + ", " + n2 + ", " + n1);
		
		in.close();
		
	}	
}
