package model;

public class Estagiario extends Funcionario implements FolhaPagamento {
    
    private String supervisor;
    //horas de trabalho todos os funcionário já tem!

    public Estagiario() {
        super(); 
        supervisor = "José Almeida";
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


}
