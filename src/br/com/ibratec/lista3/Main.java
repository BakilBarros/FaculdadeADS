package br.com.ibratec.lista3;

public class Main {

	public static void main(String[] args) {

		// Questão 1
		Fatura f = new Fatura(1, "pao", 5, 2.5);
		f.getQtItem();
		f.getPreco();
	    System.out.println(f.obterValorFatura());
		
	    // Questão 2
	    Empregado em = new Empregado("vanessa", "Barros", 100.00);
		em.aumento(20.00);
		System.out.println(em.toString());

		// Questão 3
		Data d = new Data(8, 8, 2019);
		d.passaDia();
		System.out.println(d.toString());

		// Questão 4
		Produto p = new Produto(2, "Pão", "Produto feito com trigo", 1.50);
		p.getPrecoProduto();
		FaturaProduto fp = new FaturaProduto(5.0, p);
		System.out.println(fp.obterValorFatura());
		System.out.println(fp.toString());
		System.out.println(p.toString());

	}

}
