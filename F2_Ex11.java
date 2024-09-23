package Exercicios;
import java.util.Scanner;
public class F2_Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char turno;
		
		System.out.print("Informe que turno estudas (M - Matutino / V - Vespertino / N - Noturno): ");
		turno = in.nextLine().charAt(0);
		
		if (turno == 'M') {
			System.out.println("Bom dia");
		}
		else {
			if (turno == 'V') {
				System.out.println("Boa tarde");
			}
			else {
				System.out.println("Boa noite");
			}
		}
		
		in.close();
	}

}
