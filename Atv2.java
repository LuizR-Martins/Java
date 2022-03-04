package repetição;

import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		int n1, n2, contI=0, contP=0;
		
		Scanner ler = new Scanner(System.in);
		
		
		
		for (n1=1; n1<=10; n1++) {
			System.out.println("insira um numero ");
		n2= ler.nextInt();	
			
			if(n2%2==0) {
			contP++  ; }
		
			else if(n2%2!=0) {
				contI++; } }
		
		System.out.println( "o numero de impares é " + contI);
		System.out.println ("o numero de pares é:" + " " + contP);
			
		
		
				
		

		
	}

}
