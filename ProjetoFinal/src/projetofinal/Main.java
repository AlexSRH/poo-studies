package projetofinal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Video[] videos = new Video[3];

        videos[0] = new Video("Aula 01 - POO");
        videos[1] = new Video("Aula 02 - POO");
        videos[2] = new Video("Clean Code");

        Gafanhoto[] gafanhotos = new Gafanhoto[2];

        gafanhotos[0] = new Gafanhoto("Alexsandro", 16, 'M', "AlexSRH");
        gafanhotos[1] = new Gafanhoto("Sarah", 17, 'F', "xxSrh2020");

        Visualizacao[] visualizacoes = new Visualizacao[3];

        visualizacoes[0] = new Visualizacao(gafanhotos[0], videos[0]);
        visualizacoes[0].avaliar();

        visualizacoes[1] = new Visualizacao(gafanhotos[0], videos[1]);
        visualizacoes[1].avaliar(10);

        visualizacoes[2] = new Visualizacao(gafanhotos[1], videos[0]);
        visualizacoes[2].avaliar(10);

        imprimirListaComTitulo(videos, "Vídeos");
        imprimirListaComTitulo(gafanhotos, "Gafanhotos");
        imprimirListaComTitulo(visualizacoes, "Visualizações");
    }

    public static void imprimirListaComTitulo (Object[] lista, String titulo) {
        System.out.println("\n" + titulo + "\n--------------------------");

        for (Object item : lista) {
            System.out.println(item.toString());
        }
    }
}
