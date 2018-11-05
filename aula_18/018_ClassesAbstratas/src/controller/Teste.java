package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setLogin("qwuehew");
		aluno.setNome("Rhuan");
		aluno.setMatriculaAluno(5);
		aluno.setTurno("Noite");
		aluno.setTurma("202B");
		aluno.mostrar();
		
		System.out.println("=================================================================================");

		Professor professor = new Professor();
		professor.setMatriculaProfessor(647349);
		professor.setNome("qwkjebkqwjbeqwb");
		professor.setEspecialidade("Nenhuma");
		professor.mostrar();
		
		

		
	}
}
