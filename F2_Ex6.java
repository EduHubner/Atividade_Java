package Exercicios;
import java.util.Scanner;

public class F2_Ex6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe um numero: ");
		n = in.nextInt();
		
		if (n%2 == 0) {
			n = 1;
		}
		else {
			n = 2;
		}
		
		System.out.println(n);
		
		in.close();
	
	}

}
