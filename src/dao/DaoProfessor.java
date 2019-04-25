package dao;

import java.util.List;

import model.Professor;

public class DaoProfessor {

	private List<Professor> professorDoBanco;

	public DaoProfessor(List<Professor> professorDoBanco) {
		this.professorDoBanco = professorDoBanco;
	}

	public List<Professor> getProfessorDoBanco() {
		return professorDoBanco;
	}

	public void setProfessorDoBanco(List<Professor> professorDoBanco) {
		this.professorDoBanco = professorDoBanco;
	}
	
	

	public Professor pesquisaProfessor(Integer id) {
		for (Professor professor : professorDoBanco) {
			if (professor.getIdProfessor() == id)
				return professor;
		}
		return null;
	}

	public Professor adicionaProfessor(Professor novoProfessor) {
		professorDoBanco.add(novoProfessor);
		return novoProfessor;
	}

	public boolean removeProfessor(Integer idProfessor) {
		for (Professor professor : professorDoBanco) {
			if (professor.getIdProfessor() == idProfessor)
				professorDoBanco.remove(idProfessor);
			return true;
		}
		return false;
	}
	
	public List<Professor> mostrarTodos() {
		return professorDoBanco;		
	}


}
