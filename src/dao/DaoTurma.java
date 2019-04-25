package dao;

import java.util.List;

import model.Turma;

public class DaoTurma {

	private List<Turma> turmaDoBanco;

	public DaoTurma(List<Turma> turmaDoBanco) {
		this.turmaDoBanco = turmaDoBanco;
	}

	public List<Turma> getTurmaDoBanco() {
		return turmaDoBanco;
	}

	public void setTurmaDoBanco(List<Turma> turmaDoBanco) {
		this.turmaDoBanco = turmaDoBanco;
	}

	public Turma pesquisaturma(Integer id) {
		for (Turma turma : turmaDoBanco) {
			if (turma.getIdTurma() == id)
				return turma;
		}
		return null;
	}

	public Turma adicionaturma(Turma novoturma) {
		turmaDoBanco.add(novoturma);
		return novoturma;
	}

	public boolean removeturma(Integer idturma) {
		for (Turma turma : turmaDoBanco) {
			if (turma.getIdTurma() == idturma)
				turmaDoBanco.remove(idturma);
			return true;
		}
		return false;
	}

	public List<Turma> mostrarTodos() {
		return turmaDoBanco;
	}

}
