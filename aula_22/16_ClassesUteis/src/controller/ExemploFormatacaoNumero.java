package controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExemploFormatacaoNumero {

	public ExemploFormatacaoNumero() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FORMATANDO PRA VALOR MONETARIO

		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55008.537;
		System.out.println("Sem Formata��o:" + valor);
		System.out.println("Com Formata��o:" + f.format(valor));

		// FORMATANDO PRA PORCENTAGEM

		NumberFormat p = NumberFormat.getPercentInstance();
		double porcento = 0.05;
		System.out.println("Sem formata��o:" + porcento);
		System.out.println("Com formata��o:" + NumberFormat.getInstance().format(porcento));

		NumberFormat n = NumberFormat.getNumberInstance();
		double numero = 100.50;
		System.out.println("Sem formata��o:" + numero);
		System.out.println("Com formata��o:" + n.format(numero));
		
		double valor2 = 12000.5;
		double valor3 = 25.000;
		
		DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
		System.out.println("Sem Formata��o:" + valor2);
		System.out.println("Com formata��o:" + df.format(valor2));
		System.out.println("Com formata��o:" + df.format(valor3));
	}

}
