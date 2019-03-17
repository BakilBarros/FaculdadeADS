package br.com.ibratec.desafio;

import java.util.Scanner;

public class Jogo extends JogoDaVelha {

	private int posicaoX;
	private int posicaoY;
	public Scanner entrada = new Scanner(System.in);

	public Jogo() {

	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public void jogar() {
		boolean continuar = true;
		while (continuar) {

			printMenu();
			int opcaoMenuPrincipal = entrada.nextInt();

			switch (opcaoMenuPrincipal) {

			case 1:
				int jogando = 0;
				while (jogando < 9) {

					System.out.println("Digite Posicão X");
					int posicaoX = this.entrada.nextInt();

					System.out.println("Digite Posicão Y");
					int posicaoY = this.entrada.nextInt();

					if (jogando % 2 == 0) {
						int vezj = 1;
						exibirGradeInt(posicaoX, posicaoY, vezj);
					} else {
						int vezj2 = -1;
						exibirGradeInt(posicaoX, posicaoY, vezj2);
					}
					verificaLinhas();
					verificaDiagonais();
					verificaColunas();

					if (verificaLinhas() == 0 && verificaColunas() == 0 && verificaDiagonais() == 0) {
						System.out.println("Empate");
					} else if (verificaLinhas() == 1 && verificaColunas() == 1 && verificaDiagonais() == 1) {
						System.out.println("Jogador 1 é o vencedor");
						jogando = 10;
					} else {
						System.out.println("Jogador -1 é o vencedor");
						jogando = 10;
					}

					jogando++;
				}
				break;
			case 2:
				System.out.println("Saiu!!");
				continuar = false;
				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}

		}
	}

	public void printMenu() {
		System.out.println();
		System.out.println("*** Bem Vindo ao Jogo Da Velha ***");
		System.out.println("Escolha Uma Opção!");
		System.out.println();
		System.out.println("(1) Jogar o jogo");
		System.out.println("(2) Sair");
		System.out.println();

	}

}
