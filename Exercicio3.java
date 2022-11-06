package Lista6;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota : ");
		Float nota1=sc.nextFloat();
		
		
		System.out.println("Digite a segunda nota : ");
		Float nota2=sc.nextFloat();
		
		
		System.out.println("Digite a terceira nota : ");
		Float nota3=sc.nextFloat();
		
		
		System.out.println("Digite a quarta nota : ");
		Float nota4=sc.nextFloat();
		
		
		Float média=(nota1+nota2+nota3+nota4)/4;
		if (média<5) {
			
			System.out.println("Você não alcançou a média necessária para passar, sua média foi de : "+média);
			
			
			
		} else {

			System.out.println("Parabéns, você conseguiu a média necessaria! "+média);
			
		}
		
		sc.close();
	}
}
