package br.com.ibratec.lista4;

public class Pedido {

	private String formaPagamento;
	private Produto produto;

	public Pedido() {
	}

	public Pedido(String formaPagamento, Produto produto) {
		this.formaPagamento = formaPagamento;
		this.produto = produto;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Pedido [formaPagamento=" + formaPagamento + ", produto=" + produto + "]";
	}

}
