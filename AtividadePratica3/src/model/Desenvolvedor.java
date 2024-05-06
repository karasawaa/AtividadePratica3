package model;

public class Desenvolvedor extends Funcionario implements FolhaPagamento, Trabalhavel {
    
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

    @Override
    public String trabalhar() {
        String text = "O Desenvolvedor " + getNome() + " iniciou o desenvolvimento do projeto";
        return text;
    }

    @Override
    public String relatarProgresso() {
        String text = "De acordo com o desenvolvedor " + getNome() + ", o projeto está 50% concluido";
        return text;
    }

}
