package controller;

import java.text.NumberFormat;
import java.util.Locale;

public class ExemploInternacionalizacao {

	public ExemploInternacionalizacao() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.CHINA);
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55008.537;
		System.out.println("Sem Formatação:" + valor);
		System.out.println("Formatação: " + f.format(valor));
		
	// NORMAS: ISO 639 -> IDIOMA ; ISO 3166 -> LOCALIDADE
		Locale local = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(local);
		Locale local1 = new Locale("afr", "af");
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(local1);
		System.out.println("Sem Formatação:" + valor);
		System.out.println("Formatação: " + nf.format(valor));
		System.out.println("Formatação: " + nf1.format(valor));
	}

}
