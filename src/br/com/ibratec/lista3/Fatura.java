package br.com.ibratec.lista3;

public class Fatura {
	

	private int numItem;
	private String descItem;
	private int qtItem;
	private Double preco;

	public Fatura() {
	}

	public Fatura(int numItem, String descItem, int qtItem, Double preco) {
		this.numItem = numItem;
		this.descItem = descItem;
		this.qtItem = qtItem;
		this.preco = preco;
	}

	public int getNumItem() {
		return numItem;
	}

	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}

	public String getDescItem() {
		return descItem;
	}

	public void setDescItem(String descItem) {
		this.descItem = descItem;
	}

	public int getQtItem() {
		if (this.qtItem < 0) {
			qtItem = 0;
		}
		return qtItem;
	}

	public void setQtItem(int qtItem) {
		this.qtItem = qtItem;
	}

	public Double getPreco() {
		if (this.preco < 0) {
			this.preco = 0.0;
		}
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double obterValorFatura() {
		Double valor;
		valor = getQtItem() * getPreco();
		return valor;
	}

	@Override
	public String toString() {
		return "Fatura [numItem=" + numItem + ", descItem=" + descItem + ", qtItem=" + qtItem + ", preco=" + preco
				+ "]";
	}

}
	
