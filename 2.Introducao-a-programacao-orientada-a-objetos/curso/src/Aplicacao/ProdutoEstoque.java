package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProdutoEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product  product= new Product();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Name: " );
		product.name = sc.nextLine();
		System.out.print("Preço: " );
		product.price = sc.nextDouble();
		System.out.print("Quantidade: " );
		product.quantity = sc.nextInt();		
		System.out.println();
		System.out.println("Dados do Produto" + product);
		System.out.print("Entre com a quantidade de produtos a ser adicionadas ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Dados Atualizados" + product);
		System.out.println();
		System.out.print("Entre com a quantidade de produtos a ser retirados ao estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Dados Atualizados" + product);
		
		sc.close();

	}
}
