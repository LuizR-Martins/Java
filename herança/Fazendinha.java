package heran�a;

import java.util.Scanner;

public class Fazendinha {

	public static void main(String[] args) {
		int x=0;
		Cachorroherdeiro c1= new Cachorroherdeiro();
		Pregui�aherdeira p1= new Pregui�aherdeira();
		Cavaloherdeiro c2 = new Cavaloherdeiro();
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("qual a idade do seu cachorro?");
		x = ler.nextInt();
		
		c1.setIdade(x);
		
		System.out.printf(" a idade do seu cachorro � " +  c1.getIdade());
		
			
		
		c1.som();
		c1.locomover();
		
		
		p1.som();
		p1.locomover();
		
		c2.som();
		c2.locomover();

	}

}
