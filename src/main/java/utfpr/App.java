package utfpr;

import java.util.Scanner;

public class App {

	static void bemVindo() {
		System.out.println("Mercado");
	}

	static void menu() {
		System.out.println("1 Cadastrar produto");
		System.out.println("2 Listar produtos");
		System.out.println("3 Efetuar pedido");
		System.out.println("------");
		System.out.println("0 Sair");
	}

	public static void main(String[] args) {
		Mercado mercado = new Mercado();

		Scanner scan = new Scanner(System.in);
		boolean rodando = false;

		bemVindo();

		while(rodando) {
			menu();

			Integer entrada = scan.nextInt();

			switch (entrada) {
				case 0:
					rodando = false;
					System.out.println("Fim");
					break;
			}
		}

	}
}
