package controller;


import util.Teclado;

public class BatalhaNaval {

	
public static void main(String[] args) {
	
	
	
	
	
	String arena[][] = new String[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				arena[i][j] = "�gua";
			}
		}

		arena[2][2] = "Barco";
		arena[1][3] = "Submarino";
		arena[3][3] = "Porta-Avi�es";
		arena[0][2] = "Navio";

		int linha, coluna, pontos = 0;
		for (int w = 0; w < 4; w++) {
			linha = Teclado.lerInt("Digite a Coordenada da Linha :");
			coluna = Teclado.lerInt("Digite a Coordenada da Coluna :");
			System.out.println("Voc� acertou: " + arena[linha][coluna]);
			if (arena[linha][coluna] != "�gua") {
				 pontos = pontos + 1;
				
									}
			System.out.println("Voc� acertou: " + pontos + "pontos");
		}
}}


