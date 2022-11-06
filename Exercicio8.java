package Lista6;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor : ");
		 int A=sc.nextInt();
		
		 System.out.println("Informe o segundo valor : ");
		 int B=sc.nextInt();
		
		 System.out.println("Informe o terceiro valor : ");
		 int C=sc.nextInt();
		
		 System.out.println("Informe o quarto valor : ");
		 int D=sc.nextInt();
		
		 System.out.println("Informe o quinto valor : ");
		 int E=sc.nextInt();
		
		 int menor;
		 int maior;
		 
		 if (A>=B) {
			maior=A;
			menor=B;	
		} else {
				maior=B;
				menor=A;	
			}
		 if (C>=maior) {
					maior=C;
						
				}
		 if (menor>=C) {
				
			menor=C;	
				}
		 
		 if (D>=maior) {
					maior=D;
						
				}
		 if (menor>=D) {
				
			 menor=D;	
				}
		 
		 
		 if (E>=maior) {
					maior=E;
			
				}
		 if (menor>=E) {
				
					menor=E;	
				}
		 
		 System.out.println("O maior número é : "+maior);
		System.out.println("O menor número é : "+menor);
		sc.close();
	}

}
