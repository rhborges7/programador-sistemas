package controller;

import java.util.Scanner;

public class ExemploScanner_2 {

	public static void main(String[] args) {

		String nome;

		System.out.println("Digite seu nome: ");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		System.out.println("nome Digitado: " + nome.toUpperCase());

		System.out.println("Digite sua Idade: ");
		double x = sc.nextDouble();
		System.out.println("Idade Digitada: " + x);

		double salario;
		System.out.println("Digite o Salário que deseja: ");
		Scanner sc2 = new Scanner(System.in);
		salario = sc2.nextDouble();

		System.out.println("Salário Digitado: " + salario);

		sc.close();
		sc2.close();

	}

}
