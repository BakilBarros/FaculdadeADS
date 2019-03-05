package br.com.ibratec.lista1;

import javax.swing.JOptionPane;

/*
 * 
 * @autor Vanessa.Barros
 * 
 */

public class Main {

	public static void main(String[] args) {
		// // Lista de execu��o
		// lista1(0.0, 0.9);
		// lista2();
		// lista3();
		// lista4();
		// lista5();
		// lista6();
		// lista7();
		// lista8();
		// lista9();

	}

	// Instru��o if
	// 1. Escrever um programa que receba 2 n�meros como par�metros, realize e
	// imprima a divis�o do primeiro pelo segundo. OBS: Deve-se evitar divis�o
	// por
	// zero.
	public static void lista1(Double valor1, Double valor2) {
		if (valor1 != 0) {
			Double aux = valor1 / valor2;
			System.out.println("O resultado da divis�o � :" + aux);
		} else {
			System.out.println("A divis�o por 0 n�o � permitida!");
		}
	}

	// 2. Escreva um programa que leia tr�s n�meros inteiros do teclado, e os
	// imprima
	// na tela em ordem ascendente.
	public static void lista2() {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1 n�mero: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2 n�mero: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 3 n�mero: "));
		if (valor1 <= valor2 && valor2 <= valor3) {
			System.out.printf("A Saqu�ncia � :" + valor1 + " - " + valor2 + " - " + valor3);
		} else if (valor2 <= valor3 && valor3 <= valor1) {
			System.out.printf("A Saqu�ncia � :" + valor2 + " - " + valor3 + " - " + valor1);
		} else if (valor3 <= valor1 && valor1 <= valor2) {
			System.out.printf("A Saqu�ncia � :" + valor3 + " - " + valor1 + " - " + valor2);
		}

	}

	// Operador ?:
	// 3. Escreva um programa que leia dois n�meros inteiros do teclado, e os
	// imprima
	// na tela em ordem ascendente.
	public static void lista3() {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1 n�mero: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2 n�mero: "));
		if (valor1 <= valor2) {
			System.out.printf("A Saqu�ncia � :" + valor1 + " - " + valor2);
		} else {
			System.out.printf("A Saqu�ncia � :" + valor2 + " - " + valor1);
		}

	}

	// 4. Escreva um programa que determina o valor absoluto de um n�mero
	// inteiro
	// lido do teclado.
	public static void lista4() {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero: "));
		if (valor1 >= 0) {
			System.out.println("O valor absoluto � :" + valor1);
		} else {
			valor1 = -valor1;
			System.out.println("O valor absoluto � :" + valor1);
		}

	}

	// Instru��o switch
	// 5. Escrever um programa que receba 2 n�meros e um caractere operador (+,
	// -, *,
	// /), realize a opera��o determinada e imprima na tela o resultado.
	public static void lista5() {

		int valor1 = 0;
		int valor2 = 0;
		int aux = 0;
		String op = "";
		switch (op) {
		case "+":
			aux = valor1 + valor2;
			System.out.println("O valor da soma � :" + aux);
			break;
		case "-":
			aux = valor1 - valor2;
			System.out.println("O valor da subitra��o � :" + aux);
			break;
		case "*":
			aux = valor1 * valor2;
			System.out.println("O valor da mutiplica��o � :" + aux);
			break;
		case "/":
			aux = valor1 / valor2;
			System.out.println("O valor da divis�o � :" + aux);
			break;

		default:
			System.out.println("Op��o Inv�lida");
			break;
		}

	}

	// Instru��o for
	// 6. Escreva um programa que imprima os n�meros pares entre 1 e 100.
	// Instru��o while
	public static void lista6() {

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Pares :" + i);
			}
		}

	}

	// 7. Escreva um programa que coloque os n�meros de 1 a 100 na tela na ordem
	// inversa (come�ando em 100 e terminando em 1).
	public static void lista7() {

		int valor1 = 100;
		while (valor1 != 0) {
			System.out.println(valor1);
			valor1--;
		}

	}

	// Instru��o do � while
	// 8. Escreva um programa que l� n�meros do teclado enquanto esses n�meros
	// s�o menores que 10.
	public static void lista8() {

		int valor = 0;
		do {
			System.out.println(valor);
			valor++;
		} while (valor <= 10);

	}

	// 9. Escreva um programa que testa a capacidade de adivinhar uma letra.
	// Supondo
	// que a letra �secreta� seja a letra �A�, o programa deve ao final informar
	// a
	// quantidade de tentativas do usu�rio at� acertar a letra.
	public static void lista9() {
		String letra;
		int contador = 0;
		do {
			letra = JOptionPane.showInputDialog(null, "Digite uma letra: ");
			contador++;
		} while (!(letra.contains("a")));
		System.out.println("Parab�ns! Voc� acertou");
		System.out.println("Tentativas :" + contador);
	}
}