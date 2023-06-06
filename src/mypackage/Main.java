package mypackage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Digite a capacidade que deseja do vetor: ");
		Lista lista = new Lista(scanner.nextInt());

		menu: while (true) {
			System.out.println("\n----- Sala de Aula -----");
			System.out.println("Opcao 1 - Insira um Aluno(a)");
			System.out.println("Opcao 2 - Buscar pelo Aluno(a)");
			System.out.println("Opcao 3 - Remova um Aluno(a)");
			System.out.println("Opcao 4 - Exibir todos Alunos");
			System.out.println("Opcao 9 - Finalizar");
			System.out.print("Escolha uma das opções acima: ");

			switch (scanner.nextInt()) {
			case 1:
				System.out.println("Nome do Aluno:");
				String nome = scanner.next();
				System.out.println("Matricula do Aluno:");
				int matricula = scanner.nextInt();
				System.out.println("Altura do Aluno:");
				float altura = scanner.nextFloat();
				System.out.println("# Gostaria de salvar esse aluno por qual parametro? ");
				System.out.println("N - Nome \nM - Matricula \nA - Altura ");
				String index = scanner.next();

				lista.insere(new Aluno(nome, matricula, altura, index));

				System.out.println("Aluno adicionado com sucesso!");
				break;
			case 2:
				System.out.println("Com qual parametro o aluno foi armazenado?");
				System.out.println("N - Nome \nM - Matricula \nA - Altura ");
				String atributo = scanner.next();

				System.out.println("Qual o valor desse parametro no aluno que voce quer buscar?");

				String busca = scanner.next();
				Aluno AlunoBusca = lista.buscar(busca, atributo);

				if (AlunoBusca != null) {
					System.out.println("Aluno:" + AlunoBusca);
				} else {
					System.out.println("Aluno não encontrado!");
				}

				break;
			case 3:
				System.out.println("# Com qual parametro o aluno que deseja remover foi armazenado?");
				System.out.println("N - Nome \\nM - Matricula \\nA - Altura ");
				String parametro = scanner.next();

				System.out.println("# Valor do item que voce quer remover:");
				String alunoRemover = scanner.next();

				if (lista.remover(alunoRemover, parametro)) {
					System.out.println("Aluno removido com sucesso!");
				} else {
					System.out.println("Aluno não encontrado para remoção!");
				}
				break;
			case 4:
				System.out.println("... Mostrando lista: ");
				lista.mostrar();
				break;
			case 9:
				System.out.println("Sessão Encerrada!");
				break menu;

			default:
				System.out.println("Opção Inválida!");
				break;
			}
		}
	}
}
