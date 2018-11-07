package model;

public class Periquito implements Animal  {
	
	private String nome;

	@Override
	public String seuNome() {
		
		return nome;
	}

	public Periquito(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String seuBarulho() {
		// TODO Auto-generated method stub
		return "porra deu certo";
	}
	
	
}
