package Lista6;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A : ");
		int A=sc.nextInt();
		
		
		System.out.println("Digite o valor de B : ");
		int B=sc.nextInt();
		
		
		if (A>B) {
			A=A-B;
			System.out.println("A diferença dos números são : "+A);
			
		} else {
			A=B-A;
			System.out.println("A diferença dos números digitados são : "+A);
		}
	sc.close();
	}

}
