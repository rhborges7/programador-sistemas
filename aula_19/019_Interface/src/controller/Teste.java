package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {

		// Usuario usu = new Usuario();

		Professor prof = new Professor("joaquim", "joaquim123", 0, 1123, "Joaquim da Silva", "Doutor");
		prof.mostrar();
		System.out.println("======================================");

		Aluno aluno = new Aluno("muzi", "muzi123", 1, 32115, "Sergio Muzi", "tarde", "201T");
		aluno.mostrar();
	}

}