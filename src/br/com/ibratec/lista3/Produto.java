package br.com.ibratec.lista3;

public class Produto {

	private int numProduto;
	private String nomeProduto;
	private String descricaoProduto;
	private Double precoProduto;

	public Produto() {

	}

	public Produto(int numProduto, String nomeProduto, String descricaoProduto, Double precoProduto) {
		this.numProduto = numProduto;
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.precoProduto = precoProduto;
	}

	public int getNumProduto() {
		return numProduto;
	}

	public void setNumProduto(int numProduto) {
		this.numProduto = numProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Double getPrecoProduto() {
		if (this.precoProduto < 0.0) {
			this.precoProduto = 0.0;
		}
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	@Override
	public String toString() {
		return "Produto [numProduto=" + numProduto + ", nomeProduto=" + nomeProduto + ", descricaoProduto="
				+ descricaoProduto + ", precoProduto=" + precoProduto + "]";
	}

}
