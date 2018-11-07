package model;

public class Cachorro implements Animal{
	
	private String nome;

	@Override
	public String seuNome() {
		
		return nome;
	}

	@Override
	public String seuBarulho() {
		
		return "woof,woof!";
	}

	
	public Cachorro(String nome) {
		this.nome = nome;
	}
	
	
	
	


}
