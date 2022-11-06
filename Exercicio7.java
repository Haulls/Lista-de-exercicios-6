package Lista6;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Informe o valor de A : ");
			int A=sc.nextInt();
			
			System.out.println("Informe o valor de B : ");
			int B=sc.nextInt();
			
			System.out.println("Informe o valor de C : ");
			int C=sc.nextInt();
			
			System.out.println("Informe o valor de D : ");
			int D=sc.nextInt();
			
			if (A % 2 == 0 && (A % 3) == 0) {
				System.out.println("É divisivel por 2 e 3 : "+A);
			}
			if (B % 2 == 0 && (B % 3) == 0) {
				System.out.println("É divisivel por 2 e 3 : "+B);
			}
			if (C % 2 == 0 && (C % 3) == 0) {
				System.out.println("É divisivel por 2 e 3 : "+C);
			}
			if (D % 2 == 0 && (D % 3) == 0) {
				System.out.println("É divisivel por 2 e 3 : "+D);
			}
		
		
		
		sc.close();
	}

}
