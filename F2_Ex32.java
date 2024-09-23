package Exercicios;

import java.util.Scanner;

public class F2_Ex32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int tipo1, tipo2 = 0, pagamento;
		float carne, preco = 0;
		char compra_mais;
		
		System.out.println("Qual a forma de pagamento (1 - dinheiro / 2 - cartão tabajara): ");
		pagamento = in.nextInt();
		
		System.out.println("Qual carne (1 - File Duplo / 2 - Alcatra / 3 - Picanha): ");
		tipo1 = in.nextInt();
		
		System.out.println("Deseja comprar outra carne? ");
		compra_mais = in.nextLine().charAt(0);
		
		if (compra_mais == 's') {
			System.out.println("Qual carne (1 - File Duplo / 2 - Alcatra / 3 - Picanha): ");
			tipo2 = in.nextInt();
		}
		
		if (tipo1 == 1 || tipo2 == 1) {
			System.out.println("Informe a quantidade de filé duplo que desejas em kg: ");
			carne = in.nextFloat();
			
			if (carne > 5) {
				preco += carne * 5.8;
			}
			else {
				preco += carne * 4.9;
			}
			
			System.out.println("Foram compradas " + carne + "kg de filé duplo");
		}
		
		if (tipo1 == 2 || tipo2 == 2) {
			System.out.println("Informe a quantidade de alcatra que desejas em kg: ");
			carne = in.nextFloat();
			
			if (carne > 5) {
				preco += carne * 6.8;
			}
			else {
				preco += carne * 5.9;
			}
			
			System.out.println("Foram compradas " + carne + "kg de alcatra");
		}
		
		if (tipo1 == 3 || tipo2 == 3) {
			System.out.println("Informe a quantidade de picanha que desejas em kg: ");
			carne = in.nextFloat();
			
			if (carne > 5) {
				preco += carne * 7.8;
			}
			else {
				preco += carne * 6.9;
			}
			
			System.out.println("Foram compradas " + carne + "kg de picanha");
		}
		
		System.out.println("Preço total: " + preco);
		
		if(pagamento == 1) {
			System.out.println("Forma de Pagamento: Dinheiro");
			
			System.out.println("Valor do desconto: 0%");
		}
		else {
			System.out.println("Forma de pagamento: Cartão Tabajara");
			
			System.out.println("Valor do desconto: " + (preco * 0.05));
			preco = (float) (preco - (preco * 0.05));
		}
		
		System.out.println("Preço a pagar: " + preco);
		
		in.close();
		
	}

}
