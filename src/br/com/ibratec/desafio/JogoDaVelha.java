package br.com.ibratec.desafio;

public class JogoDaVelha {

	private int[][] gradeDoJogo = new int[3][3];
	private String[][] armazenaGradeDoJogo = new String[3][3];

	public JogoDaVelha() {

	}

	public String[][] getArmazenaGradeDoJogo() {
		return armazenaGradeDoJogo;
	}

	public void setArmazenaGradeDoJogo(String[][] armazenaGradeDoJogo) {
		this.armazenaGradeDoJogo = armazenaGradeDoJogo;
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
			}
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

	public int verificaVez(int numero) {

		if (numero % 2 == 0) {
			int jogador1 = 1;
			return jogador1;
		} else {
			int jogador2 = -1;
			return jogador2;
		}

	}

	public String verificaCampeao() {
		if (verificaLinhas() == 0 && verificaColunas() == 0 && verificaDiagonais() == 0) {
			return "Status - Empate";
		} else if (verificaLinhas() == 1 && verificaColunas() == 1 && verificaDiagonais() == 1) {
			return "Jogador -1 é o vencedor";
		} else {
			return "Jogador 1 é o vencedor";
		}

	}

	public boolean passaVez(int x, int y) {
		if (x > 2 && y < 2 || gradeDoJogo[x][y] != 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void gradeCompleta() {
		for (int i = 0; i < gradeDoJogo.length; i++) {
			for (int j = 0; j < gradeDoJogo[i].length; j++) {
				if (gradeDoJogo[i][j] == -1) {
					armazenaGradeDoJogo[i][j] = " 0 ";
				}else if(gradeDoJogo[i][j] == 1) {
					armazenaGradeDoJogo[i][j] = " x ";
				}else {
					armazenaGradeDoJogo[i][j] = " - ";
				}
				System.out.print(armazenaGradeDoJogo[i][j] + " ");
			}
			System.out.println();
		}
	}

}