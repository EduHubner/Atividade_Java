package Exercicios;

import java.util.Scanner;

public class F2_Ex23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade1, idade2, idade3;
		
		System.out.print("Informe a primeira idade: ");
		idade1 = in.nextInt();
		System.out.print("Informe a segunda idade: ");
		idade2 = in.nextInt();
		System.out.print("Informe a terceira idade: ");
		idade3 = in.nextInt();
		
		if ((idade1 + idade2 + idade3)/3 < 25) {
			System.out.println("Turma Jovem!");
		}
		else {
			if ((idade1 + idade2 + idade3)/3 < 40) {
				System.out.println("Turma Adulta!");
			}
			else {
				System.out.println("Turma idosa!");
			}
		}
		
		in.close();
		
	}

}
