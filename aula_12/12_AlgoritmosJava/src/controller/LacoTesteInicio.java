package controller;
import util.Teclado;

public class LacoTesteInicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r, x, i;
		
		i = 1;
		x = Teclado.lerInt("Digite um Numero: ");
		while (i <= 5) {
			x = Teclado.lerInt("Digite um Numero: ");
			r = x * 3;
			System.out.println(r);
			i = i + 1;
			//i++;
		}

	}

}
