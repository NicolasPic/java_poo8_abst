package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<Pessoa> lista = new ArrayList<>();
		
		System.out.println("Entre com o numero de taxas:");
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da taxa #" + (i+1));
			System.out.println("Pessoa fisica ou juridica (f/j)?");
			char x = sc.next().charAt(0);
			
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Qual a renda anual:");
			double rendaAnual = sc.nextDouble();
			if(x == 'f') {
				System.out.println("Gastos com saude:");
				double gasto = sc.nextDouble();
				lista.add(new PessoaFisica(nome,rendaAnual,gasto));
			} else {
				System.out.println("Numero de empregados:");
				int num = sc.nextInt();
				lista.add(new PessoaJuridica(nome,rendaAnual,num));
			}		
			
		}
		double som=0;
		System.out.println("Taxas Pagas:");
		for(Pessoa e : lista) {
			som += e.tax();
			System.out.println(e);
		}
		
		System.out.println("\nTAXAS TOTAIS: $ " + som);
		
		sc.close();
	}

}
