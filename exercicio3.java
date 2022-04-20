import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorDiaria, valorPromocional, valorComDesconto, valorOcupacao1, valorOcupacao2, valorDiferenca;
		double apartamento50 = 37.5; 
		int apartamento80 = 60;
		
		
		System.out.println("Digite o valor da diária: ");
		valorDiaria = sc.nextDouble(); //recebe o valor da diária na variável "valorDiaria".
		
		valorPromocional = (valorDiaria * 25/100); // aqui o programa pegará o valor do desconto.
		valorComDesconto = (valorDiaria - valorPromocional); //para melhor visualização, criei outra variável para mostrar o valor da diária já com desconto. 
		
		System.out.println("O valor promocional é R$" + valorComDesconto);

		valorOcupacao1 = (apartamento80 * valorComDesconto); //a variável apartamento80 é fixa. Foi usada para multiplicar o número de apartamentos com o valor da diária já com desconto.
		System.out.println("O valor total arrecadado com 80% de ocupação e diária promocional foi R$" + valorOcupacao1);
		
		valorOcupacao2 = (apartamento50 * valorDiaria); //a variável apartamento50 é fixa. Foi usada para multiplicar o número de apartamentos com valor da diária sem nenhum desconto.
		System.out.println("O valor total arrecadado com 50% de ocupação e diária normal foi de R$" + valorOcupacao2);
		
		valorDiferenca = (valorOcupacao1 - valorOcupacao2); // aqui foi feito a diferença entre os dois valores da letra 'b' e 'c' da questão.
		System.out.println("A diferença destes dois valores é R$" + valorDiferenca);
		
		sc.close();
	}

}
