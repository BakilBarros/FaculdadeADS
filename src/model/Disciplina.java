package model;

public class Disciplina {

	private Integer idDisciplina;
	private String nomeDisciplina;
	private String ementaDisciplina;

	public Disciplina() {

	}

	public Disciplina(Integer idDisciplina, String nomeDisciplina, String ementaDisciplina) {
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.ementaDisciplina = ementaDisciplina;
	}

	public Integer getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Integer idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getEmentaDisciplina() {
		return ementaDisciplina;
	}

	public void setEmentaDisciplina(String ementaDisciplina) {
		this.ementaDisciplina = ementaDisciplina;
	}

	@Override
	public String toString() {
		return "Disciplina [idDisciplina=" + idDisciplina + ", nomeDisciplina=" + nomeDisciplina + ", ementaDisciplina="
				+ ementaDisciplina + "]";
	}

}
