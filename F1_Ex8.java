package Exercicios;
import java.util.Scanner;
public class F1_Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float sal;
		int horas;
		
		System.out.print("Informe o quanto você ganha tabalhando por hora: ");
		sal = entrada.nextFloat();
		System.out.print("Informe o quantas horas vecê trabalha por mês: ");
		horas = entrada.nextInt();
		
		System.out.println("Salário mensal: " + (sal*horas));
		
		entrada.close();
		

	}

}
