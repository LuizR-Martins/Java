package cliente;

public class Cliente {
	
	String nome, email, endereço; 
	int idade, telefone; 
	boolean contatar;

	public void contato () {
	 if (this.contatar== true)		
		
		System.out.printf( "\n cliente:" + nome +  "\t email " + email + "\t idade anos " + idade +" \t telefone "  + telefone);
	 
	else 
		System.out.print("\n o cliente não deseja receber contatos no momento"); }
	
	public Cliente()
	{
		this.nome= "Claudio Aragão";
	    this.email= "claudinhoreidosroles@gmail.com";
	    this.endereço= "Rua dos Alfineiros, n 4";
	    this.telefone=  946706189;
	    this.idade= 25; 
	    this.contatar= true; }

	
	public void sim() {
	
	this.contatar= true; }
	
	public void nao() { 
	
		this.contatar= false; 
	
	} public void estado() {
		
		System.out.printf ("\n o cliente deseja contato?" + contatar);
	}
	
	
	
	}
	

	
	
	
	