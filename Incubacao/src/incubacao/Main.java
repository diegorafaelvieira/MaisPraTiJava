package incubacao;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();


		int opc = 0;

		do {
			System.out.println("MENU");
			System.out.println("[1] - Cadastrar");
			System.out.println("[2] - Listar");
			System.out.println("[3] - Alterar");
			System.out.println("[4] - Deletar");
			System.out.println("[5] - Sair");
			System.out.println("Opção: ");

			try {
				opc = Integer.parseInt(leitor.nextLine());

			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Opção inválida!");
			}

			switch (opc) {
			case 1:
				System.out.print("Digite o nome: ");
				String nome = leitor.nextLine();
				System.out.print("Digite o telefone: ");
				String telefone = leitor.nextLine();
				System.out.print("Digite a data de nascimento: ");
				String dataNasc = leitor.nextLine();
				System.out.print("Digite a data de cadastro: ");
				String dataCad = leitor.nextLine();
				//Pessoa ou Aluno
				System.out.println("Deseja informar nota: (S/N)");
				String res = leitor.nextLine();
				if (res.equalsIgnoreCase("S")) {
					System.out.print("Digite a nota final: ");
					double nota = leitor.nextDouble();
					leitor.nextLine(); //Limpar Scanner
					alunos.add(new Aluno(nome, telefone, dataNasc, dataCad, nota));

				} else {
					pessoas.add(new Pessoa(nome, telefone, dataNasc, dataCad));

				}
				break;

			case 2:
				//Exibindo Pessoas
				for(int i=0; i < pessoas.size(); i++) {
					System.out.println("Nome: "+pessoas.get(i).getNome() + 
							" Telefone: "+pessoas.get(i).getTelefone() +
							" Data Nascimento: "+pessoas.get(i).getDataNasc() +
							" Data Cadastro: "+pessoas.get(i).getDataCad());						
				}
				//Exibindo Alunos
				for(int i=0; i < alunos.size(); i++) {
					System.out.println("Nome: "+alunos.get(i).getNome() + 
							" Telefone: "+alunos.get(i).getTelefone() +
							" Data Nascimento: "+alunos.get(i).getDataNasc() +
							" Data Cadastro: "+alunos.get(i).getDataCad() +
							" Nota: "+alunos.get(i).getNotaFinal());				
				}
				break;

			case 3:
				//leitor.nextLine(); // Limpa Scanner
				System.out.println("Informe o NOME a ser alterado");
				String nomeEdit = leitor.nextLine();
				//Verifica em Pessoas
				for(int i = 0;i < pessoas.size(); i++) {
					if((pessoas.get(i).getNome().equalsIgnoreCase(nomeEdit))) {
						//Aqui Removo o cadastro antigo
						//pessoas.remove(i);
						//Alterando Dados Pessoa
						System.out.print("Digite o nome: ");
						String nomeAlt = leitor.nextLine();
						System.out.print("Digite o telefone: ");
						String telefoneAlt = leitor.nextLine();
						System.out.print("Digite a data de nascimento: ");
						String dataNascAlt = leitor.nextLine();
						System.out.print("Digite a data de cadastro: ");
						String dataCadAlt = leitor.nextLine();
						System.out.print("Digite a data de alteração no cadastro: ");
						String dataAlt = leitor.nextLine();
						//Pessoa ou Aluno
						System.out.println("Deseja informar nota: (S/N)");
						String resAlt = leitor.nextLine();
						if (resAlt.equalsIgnoreCase("S")) {
							System.out.print("Digite a nota final: ");
							double notaAlt = leitor.nextDouble();
							leitor.nextLine(); //Limpar Scanner
							alunos.add(new Aluno(nomeAlt, telefoneAlt, dataNascAlt, dataCadAlt, dataAlt, notaAlt));
							System.out.println("Aluno alterado com sucesso!");
						} else {
							pessoas.add(new Pessoa(nomeAlt, telefoneAlt, dataNascAlt, dataCadAlt, dataAlt));
							System.out.println("Pessoa alterada com sucesso!");
						}
					}


				}
				//Verifica em Alunos
				for(int i = 0;i < alunos.size(); i++) {
					if((pessoas.get(i).getNome().equalsIgnoreCase(nomeEdit))) {
						//Aqui Removo o cadastro antigo
						//alunos.clear(i);
						//Alterando Dados Pessoa
						System.out.print("Digite o nome: ");
						String nomeAlt = leitor.nextLine();
						System.out.print("Digite o telefone: ");
						String telefoneAlt = leitor.nextLine();
						System.out.print("Digite a data de nascimento: ");
						String dataNascAlt = leitor.nextLine();
						System.out.print("Digite a data de cadastro: ");
						String dataCadAlt = leitor.nextLine();
						System.out.print("Digite a data de alteração no cadastro: ");
						String dataAlt = leitor.nextLine();
						//Pessoa ou Aluno
						System.out.println("Deseja informar nota: (S/N)");
						String resAlt = leitor.nextLine();
						if (resAlt.equalsIgnoreCase("S")) {
							System.out.print("Digite a nota final: ");
							double notaAlt = leitor.nextDouble();
							leitor.nextLine(); //Limpar Scanner
							alunos.add(new Aluno(nomeAlt, telefoneAlt, dataNascAlt, dataCadAlt, dataAlt, notaAlt));
							System.out.println("Aluno alterado com sucesso!");
						} else {
							pessoas.add(new Pessoa(nomeAlt, telefoneAlt, dataNascAlt, dataCadAlt, dataAlt));
							System.out.println("Pessoa alterada com sucesso!");
						}
					}
				}

				break;

			case 4:
				//leitor.nextLine(); // Limpa Scanner
				System.out.println("Informe o NOME a ser removido: ");
				String nomeRemover = leitor.nextLine();
				//Verifica em Pessoas
				for (int i = 0; i < pessoas.size(); i++) {
					if ((pessoas.get(i).getNome().equalsIgnoreCase(nomeRemover))) {
						pessoas.remove(i);
						System.out.println("Pessoa removida!");
					} 
				}
				//Verifica em Alunos
				for (int i = 0; i < alunos.size(); i++) {
					if ((alunos.get(i).getNome().equalsIgnoreCase(nomeRemover))) {
						alunos.remove(i);
						System.out.println("Aluno removido!");
					} 
				}
				break;

			case 5:
				System.out.println("SAINDO...");
				break;
			}


		} while (opc != 5);
		leitor.close();
	}

}
