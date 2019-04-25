package dao;

import java.util.List;

import model.RendimentoEscolar;

public class DaoRediemntoEscolar {

	private List<RendimentoEscolar> rendimentoEscolarDoBanco;

	public DaoRediemntoEscolar(List<RendimentoEscolar> rendimentoEscolarDoBanco) {
		this.rendimentoEscolarDoBanco = rendimentoEscolarDoBanco;
	}

	public List<RendimentoEscolar> getrendimentoEscolarDoBanco() {
		return rendimentoEscolarDoBanco;
	}

	public void setrendimentoEscolarDoBanco(List<RendimentoEscolar> rendimentoEscolarDoBanco) {
		this.rendimentoEscolarDoBanco = rendimentoEscolarDoBanco;
	}
	
	

	public RendimentoEscolar pesquisaRendimentoEscolar(String nome) {
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			if (rendimentoEscolar.getAlunoRedimentoEscolar().getNomeAluno() == nome)
				return rendimentoEscolar;
		}
		return null;
	}

	public RendimentoEscolar adicionaRendimentoEscolar(RendimentoEscolar novoRendimentoEscolar) {
		rendimentoEscolarDoBanco.add(novoRendimentoEscolar);
		return novoRendimentoEscolar;
	}

	public boolean removeRendimentoEscolar(String nome) {
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			if (rendimentoEscolar.getAlunoRedimentoEscolar().getNomeAluno() == nome)
				rendimentoEscolarDoBanco.remove(nome);
			return true;
		}
		return false;
	}
	
	public List<RendimentoEscolar> mostrarTodos() {
		return rendimentoEscolarDoBanco;		
	}

	

}
