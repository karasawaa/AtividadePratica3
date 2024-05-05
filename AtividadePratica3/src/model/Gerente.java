package model;

public class Gerente extends Funcionario implements FolhaPagamento {
    
    private float bonus;
    private String equipe;

    public Gerente() {
        super(); 
        equipe = "Equipe 1";
        bonus = 3.0f;
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
   
}
