/* Fa�a um programa que mostre os n�meros pares entre 1 e 100, inclusive.
 * 
 * Entrada
 * Neste problema extremamente simples de repeti��o n�o h� entrada.
 * 
 * Sa�da
 * Imprima todos os n�meros pares entre 1 e 100, inclusive se for o caso, um em cada linha.
 * 
 * Exemplo
 * ==========================================================
 * Entrada					Sa�da
 * ==========================================================
 * 							2
 * 							4
 * 							6
 * 							...
 * 							100
 */
public class Main {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 100; i = i + 2) {
			System.out.println(i);
		}

	}

}
