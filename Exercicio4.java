package Lista6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a primeira nota do Aluno : ");
		Float nota=sc.nextFloat();
		System.out.println("Digite a segunda nota do  Aluno : ");
		Float nota2=sc.nextFloat();
		System.out.println("Digite a terceira nota do Aluno : ");
		Float nota3=sc.nextFloat();
		System.out.println("Digite a quarta nota do Aluno : ");
		Float nota4=sc.nextFloat();
		
		Float mediaescolar=(nota+nota2+nota3+nota4)/4;
		
		
		if (mediaescolar>=7) {
			System.out.println("Aprovado com média igual a : " +mediaescolar);
		} else {

			if (mediaescolar < 7 ) {
				System.out.println("O Aluno não foi aprovado, digite as notas do exame : ");
				Float exame=sc.nextFloat();
				Float novamedia=mediaescolar+exame/2;
				System.out.println("A nova média será : "+novamedia);
				
			
			if(novamedia>=5) {
				System.out.println("O aluno foi aprovado com a média : "+novamedia);
				
			}
		}
		sc.close();
	}
}
}