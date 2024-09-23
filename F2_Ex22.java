package Exercicios;
import java.util.Scanner;
public class F2_Ex22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 0, centena, dezena, unidade, i;
		centena = dezena = unidade = 0;
		
		System.out.println("Informe um número menos que 1000: ");
		n = in.nextInt();
		
		for (;n>=100;n-=100) {
			centena++;
		}
		for (;n>=10;n-=10) {
			dezena++;
		}
		for (;n>=1;n-=1) {
			unidade++;
		}
		
		System.out.println("Centenas: " + centena + "\nDezenas: " + dezena + "\nUnidade: " + unidade);
		
		in.close();
			
	}

}
