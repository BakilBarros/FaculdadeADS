package model;

import java.util.Date;

public class Aluno {

	private Integer idAluno;
	private String nomeAluno;
	private Date dataNascimentoAluno;
	private int periodoAluno;
	private String nomeUsuarioAluno;
	private String senhaAluno;

	public Aluno() {

	}

	public Aluno(Integer idAluno, String nomeAluno, Date dataNascimentoAluno, int periodoAluno, String nomeUsuarioAluno,
			String senhaAluno) {
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.dataNascimentoAluno = dataNascimentoAluno;
		this.periodoAluno = periodoAluno;
		this.nomeUsuarioAluno = nomeUsuarioAluno;
		this.senhaAluno = senhaAluno;
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Date getDataNascimentoAluno() {
		return dataNascimentoAluno;
	}

	public void setDataNascimentoAluno(Date dataNascimentoAluno) {
		this.dataNascimentoAluno = dataNascimentoAluno;
	}

	public int getPeriodoAluno() {
		return periodoAluno;
	}

	public void setPeriodoAluno(int periodoAluno) {
		this.periodoAluno = periodoAluno;
	}

	public String getNomeUsuarioAluno() {
		return nomeUsuarioAluno;
	}

	public void setNomeUsuarioAluno(String nomeUsuarioAluno) {
		this.nomeUsuarioAluno = nomeUsuarioAluno;
	}

	public String getSenhaAluno() {
		return senhaAluno;
	}

	public void setSenhaAluno(String senhaAluno) {
		this.senhaAluno = senhaAluno;
	}

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nomeAluno=" + nomeAluno + ", dataNascimentoAluno=" + dataNascimentoAluno
				+ ", periodoAluno=" + periodoAluno + ", nomeUsuarioAluno=" + nomeUsuarioAluno + ", senhaAluno="
				+ senhaAluno + "]";
	}

}
