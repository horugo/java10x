package org.example.codigoRefatorado;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    /*
    * Metodo:
    * Implementa da interface Sharingan
    * */
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

}
