package controller;

public class EscopoDeVariavel {
	static int x = 4; //Variável Global
	static double y = 25; //Variavel Global
	static String z = "Krai q loko a ";
	static float q = 75f;
	static long w = 665l;
	
	
	public static void main(String[] args) {  //Metodo Main
 		int x = 1; //Variavel Dentro do Main
		System.out.println("x no inicio de main é " + x);
		metodoA();  //Chamada de Metodo do metodoA
		metodoB(); //Chamada de Metodo do metodoB
	}
		
		public static void metodoA() {   //Metodo A
			int x = 25;//Variável Dentro do metodoA
					System.out.println(z + "variavel local x ao entrar no metodoA é " + x);
			x=x+1;
			System.out.println("variavel local x antes de sair do metodoA é " + x);
			
		}
		
		public static void metodoB() {
			System.out.println("Variável x ao entrar no metodoB é "+ x + " global");
			x = x*10;
			System.out.println("Variável x antes de sair do metodoB é " + x);
		}
		
		public static void metodoC() {
			int x = 5;
		x= x + x*10;
		}

	

}
