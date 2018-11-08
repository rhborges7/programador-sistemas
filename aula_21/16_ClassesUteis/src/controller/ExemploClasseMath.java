package controller;

public class ExemploClasseMath {

	public ExemploClasseMath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SORTEANDO UM NUMERO ENTRE 50 E 80
				double valSorteado = Math.random();
				int resultado = 50 + (int) (valSorteado * 30);
				System.out.println("Sorteio entre 50 e 80:" + resultado);
				
				// SORTEANDO A MEGA - SENA
				for (int i = 0; i<6; ++i) {
					double numeroSena = Math.random();
					int numeroSorteado = (int) (numeroSena * 61);
					System.out.println("Numero Sorteado: " + numeroSorteado);
				}
	}

}
