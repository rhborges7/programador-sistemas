package model;

public class ContaCorrente {
	
	private String titular;
	private String agencia;
	private String numeroConta;
	private double saldo;
	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}
	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}
	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	/**
	 * @return the numeroConta
	 */
	public String getNumeroConta() {
		return numeroConta;
	}
	/**
	 * @param numeroConta the numeroConta to set
	 */
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente (String titular, String agencia, String numeroConta, double saldo) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public double calcularSaldo(){
		return this.saldo;
	}
	
	public double calcularJuros() {
		return this.saldo + (0.5*saldo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
