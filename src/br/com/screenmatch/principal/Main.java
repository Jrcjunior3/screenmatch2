package br.com.alura.screenmatch.calculos.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[]arg) {
        Filme meuFilme = new Filme("Poderoso Chefão", 1970);
        //meuFilme.setNome("Poderoso Chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinuto(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinuto());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie("Dexter", 2006);
        //minhaSerie.setNome("Dexter");
        //minhaSerie.setAnoDeLancamento(2006);
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpisodiosPorTemporada(12);
        minhaSerie.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratonar à série: " + minhaSerie.getDuracaoEmMinuto() + " minutos");

        Filme outroFilme = new Filme("O iluminado", 1980);
        //outroFilme.setNome("O iluminado");
        //outroFilme.setAnoDeLancamento(1980);
        outroFilme.setDuracaoEmMinuto(144);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualiacoes(300);

        filtro.filtra(episodio);

        var filmeJose = new Filme("Show de Truman", 1988);
        //filmeJose.setNome("Show de Truman");
        filmeJose.setDuracaoEmMinuto(103);
        //filmeJose.setAnoDeLancamento(1988);
        filmeJose.avalia(10);

        ArrayList <Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeJose);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilme.size());
        System.out.println("Primeiro filme: " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString do filme " + listaDeFilme.get(0).toString());
    }
}