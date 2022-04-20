import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sal, somaSal = 0, maior = -1; 
		int filhos, totalHab = 0, somaFilhos = 0;
		int quantBaixa = 0;
		
		System.out.println("Digite o sal�rio (ou negativo para parar): ");
		sal = sc.nextInt(); //a vari�vel sal ir� receber os valores do sal�rio que os usu�rios digitarem.
		
		while (sal >= 0) //o while vai funcionar apenas se o sal�rio for maior ou igual a 0. Caso seja um numero negativo o programa vai sair do la�o de repeti��o e continuar.
		{
			System.out.println("Digite a quantidade de filhos: ");
			filhos = sc.nextInt(); //lendo a quantidade de filhos.
			totalHab++; //vai aumentar em 1 a quantidade de habitantes.
			somaSal += sal; // a vari�vel somaSal vai somar os sal�rios para fazer a m�dia.
			somaFilhos += filhos; // a vari�vel somaFilhos vai somar os filhos para fazer a m�dia com o totalHab.
			
			if (sal > maior)
			{
				maior = sal;
			}
			// est� inserindo o maior sal�rio na vari�vel maior.
			
			if (sal <= 100)
			{
				quantBaixa++;
			}
			// vai aumentando o n�mero de pessoas que recebem um sal�rio menor que R$100.
			
			System.out.println("Digite o sal�rio (ou negativo para parar): ");
			sal = sc.nextDouble();
		}
		
		if (totalHab > 0)
		{
			System.out.println("A m�dia de sal�rios � R$" + somaSal/totalHab);
			System.out.println("A m�dia de filhos � " + somaFilhos/totalHab);
			System.out.println("O maior sal�rio � R$" + maior);
			System.out.println("O percentual de pessoas com sal�rio at� R$100 � " + (quantBaixa * 100.0)/totalHab);
		}
		// se o total de habitantes for maior que 0, ele mostrar� todos os resultados pedidos.
		
		sc.close();
		
	}
}
