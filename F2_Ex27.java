package Exercicios;
import java.util.Scanner;

public class F2_Ex27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float n;
		
		System.out.println("Informe um número: ");
		n = in.nextFloat();
		
		if (n - Math.round(n) == 0) {
			System.out.println("É inteiro");
		}
		else {
			System.out.println("não é inteiro");
		}
		in.close();

	}

}
