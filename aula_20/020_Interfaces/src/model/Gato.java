package model;

public class Gato implements Animal {

	String nome;
	
	@Override
	public String seuNome() {
		
		return nome;
	}
	
	public Gato(String nome) {
		this.nome = nome;
		
	}

	@Override
	public String seuBarulho() {
		// TODO Auto-generated method stub
		return "miau krl";
	}

}
