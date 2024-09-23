package Exercicios;
import java.util.Scanner;

public class F2_Ex30 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char tipo;
		int litros;
		float preco;
		
		System.out.println("Informe o tipo de Combustível (A - alcool / G - gasolina): ");
		tipo = in.nextLine().charAt(0);
		System.out.println("Informe a quantidade de litros: ");
		litros = in.nextInt();
		
		if (tipo == 'A') {
			preco = (float) (litros * 1.9);
			if (litros > 20) {
				System.out.println("Valor pago: " + (preco - (preco * 0.05)));
			}
			else {
				System.out.println("Valor pago: " + (preco - (preco * 0.03)));
			}
		}
		else {
			preco = (float) (litros * 2.5);
			if (litros > 20) {
				System.out.println("Valor pago: " + (preco - (preco * 0.06)));
			}
			else {
				System.out.println("Valor pago: " + (preco - (preco * 0.04)));
			}
		}
		
		in.close();
	}
}
