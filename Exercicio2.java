package Lista6;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro : ");
		int valor=sc.nextInt();
		
		
		if (valor<0) {
			
			valor=valor*(-1);
			
		} 
		System.out.println("O módulo do número será : "+valor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
