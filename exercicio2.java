import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota;
		
		System.out.println("Digite a sua nota: ");
		
		nota = sc.nextInt();
		// a variável nota irá ler e guardar o valor de entrada pelo usuário.
		
		if (nota >= 8 && nota <= 10)
		{
			System.out.println("Ótimo.");
		}
		// a condição verifica se a nota está entre 8 e 10, o resultado será "ótimo".
	
		else if (nota >= 7 && nota < 8)
		{
			System.out.println("Bom.");
		}
		// a condição verifica se a nota é igual a 7, e se for irá ser "bom".
		
		else if (nota >= 5 && nota <7)
		{
			System.out.println("Regular.");
		}
		// verifica se a nota é maior ou igual a 5 ou menor que 7. Caso seja, o resultado será "regular".
		
		else if (nota >= 0 && nota < 5)
		{
			System.out.println("Insuficiente.");
		}
		// verifica se a o valor da variável "nota" é maior ou igual a 0 e menor que 5. Caso seja, o restultado será insuficiente.
		
		else
		{
			System.out.println("Valor inválido.");
		}
		// qualquer outro valor que seja inserido que não esteja dentro das condições, será dado como "valor inválido".
		
		sc.close();
	}

}
