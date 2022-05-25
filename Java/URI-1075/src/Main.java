/* Leia um valor inteiro N. Apresente todos os n�meros entre 1 e 10000 que divididos por N d�o resto igual a 2.
 * 
 * Entrada
 * A entrada cont�m um valor inteiro N (N < 10000).
 * 
 * Sa�da
 * Imprima todos valores que quando divididos por N d�o resto = 2, um por linha.
 * 
 * Exemplo
 * =============================================================================
 * Entrada							Sa�da
 * =============================================================================
 * 13								2
 * 									15
 * 									28
 * 									41
 * 									...
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
        for (int i = 1; i <= 10000; i++) {
            if (i % N == 2) {
            	System.out.println(i);
            }
        }

	}

}
