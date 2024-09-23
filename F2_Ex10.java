package Exercicios;
import java.util.Scanner;

public class F2_Ex10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1, n2, n3, maior, menor;
		
		System.out.print("Informe o primeiro número: ");
		n1 = in.nextInt();
		System.out.print("Informe o segundo número: ");
		n2 = in.nextInt();
		System.out.print("Informe o terceiro número: ");
		n3 = in.nextInt();
		
		if (n3 > n2 && n3 > n1) {
			maior = n3;
			if (n2 > n1) {
				menor = n1;
			}
			else {
				menor = n2;
			}
		}
		else {
			if (n2 > n1) {
				maior = n2;
				if (n1 > n3) {
					menor = n3;
				}
				else {
					menor = n1;
				}
			}
			else {
				maior = n1;
				if (n2 > n3) {
					menor = n3;
				}
				else {
					menor = n2;
				}
			}
		}
		
		System.out.println("Maior: " + maior + "\nMenor: " + menor);
		
		in.close();

	}

}
