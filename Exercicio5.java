package Lista6;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A : ");
			Float A=sc.nextFloat();
			
			System.out.println("Digite o valor de B : ");
			Float B=sc.nextFloat();
			
			System.out.println("Digite o valor de C : ");
			Float C=sc.nextFloat();
			
			
			Float Delta = (B*B)-4*A*C;
			
			if (Delta < 0 ) {
				System.out.println("Não há raizes reais");
			} 
			if(Delta == 0 ) {
			  Float x1=-B/2*A;
			  System.out.println("A unica raiz real é : "+x1);
			  
			}
			if (Delta > 0 ) {
			Float x1=(-B+(Delta))/(2*A);
			Float x2=(-B+(Delta))/(2*A);
			
			System.out.println("O resultado das duas raízes reais é de : "+x1+","+x2);
			} else {

			}
			
			
			
			
			
			
			sc.close();
	}
}
