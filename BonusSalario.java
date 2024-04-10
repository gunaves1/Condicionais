package estruturaCondicional;

import java.util.Scanner;

public class BonusSalario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos;
		
		System.out.println("Informe quantos anos de empresa você tem: ");
		anos = ler.nextInt();
		
		if (anos <= 3) {
			System.out.println("Você receberá um bônus de 5%");
		}
		else {
			System.out.println("Você receberá um bônus de 7%");
		}
		ler.close();
	}
}
