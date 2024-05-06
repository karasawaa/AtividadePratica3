package view;

import java.util.ArrayList;

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

        System.out.println("\nCadastros:");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Desenvolvedor");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("\nRemover:");
        System.out.println("4) Remover Gerente");
        System.out.println("5) Remover Desenvolvedor");
        System.out.println("6) Remover Estagiário");
        System.out.println("\nListas:");
        System.out.println("7) Listar Gerentes");
        System.out.println("8) Listar Desenvolvedores");
        System.out.println("9) Listar Estagiários");
        System.out.println("\nBuscas:");
        System.out.println("10) Buscar Gerentes");
        System.out.println("11) Buscar Desenvolvedores");
        System.out.println("12) Buscar Estagiários");
        System.out.println("\n0) Sair");
        System.out.print("Sua opção: ");

    }

    //1
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

    //2
    private static void cadastrarDesenvolvedor() {

        System.out.println("\nCadastro de Desenvolvedor:");

        int matricula;
        while (true) { 

            System.out.println("Matrícula: ");
            matricula = Console.lerInt();

            if (CadastroDesenvolvedores.buscarDesenvolvedor(matricula) != null) {
                System.out.println("\nDesenvolvedor " + matricula +
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
        System.out.println("Tecnologias que domina: ");
        String tecnologias = Console.lerString();

        Desenvolvedor desenvolvedor = new Desenvolvedor(matricula, nome, valorHora, horasTrab, tecnologias);

        CadastroDesenvolvedores.cadastrarDesenvolvedor(desenvolvedor);

        System.out.println("\nDesenvolvedor Cadastrado com sucesso!");

    }

    //3
    private static void cadastrarEstagiario() {

        System.out.println("\nCadastro de Estagiário:");

        int matricula;
        while (true) { 

            System.out.println("Matrícula: ");
            matricula = Console.lerInt();

            if (CadastroEstagiarios.buscarEstagiario(matricula) != null) {
                System.out.println("\nEstagiário " + matricula +
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
        System.out.println("Supervisor: ");
        String supervisor = Console.lerString();

        Estagiario estagiario = new Estagiario(matricula, nome, valorHora, horasTrab, supervisor);

        CadastroEstagiarios.cadastrarEstagiario(estagiario);

        System.out.println("\nEstagiário Cadastrado com sucesso!");
    }

    //7
    private static void listarGerentes() {

        System.out.println("\nLista de gerentes cadastrados:");

        if (CadastroGerentes.listaGerentesVazia()) {
            System.out.println("\nNão há gerentes cadastrados...");
            return;
        }

        for (Gerente tempGerente : CadastroGerentes.getListaGerentes()) {
            System.out.println(tempGerente);
        }
    }

    //8
    private static void listarDesenvolvedores() {

        System.out.println("\nLista de desenvolvedores cadastrados:");

        if (CadastroDesenvolvedores.listaDesenvolvedoresVazia()) {
            System.out.println("\nNão há desenvolvedores cadastrados...");
            return;
        }

        for (Desenvolvedor tempDesenvolvedor : CadastroDesenvolvedores.getListaDesenvolvedores()) {
            System.out.println(tempDesenvolvedor);
        }
    }

    //9
    private static void listarEstagiarios() {

        System.out.println("\nLista de estagiários cadastrados:");

        if (CadastroEstagiarios.listaEstagiariosVazia()) {
            System.out.println("\nNão há estagiários cadastrados...");
            return;
        }

        for (Estagiario tempEstagiario : CadastroEstagiarios.getListaEstagiario()) {
            System.out.println(tempEstagiario);
        }
    }


    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                cadastrarGerente();
                break;

            case 2:
                cadastrarDesenvolvedor();
                break;

            case 3:
                cadastrarEstagiario();
                break;

            case 4:
                
                break;
            case 5:
                listarGerentes();
                break;

            case 6:
                listarDesenvolvedores();
                break;
            case 7:
                listarEstagiarios();
                break;

            case 8:
                
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
