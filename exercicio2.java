import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota;
		
		System.out.println("Digite a sua nota: ");
		
		nota = sc.nextInt();
		// a vari�vel nota ir� ler e guardar o valor de entrada pelo usu�rio.
		
		if (nota >= 8 && nota <= 10)
		{
			System.out.println("�timo.");
		}
		// a condi��o verifica se a nota est� entre 8 e 10, o resultado ser� "�timo".
	
		else if (nota >= 7 && nota < 8)
		{
			System.out.println("Bom.");
		}
		// a condi��o verifica se a nota � igual a 7, e se for ir� ser "bom".
		
		else if (nota >= 5 && nota <7)
		{
			System.out.println("Regular.");
		}
		// verifica se a nota � maior ou igual a 5 ou menor que 7. Caso seja, o resultado ser� "regular".
		
		else if (nota >= 0 && nota < 5)
		{
			System.out.println("Insuficiente.");
		}
		// verifica se a o valor da vari�vel "nota" � maior ou igual a 0 e menor que 5. Caso seja, o restultado ser� insuficiente.
		
		else
		{
			System.out.println("Valor inv�lido.");
		}
		// qualquer outro valor que seja inserido que n�o esteja dentro das condi��es, ser� dado como "valor inv�lido".
		
		sc.close();
	}

}
