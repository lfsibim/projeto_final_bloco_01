package brecho;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import brecho.controller.RoupaController;
import brecho.model.Calca;
import brecho.model.Camiseta;

public class Menu {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int op, tipo, id;
		double valor;
		String marca, tamanho, cor, manga, barra;
		
		RoupaController roupas = new RoupaController();
		
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
			
			try {
				op = in.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				in.nextLine();
				op=0;
			}

			
			if (op == 9) {
				System.out.println("\nSistema encerrado!");
				sobre();
                in.close();
				System.exit(0);
			}
			
			switch (op) {
			case 1:
				System.out.println("Cadastrar Roupa\n");
				do {
					System.out.println("Digite o tipo da roupa (1-Camiseta ou  2-Calça)");
					tipo = in.nextInt();
				}while(tipo < 1 && tipo > 2);
				System.out.println("Digite a marca da roupa: ");
				marca = in.next();
				System.out.println("Digite o tamanho da roupa: ");
				tamanho = in.next();
				System.out.println("Digite a cor da roupa: ");
				cor = in.next();
				System.out.println("Digite o valor da roupa: ");
				valor = in.nextDouble();
				switch(tipo) {
					case 1 -> {
						System.out.println("Digite o tipo da manga da camiseta: ");
						manga = in.next();
						roupas.cadastrarProduto(new Camiseta(marca, tamanho, cor, tipo, roupas.gerarId(), valor, manga));
					}
					case 2 -> {
						System.out.println("Digite o tipo da barra da calça: ");
						barra = in.next();
						roupas.cadastrarProduto(new Calca(marca, tamanho, cor, tipo, roupas.gerarId(), valor, barra));
					}
				}
				keyPress();
				break;
			case 2:
				System.out.println("Listar todas as Roupas\n\n");
				roupas.listarProdutos();
				keyPress();
				break;
			case 3:
				System.out.println("Buscar Roupa por ID\n\n");
				System.out.println("Digite o ID da Roupa: ");
				id = in.nextInt();
				roupas.buscarProdutoPorId(id);
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar Roupa\n\n");
				System.out.println("Digite o ID da Roupa: ");
				id = in.nextInt();
				
				var buscarRoupa = roupas.buscarNaCollection(id);
				if(buscarRoupa != null) {
					tipo = buscarRoupa.getTipo();
					
					System.out.println("Digite a marca da roupa: ");
					marca = in.next();
					System.out.println("Digite o tamanho da roupa: ");
					tamanho = in.next();
					System.out.println("Digite a cor da roupa: ");
					cor = in.next();
					System.out.println("Digite o valor da roupa: ");
					valor = in.nextDouble();
					
					switch(tipo) {
					case 1 -> {
						System.out.println("Digite o tipo da manga da camiseta: ");
						manga = in.next();
						roupas.cadastrarProduto(new Camiseta(marca, tamanho, cor, tipo, roupas.gerarId(), valor, manga));
					}
					case 2 -> {
						System.out.println("Digite o tipo da barra da calça: ");
						barra = in.next();
						roupas.cadastrarProduto(new Calca(marca, tamanho, cor, tipo, roupas.gerarId(), valor, barra));
					}
					default -> {
						System.out.println("Tipo de roupa inválido.");
					}
					}
				}else {
					System.out.println("A roupa não foi encontrada.");
				}
				
				
				
				keyPress();
				break;
			case 5:
				System.out.println("Apagar Roupa\n\n");
				System.out.println("Digite o ID da roupa: ");
				id = in.nextInt();
				roupas.excluirProduto(id);
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida! Por favor, veja as opções no menu.\n");
				keyPress();
				break;
			}
		}
	}
	
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println(" LFSystems - Obrigado por utilizar!");
			System.out.println("*********************************************************");
	}
		
		public static void keyPress() {
			try {
				System.out.println("\n\nPressione Enter para continuar...");
				System.in.read();
			} catch (IOException e) {
				System.out.println("Você pressionou uma tecla diferente de enter!");
			}
		}
}
