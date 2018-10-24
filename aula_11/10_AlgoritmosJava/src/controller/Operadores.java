package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
		
		String nome;
		
		nome = Teclado.lerTexto("Nome do Aluno:");
				
		int nota1, nota2, nota3, nota4,notaall;
		
		nota1 = Teclado.lerInt("Nota 1 = ");
		nota2 = Teclado.lerInt("Nota 2 = ");
		nota3 = Teclado.lerInt("nota 3 =");
		nota4 = Teclado.lerInt("Nota 4 = ");
		notaall = nota1+nota2+nota3+nota4;
		
		System.out.println("Nome do Aluno = " + nome);
		System.out.println("Média Geral = " + (notaall /4));
	
		if (notaall<= 0);{ 
			System.out.println("Média Ruim");
			
			}
		}
			
		
}

		
		
	
		
				
		
		
		
		
		

	


