package Exercicios;
import java.util.Scanner;
public class F2_Ex28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1, n2, operacao;
		String par, inteiro, positivo;

		System.out.print("Informe o primeiro número: ");
		n1 = in.nextInt();
		System.out.print("Informe o segundo número: ");
		n2 = in.nextInt();
		System.out.println("Informe a operação que deseja usar (1 - soma / 2 - subtração / 3 - multiplicação / 4 - divisão): ");
		operacao = in.nextInt();
		
		if (operacao == 1) {
			n1 = n1 + n2;
		}
		else {
			if (operacao == 2) {
				n1 = n1 - n2;
			}
			else {
				if (operacao == 3) {
					n1 = n1 * n2;
				}
				else {
					n1 = n1/n2;
				}
			}
		}
		
		if (n1 > 0) {
			positivo = "Positivo";
		}
		else {
			positivo = "Negativo";
		}
		if (n1 - Math.round(n1) == 0) {
			inteiro = "Inteiro";
			if (n1%2 == 0) {
				par = "Par";
			}
			else {
				par = "Impar";
			}
		}
		else {
			inteiro = "Decimal";
			par = "não possivel determinar pois é Numero decimal";
		}
		
		System.out.println("número: " + n1 + "\nO número é " + positivo + ", " + inteiro + ", " + par);
		
		in.close();
	}

}
