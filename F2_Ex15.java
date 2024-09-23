package Exercicios;
import java.util.Scanner;

public class F2_Ex15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float preco;
		int num_origem;
		String origem;
		
		System.out.println("Informe o preco do produto: ");
		preco = in.nextFloat();
		System.out.println("Informe o código de origem do produto (1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste, 7 ou 8 Centro-oeste.): ");
		num_origem = in.nextInt();
		
		if (num_origem == 1) {
			origem = "Sul";
		}
		else {
			if (num_origem == 2) {
				origem = "Norte";
			}
			else {
				if (num_origem == 3) {
					origem = "Leste";
				}
				else {
					if (num_origem == 4) {
						origem = "Oeste";
					}
					else {
						if (num_origem == 5 || num_origem == 6) {
							origem = "Nordeste";
						}
						else {
							if (num_origem == 7 || num_origem == 8) {
								origem = "Centro-Oeste";
							}
							else {
								origem = "Importado";
							}
						}
					}
				}
			}
		}
		
		System.out.println("Preço do Produto: " + preco + "\nOrigem: " + origem);
		
		in.close();

	}

}
