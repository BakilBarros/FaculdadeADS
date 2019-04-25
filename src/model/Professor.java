package model;

import java.util.Date;

public class Professor {

	private Integer idProfessor;
	private String nomeProfessor;
	private String cargoProfessor;
	private String senhaProfessor;
	private String nomeUsuarioProfessor;
	private Date dataNascimentoProfessor;

	public Professor() {
	}

	public Professor(Integer idProfessor, String nomeProfessor, String cargoProfessor, String senhaProfessor,
			String nomeUsuarioProfessor, Date dataNascimentoProfessor) {
		this.idProfessor = idProfessor;
		this.nomeProfessor = nomeProfessor;
		this.cargoProfessor = cargoProfessor;
		this.senhaProfessor = senhaProfessor;
		this.nomeUsuarioProfessor = nomeUsuarioProfessor;
		this.dataNascimentoProfessor = dataNascimentoProfessor;
	}

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getCargoProfessor() {
		return cargoProfessor;
	}

	public void setCargoProfessor(String cargoProfessor) {
		this.cargoProfessor = cargoProfessor;
	}

	public String getSenhaProfessor() {
		return senhaProfessor;
	}

	public void setSenhaProfessor(String senhaProfessor) {
		this.senhaProfessor = senhaProfessor;
	}

	public String getNomeUsuarioProfessor() {
		return nomeUsuarioProfessor;
	}

	public void setNomeUsuarioProfessor(String nomeUsuarioProfessor) {
		this.nomeUsuarioProfessor = nomeUsuarioProfessor;
	}

	public Date getDataNascimentoProfessor() {
		return dataNascimentoProfessor;
	}

	public void setDataNascimentoProfessor(Date dataNascimentoProfessor) {
		this.dataNascimentoProfessor = dataNascimentoProfessor;
	}

	@Override
	public String toString() {
		return "Professor [idProfessor=" + idProfessor + ", nomeProfessor=" + nomeProfessor + ", cargoProfessor="
				+ cargoProfessor + ", senhaProfessor=" + senhaProfessor + ", nomeUsuarioProfessor="
				+ nomeUsuarioProfessor + ", dataNascimentoProfessor=" + dataNascimentoProfessor + "]";
	}

}
