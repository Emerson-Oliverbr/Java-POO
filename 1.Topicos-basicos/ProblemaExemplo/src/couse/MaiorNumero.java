package couse;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 3 numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int auxiliar;
		if(x > y && x > z) {
			auxiliar = x;
		}
		else if(y > x && y > z) {
			auxiliar = y;
		}
		else {
			auxiliar = z;
		}
		
		return auxiliar;
	}
	
	public static void showResult(int valor) {
		System.out.println("Maior = " + valor);
	}

}
