package br.com.ibratec.lista2;

/*
 * 
 * @autor Vanessa.Barros
 * 
 * Vetores e Matrizes
 * 
 */

public class Main {

	public static void main(String[] args) {
		// lista1();//ok
		// lista2();//ok
		// lista3();//ok
		// lista4();//ok
		// lista5();//ok
		// lista6();//ok
		// lista7();//ok
		// lista8();//ok, mas perguntar!
		// lista9();//ok
		// lista10();//ok
		// lista11();//ok, pesado
		// lista12();//ok
		// lista13();
		// lista14();//ok, mas perguntar
		// lista15();
		// lista16();//ok
		// lista17();//ok
		// lista18();//ok
		// lista19();//ok
		// lista20();
		// lista21();//ok
		// lista22();
		// lista23(); //ok, mas perguntar
		// lista24(); //ok
		// exercicio1();//ok
		// exercicio2(); //ok

	}

	// 1. Leia um vetor de 12 posições e em seguida ler também dois valores X e
	// Y
	// quaisquer correspondentes a duas posições no vetor. Ao final seu
	// programa deverá escrever a soma dos valores encontrados nas
	// respectivas posições X e Y.
	public static void lista1() {

		int vetor3[] = new int[12];
		int vetorX[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2 };
		int vetorY[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2 };
		for (int i = 0; i < vetorX.length; i++) {
			// System.out.println(vetorX[i]);
		}
		for (int i = 0; i < vetorY.length; i++) {
			// System.out.println(vetorY[i]);
		}
		for (int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetorX[i] + vetorY[i];
			System.out.println(vetor3[i]);
		}

	}

