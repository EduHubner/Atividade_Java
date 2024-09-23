package Exercicios;

import java.util.Scanner;

public class F2_Ex25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor_saque, n_cem, n_cinquenta, n_dez, n_cinco, n_um;
		n_cem = n_cinquenta = n_dez = n_cinco = n_um = 0;
		
		System.out.println("Informe um valor de saque entre 10 e 600: ");
		valor_saque = in.nextInt();
		
		for (;valor_saque>=100;valor_saque-=100) {
			n_cem++;
		}
		for (;valor_saque>=50;valor_saque-=50) {
			n_cinquenta++;
		}
		for (;valor_saque>=10;valor_saque-=10) {
			n_dez++;
		}
		for (;valor_saque>=5;valor_saque-=5) {
			n_cinco++;
		}
		for (;valor_saque>=1;valor_saque-=1) {
			n_um++;
		}
		
		System.out.println("Notas de Cem: " + n_cem + "\nNotas de cinquenta: " + n_cinquenta + "\nNotas de dez: " + n_dez + "\nNotas de cinco:" + n_cinco + "\nNotas de um:" + n_um);
		
		in.close();
			

	}

}
