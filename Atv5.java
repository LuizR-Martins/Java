package repetição;

import java.util.Scanner;

public class Atv5 {

	public static void main(String[] args) {
		int n1, n2=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("insira um numero ");
		n1= ler.nextInt();
		
		n2= n2+n1; }
		while(n1!=0); {
		System.out.println("o resultado da soma é " +n2 );}

	}

}
