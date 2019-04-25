package dao;

import java.util.List;

import model.Disciplina;

public class DaoDisciplina {

	private List<Disciplina> disciplinaDoBanco;

	public DaoDisciplina(List<Disciplina> disciplinaDoBanco) {
		this.disciplinaDoBanco = disciplinaDoBanco;
	}

	public List<Disciplina> getDisciplinaDoBanco() {
		return disciplinaDoBanco;
	}

	public void setDisciplinaDoBanco(List<Disciplina> disciplinaDoBanco) {
		this.disciplinaDoBanco = disciplinaDoBanco;
	}
	

	public Disciplina pesquisadisciplina(Integer id) {
		for (Disciplina disciplina : disciplinaDoBanco) {
			if (disciplina.getIdDisciplina() == id)
				return disciplina;
		}
		return null;
	}

	public Disciplina adicionadisciplina(Disciplina novodisciplina) {
		disciplinaDoBanco.add(novodisciplina);
		return novodisciplina;
	}

	public boolean removedisciplina(Integer iddisciplina) {
		for (Disciplina disciplina : disciplinaDoBanco) {
			if (disciplina.getIdDisciplina() == iddisciplina)
				disciplinaDoBanco.remove(iddisciplina);
			return true;
		}
		return false;
	}
	
	public List<Disciplina> mostrarTodos() {
		return disciplinaDoBanco;		
	}


}
