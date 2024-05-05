package view;

import controller.CadastroGerentes;
import controller.CadastroDesenvolvedores;
import controller.CadastroEstagiarios;
import model.*;

public class Sistema {

    public static void executar() {

        int op;

        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

    private static void exibirMenu() {

        System.out.println("\nGerenciamento de Turmas");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Desenvolvedor");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("4) Remover funcionário existente");
        System.out.println("5) Exibir todos os funcionários");
        System.out.println("6) Buscar funcionários");
        System.out.println("0) Sair");
        System.out.print("Sua opção: ");

    }

    private static void cadastrarGerente() {

        System.out.println("\nCadastro de Gerente:");

        int matricula;
        while (true) { 

            System.out.println("Matrícula: ");
            matricula = Console.lerInt();

            if (CadastroGerentes.buscarGerente(matricula) != null) {
                System.out.println("\nGerente " + matricula +
                        " já se encontra cadastrado no sistema!");
            } else {
                break; 
            }
        }

        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Valor da hora: ");
        float valorHora = Console.lerFloat();
        System.out.println("Horas trabalhadas: ");
        float horasTrab = Console.lerFloat();
        System.out.println("Bônus de gerente: ");
        float bonus = Console.lerFloat();
        System.out.println("Equipe que lidera: ");
        String equipe = Console.lerString();

        Gerente gerente = new Gerente(matricula, nome, valorHora, horasTrab, bonus, equipe);

        CadastroGerentes.cadastrarGerente(gerente);

        System.out.println("\nGerente Cadastrado com sucesso!");

    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                cadastrarGerente();
                break;

            case 2:
                
                break;

            case 3:
                
                break;

            case 4:
                
                break;
            case 5:
                
                break;

            case 6:
                
                break;
            case 0:
                System.out.println("\nO sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente");
                break;
        }
    }
}
