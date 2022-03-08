package eletronico;

public class Eletronico {
	String tipo, modelo, entrada ;
	double polegadas, memoria, preço;
	boolean estoque;

	public void eletronico() {
	
		if (this.estoque==true) {		
		
		System.out.printf("aparelho no estoque, pronto para venda");}
	 
		else {
		System.out.println("Aparelho fora de linha"); }
	}

	
	public  Eletronico()
	{
		this.tipo= "Celular";
		this.memoria= 128;
	    this.modelo= "Sansung S10";
	    this.entrada= "USBC";
	    this.polegadas=  6.1;
	    this.preço= 1.500;
	    this.estoque= false; }
	
	
	public void contagem() {
		
		this.estoque=true; }
			
		public void mostruario() {
		
			this.estoque=false; }
		
        
		public void estado() {
			
			System.out.printf ("Tipo de eletonico : " + this.tipo );
			System.out.printf ("\n Modelo : " + this.modelo );
			System.out.printf ("\n Memoria : " + this.memoria );
			System.out.printf ("\n Tipo de entrada : " + this.entrada );
			System.out.printf ("\n tamanho de tela : " + this.polegadas );
			System.out.printf ("\n Valor do aparelho : " + this.preço );
			System.out.printf ("\n Produto em estotque? : " + this.estoque );}
	}




