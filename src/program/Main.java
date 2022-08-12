package program;

/*
beecrowd | 1158 - Soma de Ímpares Consecutivos III

Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de Y ímpares
consecutivos a partir de X inclusive o próprio X se ele for ímpar. Por exemplo:
para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma dos consecutivos números ímpares a partir do valor X.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n  > 0) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int soma = 0;
			n--;
			
			for (int i = x; y > 0; i++) {

				if (i % 2 != 0) {

					soma += i;
					y--;
				}
			}
			System.out.println(soma);
		}
		sc.close();
	}
}
