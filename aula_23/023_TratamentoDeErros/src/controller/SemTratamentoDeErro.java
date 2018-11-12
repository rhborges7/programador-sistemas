package controller;

import util.Teclado;

public class SemTratamentoDeErro {

	public SemTratamentoDeErro() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int i;
		for (i=0;i<6;++i) {
		double a = Teclado.lerDouble("Digite o Numerador: ");
		double b = Teclado.lerDouble("Digite o Denominador");
		
		double c = a/b;
		System.out.println("Resultado da divisão de a por b : " + c);
		}

	}

}
