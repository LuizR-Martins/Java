package funcionario;

public class Funcionario {
	String nome, email, endereço;
	int idade, telefone; 
	boolean folga;

	public void feriado () {
	 if (this.folga== true)		
		
		System.out.printf( "\n Dia de folga");
	 
	else 
		System.out.print("\n Dia de trabalho"); }
	
	public Funcionario()
	{
		this.nome= "Cleberson Reis";
	    this.email= "claebinhodocamarote@gmail.com";
	    this.endereço= "Rua dos roles, n 4";
	    this.telefone=  946706189;
	    this.idade= 25;  
	    this.folga= false; }

	
	public void sim() {
	
	this.folga= true; }
	
	public void nao() { 
	
		this.folga= false; }
	
	public void estado() {
		System.out.printf ("Nome do funcionario : " + this.nome );
		System.out.printf ("\n email : " + this.email );
		System.out.printf ("\n Endereço : " + this.endereço );
		System.out.printf ("\n Numero para contato : " + this.telefone );
		System.out.printf ("\n Idade : " + this.idade );
		System.out.printf ("\n Dia de folga? : " + this.folga ); }

}
