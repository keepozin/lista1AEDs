import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sal, somaSal = 0, maior = -1; 
		int filhos, totalHab = 0, somaFilhos = 0;
		int quantBaixa = 0;
		
		System.out.println("Digite o salário (ou negativo para parar): ");
		sal = sc.nextInt(); //a variável sal irá receber os valores do salário que os usuários digitarem.
		
		while (sal >= 0) //o while vai funcionar apenas se o salário for maior ou igual a 0. Caso seja um numero negativo o programa vai sair do laço de repetição e continuar.
		{
			System.out.println("Digite a quantidade de filhos: ");
			filhos = sc.nextInt(); //lendo a quantidade de filhos.
			totalHab++; //vai aumentar em 1 a quantidade de habitantes.
			somaSal += sal; // a variável somaSal vai somar os salários para fazer a média.
			somaFilhos += filhos; // a variável somaFilhos vai somar os filhos para fazer a média com o totalHab.
			
			if (sal > maior)
			{
				maior = sal;
			}
			// está inserindo o maior salário na variável maior.
			
			if (sal <= 100)
			{
				quantBaixa++;
			}
			// vai aumentando o número de pessoas que recebem um salário menor que R$100.
			
			System.out.println("Digite o salário (ou negativo para parar): ");
			sal = sc.nextDouble();
		}
		
		if (totalHab > 0)
		{
			System.out.println("A média de salários é R$" + somaSal/totalHab);
			System.out.println("A média de filhos é " + somaFilhos/totalHab);
			System.out.println("O maior salário é R$" + maior);
			System.out.println("O percentual de pessoas com salário até R$100 é " + (quantBaixa * 100.0)/totalHab);
		}
		// se o total de habitantes for maior que 0, ele mostrará todos os resultados pedidos.
		
		sc.close();
		
	}
}
