package br.com.ibratec.lista3;

public class FaturaProduto {

	private Double quantidade;
	private Produto produto;

	public FaturaProduto() {

	}

	public FaturaProduto(Double quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public Double getQuantidade() {
		if (this.quantidade < 0.0) {
			this.quantidade = 0.0; 
		}
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double obterValorFatura() {
		Double r = produto.getPrecoProduto() * this.quantidade;
		return r;

	}

	@Override
	public String toString() {
		return "FaturaProduto [produto=" + produto + ", quantidade=" + quantidade + "]";
	}

}
