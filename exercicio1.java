import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n1, n2, soma, soma1; 
			
			System.out.println("Digite dois n�meros (com espa�o): ");
			
			n1 = sc.nextInt(); 
			n2 = sc.nextInt();
			
			//Nas duas linhas acima ele ir� ler os dois valores que ir�o somar.
			
			soma = (n1 + n2);
			
			// A vari�vel soma vai guardar os dois valores ap�s a adi��o.
			
			if (soma >= 10) {
				soma1 = soma + 5;
			}
			// a linha de cima verifica se a soma � maior ou igual a 10, e caso seja somar� 5.
				else {
				soma1 = soma + 7;
			}
			// a linha de cima verifica que caso n�o seja a condi��o anterior, ele somar� 7 a vari�vel "soma1".
			
			
			
			System.out.println("O resultado da conta �: " + soma1);
			
			
			sc.close();

	}

}
