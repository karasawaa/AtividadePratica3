package controller;

import java.util.ArrayList;

import model.Gerente;

public class CadastroGerentes {

    private static ArrayList<Gerente> listaGerentes = new ArrayList<>();

    public static void cadastrarGerente(Gerente gerente) {
        listaGerentes.add(gerente);
    }

    public static ArrayList<Gerente> getListaGerentes() {
        return listaGerentes;
    }

    public static boolean listaGerentesVazia() {
        // retorna true, se vazia, ou false, se há cadastros
        return listaGerentes.isEmpty(); 
    }

        public static Gerente buscarGerente(int matricula) {

            for(Gerente tempGerente : listaGerentes) {

                if (tempGerente.getMatricula() == matricula) {
                    return tempGerente;
                }
            }

            return null;

        }
}
