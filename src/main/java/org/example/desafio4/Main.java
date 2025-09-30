package org.example.desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico ninjaBasico = new NinjaBasico("Victor",
                34,
                "Ataque das corujas",
                TipoHabilidade.GENJUTSU);
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Horugo",
                150,
                "Martelo de guerra",
                "martelada", TipoHabilidade.NINJUTSU);
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
    }
}
