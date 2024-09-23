package Exercicios;
import java.util.Scanner;
public class F1_Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Informe o primeiro número inteiro: ");
		num1 = entrada.nextInt();
		System.out.print("Informe o segundo número inteiro: ");
		num2 = entrada.nextInt();
		
		System.out.println("A soma do dois números é igual a: " + (num1 + num2));
		
		entrada.close();
	}

}
