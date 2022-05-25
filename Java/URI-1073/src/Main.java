/* Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 at� N, inclusive N, se for o caso.
 * 
 * Entrada
 * A entrada cont�m um valor inteiro N (5 < N < 2000).
 * 
 * Sa�da
 * Imprima o quadrado de cada um dos valores pares, de 1 at� N, conforme o exemplo abaixo.
 * 
 * Tome cuidado! Algumas linguagens tem por padr�o apresentarem como sa�da 1e+006 ao inv�s de 1000000 o que ocasionar� resposta errada. 
 * Neste caso, configure a precis�o adequadamente para que isso n�o ocorra.
 * 
 * Exemplo
 * =============================================================================
 * Entrada											Sa�da
 * =============================================================================
 * 6												2^2 = 4
 * 													4^2 = 16
 * 													6^2 = 36
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x % 2 == 1) {
            x++;
        }

        for (int i = 2; i <= x; i = i + 2) {
            int quadrado = i * i;
            System.out.println(i+"^"+2 + " = " + quadrado);
        }
		
		sc.close();
	}

}
