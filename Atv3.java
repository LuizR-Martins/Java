package repetição;

import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {
		int n1=0, cont21=-0, cont50=0, n4;
		
		Scanner ler = new Scanner(System.in);
		
		while(n1!=-99) {
			System.out.println("insira sua idade ");
			n1= ler.nextInt();
					if(n1>=1 && n1<=21) {
						cont21++; }
					if(n1>=50) {
						cont50++;					}
			
		} System.out.println("o numero de pessoas ate 21 anos é:" + cont21);
		System.out.println("o numero de pessoas com mais de 50 anos é " + cont50);
		
		
		
		
	
		
		

	}

}
