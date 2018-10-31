package controller;

import model.ContaCorrente;
import model.ContaEspecial;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente("Michel","001", "22568", 100);
		System.out.println("Saldo Michel: " + cc.calcularSaldo());
		ContaEspecial cce = new ContaEspecial("Rhuan", "002", "33568", 150,500);
		System.out.println("Saldo Rhuan: " + cce.calcularSaldo());
		
		System.out.println("Eu " + cc.calcularJuros());

	}

}
