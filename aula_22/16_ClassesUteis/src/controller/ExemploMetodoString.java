package controller;

public class ExemploMetodoString {
	public static void main(String[] args) {
	
		String url = "http://www.senai.rj.br/ctti/turma2010011";
		String email = "aluno@senai.br";
		
		String dominio;
		dominio = url.substring(7,22);
		System.out.println("Dom�nio: " + dominio);
		
		String complemento;
		complemento = url.substring(22);	
		System.out.println("Complemento do Dom�nio:" + complemento);
		
		
		// EXEMPLO DE SALA DE AULA
		String pedacos_url[] = url.split("/");
				for(int i=0;i<pedacos_url.length;i++);
				
		String nomeUsuario;
		nomeUsuario = email.substring(0, email.indexOf('@'));
		System.out.println("Usuario e-mail:" + nomeUsuario);
		
		String maiuscula, minuscula, palavra1, palavra2;
		
		palavra1 = "carro";
		palavra2 = "CASA";
		maiuscula = palavra1.toUpperCase();
		System.out.println("maiuscula: " + maiuscula);
		minuscula = palavra2.toLowerCase();
		System.out.println("minuscula: " + minuscula);
		}
	
		public ExemploMetodoString() {
		// TODO Auto-generated constructor stub
	}

}
