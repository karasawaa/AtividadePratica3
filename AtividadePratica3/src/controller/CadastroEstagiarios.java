package controller;

import java.util.ArrayList;

import model.Estagiario;
import model.Funcionario;

public class CadastroEstagiarios {

    private static ArrayList<Estagiario> listaEstagiarios = new ArrayList<>();

    public static void cadastrarEstagiario(Estagiario estagiario) {
        listaEstagiarios.add(estagiario);
    }

    public static ArrayList<Estagiario> getListaEstagiario() {
        return listaEstagiarios;
    }

    public static boolean listaEstagiariosVazia() {
        // retorna true, se vazia, ou false, se há cadastros
        return listaEstagiarios.isEmpty(); 
    }

    public static Estagiario buscarEstagiario(int matricula) {

        for(Estagiario tempEstagiario : listaEstagiarios) {

            if (tempEstagiario.getMatricula() == matricula) {
                return tempEstagiario;
            }
        }

        return null;
    }
    
    public static boolean removerEstagiario(int id) {

        for (Funcionario temporario : listaEstagiarios) {
            if(temporario.getMatricula() == id) {
                listaEstagiarios.remove(temporario);
                return true;
            }
        }
        return false;
    }
}
