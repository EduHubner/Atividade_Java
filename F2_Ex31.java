package Exercicios;

import java.util.Scanner;

public class F2_Ex31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		float quant_mor, quant_mac, preco;
		
		System.out.println("Informe a quantidade de morango comprados e kg: ");
		quant_mor = in.nextFloat();
		System.out.println("Informe a quantidade de maças comprados e kg: ");
		quant_mac = in.nextFloat();
		
		if (quant_mor > 5) {
			preco = (float) (quant_mor * 2.2);
		}
		else {
			preco = (float) (quant_mor * 2.5);
		}
		if (quant_mac > 5) {
			preco = preco + (float) (quant_mac * 1.8);
		}
		else {
			preco = preco + (float) (quant_mac * 1.8);
		}
		
		if (preco > 25 || (quant_mac + quant_mor) > 8) {
			preco = (float) (preco - (preco * 0.1));
		}
		
		System.out.println("Preço a pagar: " + preco);
		
		in.close();
	}

}
