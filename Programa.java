package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Informe o produto que ser� cadastrado: ");
		produto.produto = info.next();
		System.out.println("Informe a quantidade: ");
		produto.quantidade = info.nextDouble();
		System.out.println("Informe o pre�o individual: ");
		produto.preco = info.nextDouble();
		
		System.out.println("Confirma��o: "+produto.produto + ", Estoque atual: "+produto.quantidade + ", Pre�o: "+produto.preco);
		System.out.println("Deseja inserir mais produtos? Quantos: ");
		int estoque = info.nextInt();
		produto.addProduto(estoque);
		
		System.out.println("Atualiza��o: "+produto.produto+", Estoque Atual: "+produto.quantidade+", Pre�o: "+produto.preco);
		System.out.println("Atualmente, alguma venda foi realizada? ");
		estoque = info.nextInt();
		produto.subProduto(estoque);
		
		System.out.println("Atualiza��o p�s vendas: "+produto.produto+", Estoque Atual: "+produto.quantidade+", Pre�o: "+produto.preco);
		
		
		info.close();
	}
}
