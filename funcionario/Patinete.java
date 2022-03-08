package funcionario;

public class Patinete {
	
	String marca, tipo ;
	double valor; 
	int idade;
	boolean estoque;

	public void estoque() {
	
		if (this.estoque==true) {		
			
			System.out.printf("Patinete em estoque, pronto para venda");}
		 
			else {
			System.out.println("Patinete fora de linha"); }
	}

	
	public  Patinete()
	{
		this.marca= "Estrela";
		this.valor= 300;
		this.tipo= "eletrico";
	    this.idade= 6;
	    this.estoque= true; 
	}
	    
	
	
	public void esto() {
		
		this.estoque=true; }
			
		public void esgo() {
		
			this.estoque=false; }
		
        
		public void estado() {
			
			System.out.printf ("Marca : " + this.marca );
			System.out.printf ("\n Modelo : " + this.tipo );
			System.out.printf ("\n Valor : " + this.valor );
			System.out.printf ("\n Reecomendado a partir de : " + this.idade, "anos" );
			System.out.printf ("\n Em estoque? : " + this.estoque );
			}
}
		

	
	


