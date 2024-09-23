package Exercicios;
import java.util.Scanner;
public class F2_Ex19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b, c;
		float delta;
		
		System.out.print("Informe o valor de a : ");
		a = in.nextInt();
		if (a == 0) {
			System.out.println("Não forma um equação do segundo grau");
		}
		else {
			System.out.print("Informe o valor de b: ");
			b = in.nextInt();
			System.out.print("Informe o valor de c: ");
			c = in.nextInt();
			
			delta = (b*b) - (4*a*c);
			
			if (delta < 0) {
				System.out.println("Equação não possui raízes nos Reais");
			}
			else {
				if (delta == 0) {
					System.out.println("A equação possui apenas uma raíz");
					System.out.println("Raíz: " + (-b/(2*a)));
				}
				else {
					System.out.println("A equação possui duas raízes");
					System.out.println("1ª Raíz: " + (-b + Math.sqrt(delta)) / (2*a));
					System.out.println("2ª Raíz: " + (-b - Math.sqrt(delta)) / (2*a));
				}
				
			}
		}
		
		in.close();
	}

}
