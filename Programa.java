package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Informe o produto que será cadastrado: ");
		produto.produto = info.next();
		System.out.println("Informe a quantidade: ");
		produto.quantidade = info.nextDouble();
		System.out.println("Informe o preço individual: ");
		produto.preco = info.nextDouble();
		
		System.out.println("Confirmação: "+produto.produto + ", Estoque atual: "+produto.quantidade + ", Preço: "+produto.preco);
		System.out.println("Deseja inserir mais produtos? Quantos: ");
		int estoque = info.nextInt();
		produto.addProduto(estoque);
		
		System.out.println("Atualização: "+produto.produto+", Estoque Atual: "+produto.quantidade+", Preço: "+produto.preco);
		System.out.println("Atualmente, alguma venda foi realizada? ");
		estoque = info.nextInt();
		produto.subProduto(estoque);
		
		System.out.println("Atualização pós vendas: "+produto.produto+", Estoque Atual: "+produto.quantidade+", Preço: "+produto.preco);
		
		
		info.close();
	}
}
