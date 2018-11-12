package controller;

import util.Teclado;

public class ComTratamentoDeErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int tent = 10;

		while (true) {
			try {

				double a = Teclado.lerDouble("Digite o Numerador: ");
				double b = Teclado.lerDouble("Digite o Denominador");
				double c = a / b;
				System.out.println("Resultado da divisão de a por b : " + c);
				System.exit(0);
			}

			catch (NumberFormatException nfe) {
				System.out.println("Caracter Inválido!");
				if (++count == tent) {
					System.out.println("Numero de Tentativas Excedido");
					System.exit(1);
				} else

				{
					continue;
				}

			} catch (ArithmeticException ae) {
				System.out.println("Divisão por Zero");
			}

		}

	}
}
