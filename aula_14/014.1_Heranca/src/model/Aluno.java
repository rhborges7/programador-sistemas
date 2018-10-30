package model;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String curso;
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String rg, String cpf,String telefone, String email, String matricula, String curso) {
		super(nome , rg , cpf , telefone , email);
		this.matricula = matricula;
		this.curso = curso;

	

}}
