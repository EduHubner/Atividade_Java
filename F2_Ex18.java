package Exercicios;
import java.util.Scanner;
public class F2_Ex18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.print("Informe o primeiro numero: ");
		lado1 = in.nextInt();
		System.out.print("Informe o segundo número: ");
		lado2 = in.nextInt();
		System.out.print("Informe o terceiro número: ");
		lado3 = in.nextInt();
		
		if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
			System.out.println("Os Valores podem formar um triângulo");
			
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triângulo Equilátero");
			}
			else {
				if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
					System.out.println("Triângulo Isósceles");
				}
				else {
					System.out.println("Triângulo Escaleno");
				}
			}
		}
		else {
			System.out.println("Os valores não formam um triângulo");
		}
		
		in.close();
	}

}
