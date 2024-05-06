package model;

public class Estagiario extends Funcionario implements FolhaPagamento, Trabalhavel {
    
    private String supervisor;
    //horas de trabalho todos os funcionário já tem!

    public Estagiario(){
    }

    public Estagiario(int matricula, String nome, float valorHora, float horasTrab, String supervisor) {
        super(matricula, nome, valorHora, horasTrab);
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        
        return super.toString() +
                "\nSupervisor: " + supervisor +
                "\nSalário: " + calcularSalario();
    }

    @Override
    public float calcularSalario() {
        return valorHora * getHorasTrab();
    }

    @Override 
    public String trabalhar() {
        String text = "O Estagiario " + getNome() + " está com o Supervisor " + supervisor + " realizando um trabalho";
        return text;
    }

    @Override 
    public String relatarProgresso() {
        String text = "Segundo o Supervisor " + supervisor + ", o estagiário " + getNome() + " está se saindo muito bem";
        return text;
    }

}
