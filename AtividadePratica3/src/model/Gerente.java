package model;

public class Gerente extends Funcionario implements FolhaPagamento, Trabalhavel {
    
    private float bonus;
    private String equipe;

    public Gerente() {
    }

    public Gerente(int matricula, String nome, float valorHora, float horasTrab, float bonus, String equipe) {
        super(matricula, nome, valorHora, horasTrab);
        this.bonus = bonus;
        this.equipe = equipe;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        
        return super.toString() +
                "\nBônus: " + bonus +
                "\nEquipe: " + equipe +
                "\nSalário: " + calcularSalario();
    }

    @Override
    public float calcularSalario() {
        return (valorHora * getHorasTrab()) + (bonus * getHorasTrab());
    }
   
    @Override 
    public String trabalhar() {
        String text = "O Gerente " + getNome() + " iniciou o gerenciamento do " + equipe;
        return text;
    }

    @Override
    public String relatarProgresso() {
        String text = "Segundo o " + getNome() + ", o trabalho atual do time " + equipe + " está em 50%";
        return text;
    }
}
