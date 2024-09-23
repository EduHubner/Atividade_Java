package Exercicios;
import java.util.Scanner;
public class F2_Ex26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.println("Informe um número: ");
		n = in.nextInt();
		
		if (n%2 == 0) {
			System.out.println("Par!");
		}
		else {
			System.out.println("Ímpar");
		}

		in.close();
	}

}
