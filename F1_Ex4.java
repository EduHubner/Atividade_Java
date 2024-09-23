package Exercicios;
import java.util.Scanner;
public class F1_Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota1, nota2, nota3, nota4;
		
		System.out.print("Informe a nota do primeiro bimestre: ");
		nota1 = entrada.nextFloat();
		System.out.print("Informe a nota do segundo bimestre: ");
		nota2 = entrada.nextFloat();
		System.out.print("Informe a nota do terceiro bimestre: ");
		nota3 = entrada.nextFloat();
		System.out.print("Informe a nota do quarto bimestre: ");
		nota4 = entrada.nextFloat();
		
		System.out.println("média das notas: " + (nota1+nota2+nota3+nota4)/4);
		
		entrada.close();

	}

}
