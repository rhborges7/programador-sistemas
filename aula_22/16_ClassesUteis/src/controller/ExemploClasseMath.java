package controller;

import util.Teclado;

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
					
				// MAIOR ENTRE DOIS NÚMEROS 
					int maior;
					maior = Math.max(resultado,  65);
					System.out.println("Entre 65 e" + maior);
				
				// ÁREA DE UM CIRCULO DE RAIO 5
					double area = Math.PI * Math.pow(5, 2);
					System.out.println("Área de um círculo de " + "raio de 5 é " + area);
					
					// VOLUME DE UMA ESFERA
					double r = Teclado.lerDouble("DIGITE O VALOR DO RAIO DA ESFERA : ");
					double volume = (Math.PI * 4 * Math.pow(r, 3))/3;
					System.out.println("O VOLUME DA ESFERA É: " + volume);
					System.out.println("------------------------------------------------------------------------------------------");
					
				// EXEMPLO SEN COS TAN
					double sen, cos, tan;
					double a = 60;
					sen = Math.sin(Math.toRadians(a));
					cos = Math.cos(Math.toRadians(a));
					tan = Math.tan(Math.toRadians(a));
					System.out.println("Seno: " + sen);
					System.out.println("Cosseno: " + cos);
					System.out.println("Tangente: " + tan);
				// CONVERTER PRA RADIANOS
					
				// RAÍZ QUADRADA
					double raiz = Math.sqrt(4);
					System.out.println("Raiz quadrada de 4 é "+ raiz);
				}
	}


