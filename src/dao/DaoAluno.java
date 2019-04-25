package dao;

import java.util.List;

import model.Aluno;

public class DaoAluno {

	private List<Aluno> alunosDoBanco;

	public DaoAluno(){
		
	}
	
	public DaoAluno(List<Aluno> alunosDoBanco) {
		this.alunosDoBanco = alunosDoBanco;
	}

	public List<Aluno> getAlunosDoBanco() {
		return alunosDoBanco;
	}

	public void setAlunosDoBanco(List<Aluno> alunosDoBanco) {
		this.alunosDoBanco = alunosDoBanco;
	}

	public Aluno pesquisaAluno(Integer id) {
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getIdAluno() == id)
				return aluno;
		}
		return null;
	}

	public Aluno adicionaAluno(Aluno novoAluno) {
		alunosDoBanco.add(novoAluno);
		return novoAluno;
	}

	public boolean removeAluno(Integer idAluno) {
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getIdAluno() == idAluno)
				alunosDoBanco.remove(idAluno);
			return true;
		}
		return false;
	}
	
	public List<Aluno> mostrarTodos() {
		return alunosDoBanco;		
	}

}
