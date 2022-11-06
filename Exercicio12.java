package Lista6;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String sexo;
		String nome;
		
		
		System.out.println("Informe seu nome : ");
		nome=sc.next();
		
		
		System.out.println("Informe o sexo (M/F): ");
		sexo=sc.next();
		
		
		if (sexo !="M") {
		
			System.out.println("Llmo Sr "+nome);
		} 
		
		if (sexo !="F" ) {
			
			System.out.println("Llmo Sra "+nome);
		} 
		
		
		sc.close();

	}

}
