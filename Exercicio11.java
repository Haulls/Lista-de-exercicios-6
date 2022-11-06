package Lista6;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor : ");
		int valor1=sc.nextInt();
		
		if (valor1>3) {
			System.out.println("O número "+valor1+" é maior que 3.");
		} else {
			System.out.println("O número "+valor1+" é menor que 3.");
		}
		
		
		sc.close();
		
	}

}
