package repetição;

import java.util.Scanner;

public class Atv6 {

	public static void main(String[] args) {
		double n1, n2=0, media=0, cont=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("insira um numero ");
		n1= ler.nextInt();
		if(n1%3 ==0) {
			cont++;
		n2=n2+n1;
		 }
			
		
		
		}
		while(n1!=0); {
			media= n2/(cont-1);
			System.out.println("o resultado da soma é " + media );}
		

	}

}
