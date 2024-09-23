package Exercicios;
import java.util.Scanner;

public class F2_Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char letra;
		
		System.out.print("Informe uma letra (sendo ela minuscula): ");
		letra = entrada.nextLine().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra é vogal");
		}
		else {
			System.out.println("A letra é consoante");
		}
		entrada.close();
	}

}
