/* Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela f�rmula:
 * S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
 * 
 * Entrada
 * N�o h� nenhuma entrada neste problema.
 * 
 * Sa�da
 * A sa�da cont�m um valor correspondente ao valor de S.
 * O valor deve ser impresso com dois d�gitos ap�s o ponto decimal.
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		float S = 1, i, j;
		
		for (i = 3,j = 2;  i <= 39; i+=2,j *= 2) {
			S += i / j;
		}
		
		System.out.printf("%.2f\n",S);
	}

}
