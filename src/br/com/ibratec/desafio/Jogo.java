package br.com.ibratec.desafio;

import java.util.Scanner;

public class Jogo extends JogoDaVelha{
	
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
			
			int opcao = entrada.nextInt();
			switch (opcao) {
			
			case 1:
				int jogando = 0;
				while (jogando < 9) {

					System.out.println("****************");
					System.out.println("Digite Posicão X");
					int posicaoX = this.entrada.nextInt();

					System.out.println("Digite Posicão Y");
					int posicaoY = this.entrada.nextInt();
					
					System.out.println("****************");

					int vez = verificaVez(jogando);			
					
					if (passaVez(posicaoX, posicaoY) == false) {
						jogando = 10;
						continuar = false;
						System.out.println("Opção Inválida");
						System.out.println("Fim de Jogo");
					}					
					exibirGradeInt(posicaoX, posicaoY, vez);
					gradeCompleta();
					verificaLinhas();
					verificaDiagonais();
					verificaColunas();
					System.out.println(verificaCampeao());
					System.out.println();
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
