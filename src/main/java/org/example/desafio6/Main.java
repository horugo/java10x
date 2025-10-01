package org.example.desafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Inicializando a LinkedList com 7 ninjas
        LinkedList<Ninja> listDeNinjas = new LinkedList<Ninja>();

        //Lista dos ninjas
        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        //Adicionar o ninja no inicio da lista
        listDeNinjas.addFirst(new Ninja("Boruto", 9, "Konoha"));

        //Remonver o ninja do inicio da lista
        Ninja removido =  listDeNinjas.removeFirst();
        System.out.println("Ninja removido: " + removido);

        //listar os ninjas
        System.out.println("----------------Lista de Ninjas:--------------");
        //Complexidade o(n)
        for (Ninja ninja : listDeNinjas) {
            System.out.println(ninja);
        }

        //Procurar um ninja por indice
        Ninja terceiroNinja = listDeNinjas.get(3);
        System.out.println("Terceiro ninja da lista: " + terceiroNinja);

    }
}
