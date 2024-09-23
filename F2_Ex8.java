package Exercicios;
import java.util.Scanner;

public class F2_Ex8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float nota1, nota2;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = in.nextFloat();
		System.out.print("Informe a segunda nota: ");
		nota2 = in.nextFloat();
		
		if ((nota1 + nota2)/2 >= 7) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
		
		in.close();

	}

}
