package model;

public class ContaEspecial extends ContaCorrente {
	
	private double limite;

	/**
	 * @return the limite
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * @param limite the limite to set
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaEspecial() {
		super();
	}
	
	public ContaEspecial(String titular, String agencia, String numeroConta, double saldo, double limite) {
		super();
		this.limite = limite;
	}
	@Override
	public double calcularSaldo() {
		double saldoFinal;
		
		saldoFinal = super.calcularSaldo () + limite;
				
				return saldoFinal;
	}

	
	
}
