package condicional;

import java.util.Scanner;

public class ex1 { 
	

	public static void main(String[] args) { 
		int n1=0, n2=0, n3=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("insira um numero ");
		n1= ler.nextInt();
		
		System.out.print("insira um numero ");
		n2= ler.nextInt();
		
		System.out.print("insira um numero ");
		n3= ler.nextInt();
		
		if (n1>= n2 && n1>= n3) 
		 System.out.println("o maior numero é: "+ n1);
			
		
	    
		else if (n2>= n1 && n2>= n3) 
		System.out.println("o maior numero é: "+ n2); 
			
		
		
		else 
		System.out.println("o maior numero é: "+ n3); 
		
		

	}

}
