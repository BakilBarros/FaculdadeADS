package br.com.ibratec.lista4;

public class Produto {

	private Double preco;
	private int quantidade;
	private String itens;

	public Produto() {

	}

	public Produto(Double preco, int quantidade, String itens) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.itens = itens;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getItens() {
		return itens;
	}

	public void setItens(String itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Produto [preco=" + preco + ", quantidade=" + quantidade + ", itens=" + itens + "]";
	}

	
}
