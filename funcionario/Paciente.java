package funcionario;

public class Paciente {
	String nome, email, endere�o, doen�as;
	int idade, telefone; 
	boolean consulta;

	public void consulta () {
	 if (this.consulta== true)		
		
		System.out.printf( "\n Cliente com consulta marcada");
	 
	else 
		System.out.print("\n Cliente sem consulta"); }
	
	public Paciente ()
	{
		this.nome= "Uindersoon da Silva Pinto";
	    this.email= "littlewindy@gmail.com";
	    this.endere�o= "Rua das Catapimbas, n 4";
	    this.telefone=  946706189;
	    this.doen�as= "reumatismo unilateral na esquerda";
	    this.idade= 25; 
	    this.consulta= true; }

	
	public void sim() {
	
	this.consulta= true; }
	
	public void nao() { 
	
		this.consulta= false; 

} public void estado()  { 
	System.out.printf ("Nome do paciente : " + this.nome );
	System.out.printf ("\n Email : " + this.email );
	System.out.printf ("\n Endere�o : " + this.endere�o );
	System.out.printf ("\n Telefone : " + this.telefone );
	System.out.printf ("\n Motivo da ultima consulta : " + this.doen�as );
	System.out.printf ("\n Valor do idade : " + this.idade );
	System.out.printf ("\n Tem consulta marcada ? : " + this.consulta );


}
}

