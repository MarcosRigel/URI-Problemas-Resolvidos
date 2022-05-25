/* A seguinte sequ�ncia de n�meros 0 1 1 2 3 5 8 13 21... � conhecida como s�rie de Fibonacci. Nessa sequ�ncia, cada n�mero, depois dos 2 primeiros, � igual � soma dos 2 anteriores. 
 * Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros n�meros dessa s�rie.
 * 
 * Entrada
 * O arquivo de entrada cont�m um valor inteiro N (0 < N < 46).
 * 
 * Sa�da
 * Os valores devem ser mostrados na mesma linha, separados por um espa�o em branco. N�o deve haver espa�o ap�s o �ltimo valor.
 * 
 * Exemplo
 * =============================================================================
 * Entrada													Sa�da
 * =============================================================================
 * 5														0 1 1 2 3
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        int Fn = 0;
        int fn = 1;

        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
            	System.out.println(Fn);
            }
            else {
            	System.out.println(Fn + " ");
            }
            int aux = fn;
            fn = Fn;
            Fn = aux + fn;
        }
	}

}
