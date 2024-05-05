package model;

public class Desenvolvedor extends Funcionario implements FolhaPagamento {
    
    private String tecnologias;

    public Desenvolvedor() {
    }

    public Desenvolvedor(int matricula, String nome, float valorHora, float horasTrab, String tecnologias) {
        super(matricula, nome, valorHora, horasTrab);
        this.tecnologias = tecnologias;
    }

    public String getTecnologias() {
        return tecnologias;
    }


    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }
    
    @Override
    public String toString() {
        
        return super.toString() +
                "\nTecnologias que domina: " + tecnologias +
                "\nSalário: " + calcularSalario();
    }

    @Override
    public float calcularSalario() {
        return valorHora * getHorasTrab();
    }


}
