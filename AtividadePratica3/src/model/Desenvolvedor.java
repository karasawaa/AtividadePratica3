package model;

public class Desenvolvedor extends Funcionario implements FolhaPagamento {
    
    private String tecnologias;

    public Desenvolvedor() {
        super(); 
        tecnologias = "Java, C++, Javascript, SQL e Html";
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
