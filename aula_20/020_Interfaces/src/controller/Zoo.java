package controller;

import java.util.ArrayList;
import model.*;

public class Zoo {

	public Zoo() {
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
				animals.add(new Cachorro("Krypto")); 
				animals.add(new Gato("Bella"));
				animals.add(new Cachorro("Rocky"));
				animals.add(new Gato ("Molly"));
				animals.add(new	Periquito("Rafael"));
				animals.add(new Periquito("Sabrina"));
				
		// GENERICALLY PROCESS EACH ELEMENT IN ARRAYLIST ANIMALS
				for (Animal animal: animals)
				{
					System.out.println(animal.seuNome()+ ":" + animal.seuBarulho());
				}
				
				
	}

}
