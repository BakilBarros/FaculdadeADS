package model;

import java.util.Arrays;

public class RendimentoEscolar {
	
	private Turma turmaRedimentoEscolar;
	private Aluno alunoRedimentoEscolar;
	private Double nota1RedimentoEscolar;
	private Double nota2RedimentoEscolar;
	private Double trabalhosRendimentoEscolar[] = new Double[4];
	private Double notasDostrabalhosRendimentoEscolar[] = new Double[4];

	public RendimentoEscolar(){
		
	}
	
	public RendimentoEscolar(Turma turmaRedimentoEscolar, Aluno alunoRedimentoEscolar, Double nota1RedimentoEscolar,
			Double nota2RedimentoEscolar, Double[] trabalhosRendimentoEscolar,
			Double[] notasDostrabalhosRendimentoEscolar) {
		this.turmaRedimentoEscolar = turmaRedimentoEscolar;
		this.alunoRedimentoEscolar = alunoRedimentoEscolar;
		this.nota1RedimentoEscolar = nota1RedimentoEscolar;
		this.nota2RedimentoEscolar = nota2RedimentoEscolar;
		this.trabalhosRendimentoEscolar = trabalhosRendimentoEscolar;
		this.notasDostrabalhosRendimentoEscolar = notasDostrabalhosRendimentoEscolar;
	}

	public Turma getTurmaRedimentoEscolar() {
		return turmaRedimentoEscolar;
	}

	public void setTurmaRedimentoEscolar(Turma turmaRedimentoEscolar) {
		this.turmaRedimentoEscolar = turmaRedimentoEscolar;
	}

	public Aluno getAlunoRedimentoEscolar() {
		return alunoRedimentoEscolar;
	}

	public void setAlunoRedimentoEscolar(Aluno alunoRedimentoEscolar) {
		this.alunoRedimentoEscolar = alunoRedimentoEscolar;
	}

	public Double getNota1RedimentoEscolar() {
		return nota1RedimentoEscolar;
	}

	public void setNota1RedimentoEscolar(Double nota1RedimentoEscolar) {
		this.nota1RedimentoEscolar = nota1RedimentoEscolar;
	}

	public Double getNota2RedimentoEscolar() {
		return nota2RedimentoEscolar;
	}

	public void setNota2RedimentoEscolar(Double nota2RedimentoEscolar) {
		this.nota2RedimentoEscolar = nota2RedimentoEscolar;
	}

	public Double[] gettrabalhosRendimentoEscolar() {
		return trabalhosRendimentoEscolar;
	}

	public void settrabalhosRendimentoEscolar(Double[] trabalhosRendimentoEscolar) {
		this.trabalhosRendimentoEscolar = trabalhosRendimentoEscolar;
	}

	public Double[] getNotasDostrabalhosRendimentoEscolar() {
		return notasDostrabalhosRendimentoEscolar;
	}

	public void setNotasDostrabalhosRendimentoEscolar(Double[] notasDostrabalhosRendimentoEscolar) {
		this.notasDostrabalhosRendimentoEscolar = notasDostrabalhosRendimentoEscolar;
	}

	@Override
	public String toString() {
		return "RendimentoEscolar [turmaRedimentoEscolar=" + turmaRedimentoEscolar + ", alunoRedimentoEscolar="
				+ alunoRedimentoEscolar + ", nota1RedimentoEscolar=" + nota1RedimentoEscolar
				+ ", nota2RedimentoEscolar=" + nota2RedimentoEscolar + ", trabalhosRendimentoEscolar="
				+ Arrays.toString(trabalhosRendimentoEscolar) + ", notasDostrabalhosRendimentoEscolar="
				+ Arrays.toString(notasDostrabalhosRendimentoEscolar) + "]";
	}
	

}
