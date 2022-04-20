import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int valorInformado;
        
        System.out.println("Digite um valor: ");
        valorInformado = sc.nextInt();
        // recebe o valor informado pela pessoa.
        
        String formula = "1"; // essa variável é responsável por armazenar a formula a ser mostrada no final.
        double valorTotal = 1; // armazena o valor da soma de todos.
        for(int i = 2; i <= valorInformado; i++) // comecei com 2 pois não quero que divida por 0 nem por 1.
        {
            formula = formula+" + 1/"+i;
            valorTotal = valorTotal + 1d/i; // somo pelo valor total e divido pelo 'i' que vai ser percorrido na repetição for.
        }
        System.out.println("Resultado: " + valorTotal+" = "+formula); //mostra o resultad
        

        
        sc.close();
	}

}
