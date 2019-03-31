package br.com.ibratec.lista3;

public class Empregado {
	
	private String nome;
	private String sobrenome;
	private Double salarioMensal;

	public Empregado() {
	}

	public Empregado(String nome, String sobrenome, Double salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Double getSalarioMensal() {
		if (this.salarioMensal < 0) {
			this.salarioMensal = 0.0;
		}
		return salarioMensal;
	}

	public void setSalarioMensal(Double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public void aumento(Double porcentagem) {
		Double resultado = (this.salarioMensal * porcentagem)/ 100;
		this.salarioMensal =  this.salarioMensal + resultado;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", sobrenome=" + sobrenome + ", salarioMensal=" + salarioMensal + "]";
	}


}

