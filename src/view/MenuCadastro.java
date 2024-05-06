package view;

import java.util.Scanner;

import controller.CadastroEquipes;
import controller.CadastroFuncionarios;
import controller.Trabalhavel;
import model.Desenvolvedor;
import model.Equipe;
import model.Estagiario;
import model.Gerente;

public class MenuCadastro {

	public static Scanner sc = new Scanner(System.in);

	private static void exibirMenu() {

		System.out.println("\nGerenciamnete de Funcionarios!!");
		System.out.println("1) Cadastrar um funcionario");
		System.out.println("2) Cadastrar uma equipe");
		System.out.println("3) Listar funcionarios");
		System.out.println("4) Listar Equipes");
		System.out.println("5) Excluir pessoa cadastrada");
		System.out.println("6) Excluir todas as pessoa cadastrados");
		System.out.println("0) Finalizar ");

	}

	private static void verificarOp(int op) {
			
			String name = "";
			int mat = 0;
			double sal = 0.0;
			int searchMat = 0;
			
			switch(op) {
			
				case 1:
						
					System.out.print("\nDigite (d) desenvolvedor e (e) para estagiario: ");
					char f = sc.next().charAt(0);
					sc.nextLine();
					
					System.out.print("\nDigite o nome: ");
					name = sc.nextLine();
					
					System.out.print("Digite a matricula: ");
					mat = sc.nextInt();
					
					System.out.print("Digite o salario fixo: ");
					sal = sc.nextDouble();
					
					if (f == 'd') {
						
							
						System.out.print("Digite a tecnologia: ");
						sc.nextLine();
						String tec = sc.nextLine();
						
						Desenvolvedor dev = new Desenvolvedor(name, mat, sal, tec);
						
						CadastroFuncionarios.addFunc(dev);
						
						System.out.println("\nDev cadastrado com sucesso!!");
						

							
					} else if (f == 'e') {
							
						System.out.print("Digite o numero de matricula do supervisor: ");
						searchMat = sc.nextInt();
						sc.nextLine();
						
						CadastroFuncionarios.buscar(searchMat);
						
						System.out.print("Digite o numero de horas trabalhadas: ");
						int h = sc.nextInt();
						
						System.out.print("Digite o valor de horas trabalhadas: ");
						double v = sc.nextDouble();
						
						Estagiario es = new Estagiario(name, mat, sal, CadastroFuncionarios.buscar(searchMat), h, v);
						
						CadastroFuncionarios.addFunc(es);;
						
						System.out.println("\nEstagiario cadastrado com sucesso!!");
								
					 }
						
						break;
						
					case 2:
				
				        System.out.print("\nCadastro de Equipe:");

				        System.out.print("\nCódigo da equipe:");
				        int cod = sc.nextInt();
				        sc.nextLine();

				        System.out.print("Nome do gerente da equipe: ");
				        name = sc.nextLine();

				        System.out.print("Digite o numero de matricula: ");
						mat = sc.nextInt();
						
						System.out.print("Digite o salario fixo: ");
						sal = sc.nextDouble();
							
						
						Gerente gerente = new Gerente(name, mat, sal);
						
						CadastroFuncionarios.addFunc(gerente);
						
						System.out.println("\nGerente cadastrado com sucesso!!");
				       
				        Equipe equipe = new Equipe(cod, gerente, CadastroFuncionarios.allList());
				        gerente.setEquipe(equipe);
				        CadastroEquipes.cadastrarEquipe(equipe);

				        System.out.println("\nEquipe cadastrada com sucesso!");

	
						break;
						
					case 3:
						
						
						System.out.print("\nDigite (g) para gerente, (d) desenvolvedor, (e) estagiario ou (t) para imprimir todos: ");
						char j = sc.next().charAt(0);
						sc.nextLine();
						if(j == 'g') {
							System.out.println("\nTodos os gerentes cadastrados: ");
							System.out.println(CadastroFuncionarios.getGerentes());
						} else if (j == 'd'){
							System.out.println("\nTodos os devs cadastrados: ");
							System.out.println(CadastroFuncionarios.getDevs());
						} else if (j == 'e'){
							System.out.println("\nTodos os estagiarios cadastrados: ");
							System.out.println(CadastroFuncionarios.getEstagiarios());
						} else if ( j == 't') {
							System.out.println("\nTodos os funcionarios cadastrados: ");
							for (Trabalhavel tempF : CadastroFuncionarios.allList()) {
								System.out.println(tempF);
							}

						}
					    
						break;
						
					case 4:
						
						System.out.println("\nTodos os funcionarios cadastrados: ");
						for (Equipe tempE : CadastroEquipes.getListaEquipes()) {
							System.out.println(tempE);
						}
						
						
						break;
					
					case 5:
						
						System.out.print("\nDigite um nuero de matricula para pesquisar: ");
					    searchMat = sc.nextInt();
						
						if(CadastroFuncionarios.excluir(searchMat)) {
							
							System.out.println("\nFuncionario foi removida com sucesso!!");
							
						} else {
							
							System.out.println("\nMatricula " + searchMat + " foi removida com sucesso!!");
							
						}
						
						break;
						
					case 6:
						
						CadastroFuncionarios.excluirAllList();;
						
						System.out.println("\nTodas as pessoas foram removidas com sucesso!!");
						
						break;
						
					case 0:
						
						System.out.println("\nPrograma finalizado!!");
						
						break;
						
					default:
						
						System.out.println("\nNumero foi digitado errado!!");
						
						break;
			}

	System.out.println();

	}

	public static void executar() {

		int op;

		do {

			exibirMenu();
			op = sc.nextInt();
			sc.nextLine();
			verificarOp(op);

		} while (op != 0);

	}
}
