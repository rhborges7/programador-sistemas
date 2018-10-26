package controller;

import util.Teclado;

public class DesvioCondicionalSimples {

	public static void main(String[] args) {
		
		
		int a, b, x;
		a= Teclado.lerInt("Informe o Primeiro Numero");
		b = Teclado.lerInt("Informe o Segundo Numero");
		x = a + b;
		if (x > 10) {
			System.out.println("O Valor da Soma do valor de " + a + " com " + b + " é: " + x);
		}
		

	}

}
