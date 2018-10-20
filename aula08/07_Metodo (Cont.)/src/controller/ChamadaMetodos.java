package controller;

public class ChamadaMetodos {

	public static void main(String[] args) {
		System.out.println("Iniciando Programa");
		primeiro();
		System.out.println("Continunando Programa");
		terceiro();
		System.out.println("Terminando Programa");
		
	}
	public static void primeiro( ) {
		System.out.println("Iiniciando método 1");
		segundo();
		System.out.println("Terminando método 1");
	}
	public static void segundo() {
		System.out.println("iniciando método 2");
	  	System.out.println("terminando método 2");
	
 	}
	public static void terceiro( ) {
		System.out.println("Iniciando método 3");
		System.out.println("Terminando método 3");

	}

}
