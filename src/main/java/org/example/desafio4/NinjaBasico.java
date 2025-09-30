package org.example.desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;
    public TipoHabilidade tipoHabilidade;

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("------------------------------------");
        System.out.println("Informações do Ninja basico.");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo de Habilidade: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executou a habilidade do Ninja básico: " + habilidade);
    }
}
