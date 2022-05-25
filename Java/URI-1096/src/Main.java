/*Voc� deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 * 
 * Entrada
 * N�o h� nenhuma entrada neste problema.
 * 
 * Sa�da
 * Imprima a sequencia conforme exemplo abaixo
 * 
 * Exemplo
 * =============================================================================
 * Entrada									Sa�da
 * =============================================================================
 * 											I=1 J=7
 * 											I=1 J=6
 * 											I=1 J=5
 * 											I=3 J=7
 * 											I=3 J=6
 * 											I=3 J=5
 * 											...
 * 											I=9 J=7
 * 											I=9 J=6
 * 											I=9 J=5
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i += 2) {
            for (int j = 7; j >= 5; j--) {
            	System.out.print("I=" + i + " J=" + j + "\n");
            }
        }
	}

}