	// 2. Declare um vetor de 10 posições e o preencha com os 10 primeiros
	// números ímpares e o escreva.
	public static void lista2() {
		int armazenaImpares[] = new int[20];
		int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 1) {
				armazenaImpares[i] = vetor[i];
				System.out.println(armazenaImpares[i]);
			}

		}
	}

	// 3. Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8
	// últimos e vice-e-versa. Escreva ao final o vetor obtido.
	public static void lista3() {
		int vetor[] = new int[16];
		int armazenaVetor2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

		for (int i = 8; i < armazenaVetor2.length; i++) {
			vetor[(i - 8)] = armazenaVetor2[i];
		}
		for (int i = 0; i < (armazenaVetor2.length) / 2; i++) {
			vetor[i + 8] = armazenaVetor2[i];
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}

	}

	// 4. Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu
	// programa deverá fazer uma busca do valor de X no vetor lido e informar a
	// posição em que foi encontrado ou se não foi encontrado.
	public static void lista4() {
		int vetor[] = { 2, 2, 2, 9, 5, 6, 7, 10, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 8, 22 };
		int x = 8;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == x) {
				System.out.println(i);
			}

		}

	}

	// 5. Leia um vetor de 40 posições. Contar e escrever quantos valores pares
	// ele
	// possui.
	public static void lista5() {
		int armazenaPares[] = new int[40];
		int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6, 7, 8,
				9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				armazenaPares[i] = vetor[i];
				System.out.println(armazenaPares[i]);
			}

		}
	}

	// 6. Leia um vetor de 40 posições e atribua valor 0 para todos os elementos
	// que possuírem valores negativos.
	public static void lista6() {

		int vetor2[] = { -1, -2, -3, -4, -5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6,
				7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < vetor2.length; i++) {
			if (vetor2[i] < 0) {
				System.out.println(vetor2[i] + "0");

			}
		}
	}

	// 7. Leia dois vetores de 20 posições e calcule um outro vetor contendo,
	// nas
	// posições pares os valores do primeiro e nas posições ímpares os valores
	// do segundo.
	public static void lista7() {
		int[] vetor1 = { 1, 1, 1, 1, 1 };
		int[] vetor2 = { 2, 2, 2, 2, 2 };
		int[] armezenaVetor = new int[vetor1.length + vetor2.length];
		int j = 0;
		int k = 0;

		for (int i = 0; i < armezenaVetor.length; i++) {
			if (i % 2 == 0) {
				armezenaVetor[i] = vetor1[j];
				j++;
				System.out.println(armezenaVetor[i]);
			} else {
				armezenaVetor[i] = vetor2[k];
				k++;
				System.out.println(armezenaVetor[i]);
			}
		}
	}

	// 8. Leia um vetor de 40 posições e acumule os valores do primeiro elemento
	// no segundo, deste no terceiro e assim por diante. Ao final, escreva o
	// vetor
	// obtido.
	public static void lista8() {
		int[] armazenavetor = new int[6];
		int[] vetor = { 1, 2, 3, 4, 5 };

		for (int l = 0; l < vetor.length; l++) {
			armazenavetor[l + 1] += vetor[l];
			System.out.println(vetor[l]);
		}
	}

	// 9. Leia um vetor contendo letras de uma frase inclusive os espaços em
	// branco. Retirar os espaços em branco do vetor e depois escrevê-los.
	public static void lista9() {
		String[] vetor = { "Internet rocheda" };
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i].replaceAll(" ", ""));

		}

	}

	// 10. Leia um vetor de 5 posições contendo os caracteres de um número. Em
	// seguida escreva esse número por extenso.
	public static void lista10() {
		String[] carecteres = { "1", "2", "3", "5", "8" };
		String[] letras = { "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove" };
		for (int i = 0; i < carecteres.length; i++) {
			if (carecteres[i] == "0") {
				System.out.println(letras[0]);
			} else if (carecteres[i] == "1") {
				System.out.println(letras[1]);
			} else if (carecteres[i] == "2") {
				System.out.println(letras[2]);
			} else if (carecteres[i] == "3") {
				System.out.println(letras[3]);
			} else if (carecteres[i] == "4") {
				System.out.println(letras[4]);
			} else if (carecteres[i] == "5") {
				System.out.println(letras[5]);
			} else if (carecteres[i] == "6") {
				System.out.println(letras[6]);
			} else if (carecteres[i] == "7") {
				System.out.println(letras[7]);
			} else if (carecteres[i] == "8") {
				System.out.println(letras[8]);
			} else if (carecteres[i] == "9") {
				System.out.println(letras[9]);
			}

		}

	}

	// 11. Leia 3 vetores de 9 posições e crie outro com o 1o terço do primeiro,
	// o 2o
	// terço do segundo e o último terço do terceiro. Escrever o vetor
	// resultante
	// ao final.
	public static void lista11() {

		int[] vetor1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };// 3
		int[] vetor2 = { 10, 12, 13, 14, 15, 16, 17, 18, 19 };// 6
		int[] vetor3 = { 21, 22, 23, 24, 25, 26, 27, 28, 29 };// 9
		int[] vetorResultante = new int[18];
		for (int i = 0; i < 3; i++) {
			vetorResultante[i] = vetor1[i];
			for (int j = 0; j < 6; j++) {
				vetorResultante[j + 3] = vetor2[j];
				for (int j2 = 0; j2 < 9; j2++) {
					vetorResultante[j2 + 9] = vetor3[j2];
				}
			}

		}
		for (int i = 0; i < vetorResultante.length; i++) {
			System.out.println(vetorResultante[i]);
		}
	}

	// 12. Leia um vetor de 10 posições e verifique se existem valores iguais e
	// os
	// escreva.
	public static void lista12() {
		int[] vetor1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
		for (int i = 0; i < vetor1.length; i++) {
			for (int j = 0; j < vetor1.length; j++) {
				if (vetor1[i] == vetor1[j] && j != i) {
					System.out.println(vetor1[i]);
				}
			}

		}

	}

	// 13. Leia um vetor de 50 posições e o compacte, ou seja, elimine as
	// posições
	// com valor zero avançando uma posição, com os com os valores
	// subsequentes do vetor. Dessa forma todos "zeros" devem ficar para as
	// posições finais do vetor.
	public static void lista13() {
		int[] vetor1 = { 0, 2, 3, 4, 5, 6, 7, 8, 0, 0 };

		int i = 0;
		while (vetor1[i] == 0) {
			vetor1[i] = vetor1[i + 1];

		}
		for (int j = 0; j < vetor1.length; j++) {
			System.out.println(vetor1[j]);
		}

	}

	// 14. Considere um vetor de trajetórias de 9 elementos, onde cada elemento
	// possui o valor do próximo elemento do vetor a ser lido.
	// Índice 1 2 3 4 5 6 7 8 9
	// Valor 5 7 6 9 2 8 4 0 3
	// Assim, a sequência da leitura seria 1, 5, 2, 7, 4, 9, 3, 6, 8, 0
	// Faça um algoritmo que seja capaz de ler esse vetor e seguir a
	// trajetória.
	public static void lista14() {
		int[] vetor1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] vetor2 = { 5, 7, 6, 9, 2, 8, 4, 0, 3 };
		int[] armezenaVetor = new int[vetor1.length + vetor2.length];
		int j = 0;
		int k = 0;

		for (int i = 0; i < armezenaVetor.length; i++) {
			if (i % 2 == 0) {
				armezenaVetor[i] = vetor1[j];
				j++;
				System.out.print(armezenaVetor[i] + " ");
			} else {
				armezenaVetor[i] = vetor2[k];
				k++;
				System.out.print(armezenaVetor[i] + " ");
			}

		}
		System.out.println();

	}

	// 15. Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do
	// maior
	// valor.
	public static void lista15() {
		int matriz[][] = { { 1, 1, 9, 1, 1, 1 }, { 1, 1, 9, 1, 1, 1 } };
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
				if (matriz[i][j] > cont) {
					cont = matriz[i][j];
					System.out.print(matriz[i][j]);
					// System.out.print(" Linha "+i+" Coluna "+j);

				}

			}
			System.out.println();
		}

	}

	// 16. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0
	// os
	// demais elementos. Escreva ao final a matriz obtida.
	public static void lista16() {

		int[][] matriz = new int[5][5];

		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				matriz[l][c] = (l == c) ? 1 : 0;
				System.out.print(matriz[l][c] + " ");
			}

			System.out.println();
		}
	}

	// 17. Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores
	// elementos entre as primeiras.
	public static void lista17() {
		int matriz1[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		int matriz2[][] = { { 5, 5, 5, 8 }, { 8, 9, 3, 9 }, { 7, 7, 7, 7 }, { 1, 1, 1, 1 } };
		int matrizResultado[][] = new int[4][4];
		int aux = 0;
		for (int i = 0; i < matrizResultado.length; i++) {
			for (int j = 0; j < matrizResultado[i].length; j++) {
				if (matriz1[i][j] > matriz2[i][j]) {
					aux = matriz1[i][j];

				} else {
					aux = matriz2[i][j];
				}
				matrizResultado[i][j] = aux;
				System.out.print(matrizResultado[i][j] + " ");

			}
			System.out.println();
		}

	}

	// 18. Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10
	// ela
	// possui.
	public static void lista18() {
		int matriz[][] = { { 1, 12, 13, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 11, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] >= 10) {
					cont++;
				}

			}
		}
		System.out.println("Ela possui :" + cont + " valores maiores que dez");
	}

	// 19. Leia uma matriz 20 x 20. Leia também um valor X. O programa deverá
	// fazer uma busca desse valor na matriz e, ao final escrever a localização
	// (linha e coluna) ou uma mensagem de "não encontrado".
	public static void lista19() {
		// int matriz [][] = new int [20][20];
		int matriz[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int x = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.print("Linha: [" + i + "] Coluna: [" + j + "]");
				}
			}
			System.out.println();
		}

	}

	// 20. Leia uma matriz 4 x 4 e troque os valores da 1a linha pelos da 4a
	// coluna e
	// vice-e-versa. Escrever ao final a matriz obtida.
	public static void lista20() {
		int matriz[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0 && j == 0) {
					System.out.print(matriz[i][j] + " ");
				}

			}
			System.out.println();
		}
	}

	// 21. Leia uma matriz 8 x 8 e a transforme numa matriz triangular inferior,
	// atribuindo zero a todos os elementos acima da diagonal principal,
	// escrevendo-a ao final.
	public static void lista21() {
		int matriz[][] = new int[8][8];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

	// 22. Leia uma matriz 8 x 8 e escreva o maior elemento da diagonal
	// principal e a
	// soma dos elementos da diagonal secundária.
	public static void lista22() {
		int matriz[][] = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 2, 3, 4, 5, 6, 7, 8 },
				{ 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 2, 3, 4, 5, 6, 7, 8 },
				{ 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 2, 3, 4, 5, 6, 7, 8 } };
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (i == j) ? 1 : 0;
				System.out.print(matriz[i][j] + " ");

			}
			System.out.println();
		}

	}

	// 23. Leia uma matriz 6 x 6 e atribuir o valor 0 para os valores negativos
	// encontrados fora das diagonais principal e secundária.
	public static void lista23() {
		// int matriz[][] = new int[6][6];
		int matriz[][] = { { 0, -2, -3, -4, -5, -6 }, { -7, -8, -9, -1, -1, 8 }, { -7, -8, -9, -1, -1, -1 },
				{ -7, -8, -9, -1, -1, -1 }, { -7, -8, -9, -1, -1, -1 }, { -7, -8, -9, -1, -1, -1 } };

		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[i].length; k++) {
				if (matriz[i][k] < 0 && i != k) {
					matriz[i][k] = 0;
				} else {
					matriz[i][k] = 1;
				}
				System.out.print(matriz[i][k] + " ");

			}

			System.out.println();
		}

	}

	// 24. Leia uma matriz 20 x 10 que se refere respostas de 10 questões de
	// múltipla escolha, referentes a 20 alunos. Leia também um vetor de 10
	// posições contendo o gabarito de respostas que podem ser a, b, c ou d.
	// Seu programa deverá comparar as respostas de cada candidato com o
	// gabarito e emitir um vetor "resultado", contendo a pontuação
	// correspondente de cada aluno.
	public static void lista24() {
		String matriz[][] = new String[10][5];
		int cont = 0;

		matriz[0][0] = "a";
		matriz[0][1] = "b";
		matriz[0][2] = "c";
		matriz[0][3] = "d";
		matriz[0][4] = "e";

		matriz[1][0] = "a";
		matriz[1][1] = "a";
		matriz[1][2] = "c";
		matriz[1][3] = "d";
		matriz[1][4] = "d";

		matriz[2][0] = "c";
		matriz[2][1] = "c";
		matriz[2][2] = "c";
		matriz[2][3] = "a";
		matriz[2][4] = "d";

		matriz[3][0] = "d";
		matriz[3][1] = "d";
		matriz[3][2] = "d";
		matriz[3][3] = "a";
		matriz[3][4] = "a";

		matriz[4][0] = "a";
		matriz[4][1] = "a";
		matriz[4][2] = "a";
		matriz[4][3] = "a";
		matriz[4][4] = "a";

		matriz[5][0] = "e";
		matriz[5][1] = "e";
		matriz[5][2] = "e";
		matriz[5][3] = "a";
		matriz[5][4] = "a";

		matriz[6][0] = "a";
		matriz[6][1] = "a";
		matriz[6][2] = "a";
		matriz[6][3] = "d";
		matriz[6][4] = "a";

		matriz[7][0] = "a";
		matriz[7][1] = "a";
		matriz[7][2] = "d";
		matriz[7][3] = "a";
		matriz[7][4] = "a";

		matriz[8][0] = "a";
		matriz[8][1] = "a";
		matriz[8][2] = "a";
		matriz[8][3] = "a";
		matriz[8][4] = "b";

		matriz[9][0] = "a";
		matriz[9][1] = "a";
		matriz[9][2] = "a";
		matriz[9][3] = "b";
		matriz[9][4] = "b";

		for (int i = 0; i < matriz[i].length; i++) {
			for (int k = 0; k < matriz[i].length; k++) {
				// System.out.print(matriz[i][k] + " ");
				if (matriz[i][k] == "a") {
					cont = 10;
					// System.out.println(cont);

				} else {
					cont = 0;
				}
				System.out.print(matriz[i][k] + " " + cont + " ");
			}
			System.out.println();
		}

	}

	// Escreva um programa que receba um vetor
	// com 5 números inteiros. Em seguida, determine
	// e imprima na tela o maior elemento par do
	// vetor (se houver), o menor elemento ímpar do
	// vetor (se houver), o somatório dos elementos do
	// vetor e a média
	public static void exercicio1() {

		int vetor[] = { 2, 3, 4, 5 };
		int max = 0;
		int min = 5;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] % 2 == 0 && vetor[i] > max) {
				max = vetor[i];
			}
		}

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] % 2 == 1 && vetor[i] < min) {
				min = vetor[i];
			}
		}

		System.out.println("O máximo elemento par é " + max);
		System.out.println("O minimo valor impar é " + min);
		Double a = new Double(max);
		Double b = new Double(min);
		System.out.println("O Somatório dos elementos é " + (a + b));
		System.out.println("O valor da média é " + (a + b) / 2);

	}

	// Escreva um programa que recebe valores para
	// duas matrizes 2x2 de inteiros. Criar uma terceira
	// matriz que é a matriz soma das anteriores e
	// imprimi-la ao final
	public static void exercicio2() {

		int[][] matriz1 = { { 1, 2 }, { 3, 4 } };
		int[][] matriz2 = { { 5, 6 }, { 7, 8 } };
		int[][] matriz3 = new int[2][2];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.print(matriz3[i][j]);
			}

		}

	}

}
