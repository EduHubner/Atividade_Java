package Exercicios;
import java.util.Scanner;

public class F2_Ex9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float peso, alt, pesoideal;
		String sexo;
		
		System.out.print("Informe seu sexo (Masculino/Feminino): ");
		sexo = in.nextLine();
		System.out.println("Informe sua altura: ");
		alt = in.nextFloat();
		System.out.println("Informe seu peso: ");
		peso = in.nextFloat();
		
		if (sexo == "Masculino") {
			pesoideal = (float) ((72.7 * alt) - 58);
		}
		else {
			pesoideal = (float) ((62.1 * alt) - 44.7);
		}
		
		System.out.println("Sua altura: " + alt + "\nSeu peso: " + peso + "\nSeu sexo: " + sexo + "\nSeu peso ideal: " + pesoideal);
		
		if (peso > pesoideal) {
			System.out.println("Você está acima do peso ideal");
		}
		else {
			if (peso == pesoideal) {
				System.out.println("Você está no peso ideal");
			}
			else {
				System.out.println("Você está abaixo do peso ideal");
			}
		}
		
		in.close();
		

	}

}
