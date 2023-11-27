package brecho;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int op;
		
		while (true) {
			
			System.out.println("*****************************************************");
			System.out.println("*                                                   *");
			System.out.println("*                 BRECHÓ DO LUIS                    *");
			System.out.println("*                                                   *");
			System.out.println("*****************************************************");
			System.out.println("*                                                   *");
			System.out.println("*            1 - Cadastrar Roupa                    *");
			System.out.println("*            2 - Listar todas as Roupas             *");
			System.out.println("*            3 - Buscar Roupa por ID	            *");
			System.out.println("*            4 - Atualizar Roupa                    *");
			System.out.println("*            5 - Apagar Roupa                       *");
			System.out.println("*            9 - Sair                               *");
			System.out.println("*                                                   *");
			System.out.println("*****************************************************");
			System.out.println(" Entre com a opção desejada:                         ");
			System.out.println("                                                     ");
			op = in.nextInt();
			
			if (op == 9) {
				System.out.println("\nSistema encerrado!");
				sobre();
                in.close();
				System.exit(0);
			}
			
			switch (op) {
			case 1:
				System.out.println("Cadastrar Roupa\n\n");
				break;
			case 2:
				System.out.println("Listar todas as Roupas\n\n");
				break;
			case 3:
				System.out.println("Buscar Roupa por ID\n\n");
				break;
			case 4:
				System.out.println("Atualizar Roupa\n\n");
				break;
			case 5:
				System.out.println("Apagar Roupa\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida! Por favor, veja as opções no menu.\n");
				break;
			}
		}
	}
	
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println(" LFSystems - Obrigado por utilizar!");
			System.out.println("*********************************************************");
	}
}
