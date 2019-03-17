package br.com.ibratec.desafio;

public class JogoDaVelha {

	private int[][] gradeDoJogo = new int[3][3];

	public JogoDaVelha() {

	}

	public int[][] getGradeDoJogo() {
		return gradeDoJogo;
	}

	public void setGradeDoJogo(int[][] gradeDoJogo) {
		this.gradeDoJogo = gradeDoJogo;
	}

	public void exibirGradeInt(int posicaoX, int posicaoY, int simbolo) {
		for (int i = 0; i < gradeDoJogo.length; i++) {
			for (int j = 0; j < gradeDoJogo[i].length; j++) {
				if (posicaoX == i && posicaoY == j) {
					this.gradeDoJogo[i][j] = simbolo;
				}
				System.out.print(gradeDoJogo[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int verificaLinhas() {
		for (int linha = 0; linha < 3; linha++) {

			if ((gradeDoJogo[linha][0] + gradeDoJogo[linha][1] + gradeDoJogo[linha][2]) == -3)
				return -1;
			if ((gradeDoJogo[linha][0] + gradeDoJogo[linha][1] + gradeDoJogo[linha][2]) == 3)
				return 1;
		}

		return 0;

	}

	public int verificaColunas() {
		for (int coluna = 0; coluna < 3; coluna++) {

			if ((gradeDoJogo[0][coluna] + gradeDoJogo[1][coluna] + gradeDoJogo[2][coluna]) == -3)
				return -1;
			if ((gradeDoJogo[0][coluna] + gradeDoJogo[1][coluna] + gradeDoJogo[2][coluna]) == 3)
				return 1;
		}

		return 0;

	}

	public int verificaDiagonais() {
		if ((gradeDoJogo[0][0] + gradeDoJogo[1][1] + gradeDoJogo[2][2]) == -3)
			return -1;
		if ((gradeDoJogo[0][0] + gradeDoJogo[1][1] + gradeDoJogo[2][2]) == 3)
			return 1;
		if ((gradeDoJogo[0][2] + gradeDoJogo[1][1] + gradeDoJogo[2][0]) == -3)
			return -1;
		if ((gradeDoJogo[0][2] + gradeDoJogo[1][1] + gradeDoJogo[2][0]) == 3)
			return 1;

		return 0;
	}

}