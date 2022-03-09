package herança;

public abstract class Animal {
	
	private String nome;
	private int idade;
	private String som;
	private String locomover;
	
	 public abstract void locomover();
	 
	 public abstract void som();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getLocomover() {
		return locomover;
	}
	public void setLocomover(String locomover) {
		this.locomover = locomover;
	}
	

}
