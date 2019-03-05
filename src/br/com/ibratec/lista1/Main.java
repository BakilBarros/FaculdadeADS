package br.com.ibratec.lista1;

import javax.swing.JOptionPane;

/*
 * 
 * @autor Vanessa.Barros
 * 
 */

public class Main {

	public static void main(String[] args) {
		// // Lista de execução
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

	// Instrução if
	// 1. Escrever um programa que receba 2 números como parâmetros, realize e
	// imprima a divisão do primeiro pelo segundo. OBS: Deve-se evitar divisão
	// por
	// zero.
	public static void lista1(Double valor1, Double valor2) {
		if (valor1 != 0) {
			Double aux = valor1 / valor2;
			System.out.println("O resultado da divisão é :" + aux);
		} else {
			System.out.println("A divisão por 0 não é permitida!");
		}
	}

	// 2. Escreva um programa que leia três números inteiros do teclado, e os
	// imprima
	// na tela em ordem ascendente.
	public static void lista2() {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1 número: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2 número: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 3 número: "));
		if (valor1 <= valor2 && valor2 <= valor3) {
			System.out.printf("A Saquência é :" + valor1 + " - " + valor2 + " - " + valor3);
		} else if (valor2 <= valor3 && valor3 <= valor1) {
			System.out.printf("A Saquência é :" + valor2 + " - " + valor3 + " - " + valor1);
		} else if (valor3 <= valor1 && valor1 <= valor2) {
			System.out.printf("A Saquência é :" + valor3 + " - " + valor1 + " - " + valor2);
		}

	}

	// Operador ?:
	// 3. Escreva um programa que leia dois números inteiros do teclado, e os
	// imprima
	// na tela em ordem ascendente.
	public static void lista3() {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1 número: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2 número: "));
		if (valor1 <= valor2) {
			System.out.printf("A Saquência é :" + valor1 + " - " + valor2);
		} else {
			System.out.printf("A Saquência é :" + valor2 + " - " + valor1);
		}

	}

	// 4. Escreva um programa que determina o valor absoluto de um número
	// inteiro
	// lido do teclado.
	public static void lista4() {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
		if (valor1 >= 0) {
			System.out.println("O valor absoluto é :" + valor1);
		} else {
			valor1 = -valor1;
			System.out.println("O valor absoluto é :" + valor1);
		}

	}

	// Instrução switch
	// 5. Escrever um programa que receba 2 números e um caractere operador (+,
	// -, *,
	// /), realize a operação determinada e imprima na tela o resultado.
	public static void lista5() {

		int valor1 = 0;
		int valor2 = 0;
		int aux = 0;
		String op = "";
		switch (op) {
		case "+":
			aux = valor1 + valor2;
			System.out.println("O valor da soma é :" + aux);
			break;
		case "-":
			aux = valor1 - valor2;
			System.out.println("O valor da subitração é :" + aux);
			break;
		case "*":
			aux = valor1 * valor2;
			System.out.println("O valor da mutiplicação é :" + aux);
			break;
		case "/":
			aux = valor1 / valor2;
			System.out.println("O valor da divisão é :" + aux);
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}

	}

	// Instrução for
	// 6. Escreva um programa que imprima os números pares entre 1 e 100.
	// Instrução while
	public static void lista6() {

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Pares :" + i);
			}
		}

	}

	// 7. Escreva um programa que coloque os números de 1 a 100 na tela na ordem
	// inversa (começando em 100 e terminando em 1).
	public static void lista7() {

		int valor1 = 100;
		while (valor1 != 0) {
			System.out.println(valor1);
			valor1--;
		}

	}

	// Instrução do – while
	// 8. Escreva um programa que lê números do teclado enquanto esses números
	// são menores que 10.
	public static void lista8() {

		int valor = 0;
		do {
			System.out.println(valor);
			valor++;
		} while (valor <= 10);

	}

	// 9. Escreva um programa que testa a capacidade de adivinhar uma letra.
	// Supondo
	// que a letra ‘secreta’ seja a letra ‘A’, o programa deve ao final informar
	// a
	// quantidade de tentativas do usuário até acertar a letra.
	public static void lista9() {
		String letra;
		int contador = 0;
		do {
			letra = JOptionPane.showInputDialog(null, "Digite uma letra: ");
			contador++;
		} while (!(letra.contains("a")));
		System.out.println("Parabéns! Você acertou");
		System.out.println("Tentativas :" + contador);
	}
}