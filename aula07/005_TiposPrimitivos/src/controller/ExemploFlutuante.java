package controller;

public class ExemploFlutuante {

	public static void main(String[] args) {
		
		double Salario, aumento, novoSalario;
		
		Salario = 2000.00;
		aumento = 0.15;
		novoSalario = Salario + (aumento * Salario);
		System.out.println("Novo Salário R$" + novoSalario);
	}

}
