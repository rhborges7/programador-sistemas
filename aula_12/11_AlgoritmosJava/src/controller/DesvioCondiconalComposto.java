package controller;

import util.Teclado;

public class DesvioCondiconalComposto {

	public static void main(String[] args) {
		
		int a, b, x;
		a= Teclado.lerInt("Informe o Primeiro Numero:");
		b = Teclado.lerInt("Informe o Segundo Numero:");
		x = a + b;
		if (x >= 10) {
			System.out.println("O Valor da Soma do valor de " + a + " com " + b + " �: " + x);
			}
		else {
			System.out.println("O resultado substra�do de 7 � " + (x - 7));
		}

}
}
