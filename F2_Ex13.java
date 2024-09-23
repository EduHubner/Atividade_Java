package Exercicios;
import java.util.Scanner;

public class F2_Ex13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor_hora, horas_trabalhadas, salario_bruto;
		float valor_descontos, IR;
		
		System.out.println("Informe quantas horas trabalha: ");
		horas_trabalhadas = in.nextInt();
		System.out.println("Informe quanto recebe por hora: ");
		valor_hora = in.nextInt();
		
		salario_bruto = horas_trabalhadas * valor_hora;
		
		if (salario_bruto <= 900) {
			IR = 0;
			valor_descontos = (float) (salario_bruto * 0.03);
		}
		else {
			if (salario_bruto <= 1500) {
				IR = 0.05f;
				valor_descontos = (float) (salario_bruto * 0.03) + (salario_bruto * IR);
			}
			else {
				if (salario_bruto <= 2500) {
					IR = 0.1f;
					valor_descontos = (float) (salario_bruto * 0.03) + (salario_bruto * IR);
				}
				else {
					IR = 0.2f;
					valor_descontos = (float) (salario_bruto * 0.03) + (salario_bruto * IR);
				}
			}

		}
		
		System.out.println("Salario Bruto: " + salario_bruto + "\nIR(" + IR*100 + "%): " + salario_bruto*IR + "\nSindicato(3%): " + salario_bruto*0.03 + "\nTotal de descontos: " + valor_descontos
				+ "\nSalario Liquido: " + (salario_bruto - valor_descontos));
		
		in.close();
	}

}
