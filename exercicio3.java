import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorDiaria, valorPromocional, valorComDesconto, valorOcupacao1, valorOcupacao2, valorDiferenca;
		double apartamento50 = 37.5; 
		int apartamento80 = 60;
		
		
		System.out.println("Digite o valor da di�ria: ");
		valorDiaria = sc.nextDouble(); //recebe o valor da di�ria na vari�vel "valorDiaria".
		
		valorPromocional = (valorDiaria * 25/100); // aqui o programa pegar� o valor do desconto.
		valorComDesconto = (valorDiaria - valorPromocional); //para melhor visualiza��o, criei outra vari�vel para mostrar o valor da di�ria j� com desconto. 
		
		System.out.println("O valor promocional � R$" + valorComDesconto);

		valorOcupacao1 = (apartamento80 * valorComDesconto); //a vari�vel apartamento80 � fixa. Foi usada para multiplicar o n�mero de apartamentos com o valor da di�ria j� com desconto.
		System.out.println("O valor total arrecadado com 80% de ocupa��o e di�ria promocional foi R$" + valorOcupacao1);
		
		valorOcupacao2 = (apartamento50 * valorDiaria); //a vari�vel apartamento50 � fixa. Foi usada para multiplicar o n�mero de apartamentos com valor da di�ria sem nenhum desconto.
		System.out.println("O valor total arrecadado com 50% de ocupa��o e di�ria normal foi de R$" + valorOcupacao2);
		
		valorDiferenca = (valorOcupacao1 - valorOcupacao2); // aqui foi feito a diferen�a entre os dois valores da letra 'b' e 'c' da quest�o.
		System.out.println("A diferen�a destes dois valores � R$" + valorDiferenca);
		
		sc.close();
	}

}
