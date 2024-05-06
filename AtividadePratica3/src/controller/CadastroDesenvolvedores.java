package controller;

import java.util.ArrayList;

import model.Desenvolvedor;
import model.Funcionario;

public class CadastroDesenvolvedores {

    private static ArrayList<Desenvolvedor> listaDesenvolvedores = new ArrayList<>();

    public static void cadastrarDesenvolvedor(Desenvolvedor desenvolvedor) {
        listaDesenvolvedores.add(desenvolvedor);
    }

    public static ArrayList<Desenvolvedor> getListaDesenvolvedores() {
        return listaDesenvolvedores;
    }

    public static boolean listaDesenvolvedoresVazia() {
        // retorna true, se vazia, ou false, se há cadastros
        return listaDesenvolvedores.isEmpty(); 
    }

    public static Desenvolvedor buscarDesenvolvedor(int matricula) {

        for(Desenvolvedor tempDesenvolvedor : listaDesenvolvedores) {

            if (tempDesenvolvedor.getMatricula() == matricula) {
                return tempDesenvolvedor;
            }
        }

        return null;
    }

    public static boolean removerDesenvolvedor(int id) {

        for (Funcionario temporario : listaDesenvolvedores) {
            if(temporario.getMatricula() == id) {
                listaDesenvolvedores.remove(temporario);
                return true;
            }
        }
        return false;
    }
}

