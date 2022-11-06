package Lista6;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número : ");
		int valor=sc.nextInt();
		
		
		
		
		if (valor%2==1) {
			System.out.println("Impar");
		} else {
			System.out.println("Par");
		} 
		
		sc.close();
	}

}
