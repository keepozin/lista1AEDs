import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n1, n2, soma, soma1; 
			
			System.out.println("Digite dois números (com espaço): ");
			
			n1 = sc.nextInt(); 
			n2 = sc.nextInt();
			
			//Nas duas linhas acima ele irá ler os dois valores que irão somar.
			
			soma = (n1 + n2);
			
			// A variável soma vai guardar os dois valores após a adição.
			
			if (soma >= 10) {
				soma1 = soma + 5;
			}
			// a linha de cima verifica se a soma é maior ou igual a 10, e caso seja somará 5.
				else {
				soma1 = soma + 7;
			}
			// a linha de cima verifica que caso não seja a condição anterior, ele somará 7 a variável "soma1".
			
			
			
			System.out.println("O resultado da conta é: " + soma1);
			
			
			sc.close();

	}

}
