package view;

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
        System.out.println("1) ");
        System.out.println("2) ");
        System.out.println("3) ");
        System.out.println("4) ");
        System.out.println("5) ");
        System.out.println("6) ");
        System.out.println("0) ");
        System.out.print("Sua opção: ");

    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                
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
