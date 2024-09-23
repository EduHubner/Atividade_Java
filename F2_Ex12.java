package Exercicios;
import java.util.Scanner;

public class F2_Ex12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float salario, percentual, valor_aumentado, salario_atualizado;
		
		System.out.print("Informe o seu salario: ");
		salario = in.nextFloat();
		
		if (salario <= 280) {
			percentual = 0.2f;
			valor_aumentado = salario * percentual;
			salario_atualizado = salario + valor_aumentado;
		}
		else {
			if (salario <= 700) {
				percentual = 0.15f;
				valor_aumentado = salario * percentual;
				salario_atualizado = salario + valor_aumentado;
			}
			else {
				if (salario <= 1500) {
					percentual = 0.1f;
					valor_aumentado = salario * percentual;
					salario_atualizado = salario + valor_aumentado;
				}
				else {
					percentual = 0.05f;
					valor_aumentado = salario * percentual;
					salario_atualizado = salario + valor_aumentado;
				}
			}
		}
		
		System.out.println("Salario anterior: " + salario + "\nPercentual de aumento do salario: " + percentual*100 + "%\nValor do aumento do salario: " + valor_aumentado + "\nNovo salario: " + salario_atualizado);
		
		in.close();
	}

}
