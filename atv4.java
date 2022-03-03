package condicional;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		int n1=0;
		double res;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("insira um numero ");
		n1= ler.nextInt();
		
		if (n1%2==0) {
			System.out.print("o numero é par ");
			
		res= Math.sqrt(n1);
		System.out.print("a raiz é " + res);
			}
		
		else {
			System.out.print("o numero é impar ");
		res= (n1*n1);
				System.out.print("esse numero ao elevado ao quadrado é " + res); }
		
	}

}
