package Alura.ScreenMatch;

import Alura.ScreenMatch.calculo.CalculadoraDeTempo;
import Alura.ScreenMatch.calculo.FiltroRecomendacao;
import Alura.ScreenMatch.modelo.Episodio;
import Alura.ScreenMatch.modelo.Filme;
import Alura.ScreenMatch.modelo.Serie;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O Poderoso Chefao");
        filme1.setAno(1978);
        filme1.setDuracao(180);
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("O filme "+filme1.getNome()+" tem duracao de "+filme1.getDuracao()+" minutos");

        filme1.exibirFicha();
        filme1.retornaMedia();

        System.out.println("=========================================================================================================================================================================================");
        
        Serie serie1 = new Serie();
        serie1.setNome("lost");
        serie1.setAno(2000);
        serie1.setTemporadas(10);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorTemporada(50);

        serie1.exibirFicha();
        System.out.println("A serie " +serie1.getNome()+" tem duracao de "+serie1.getDuracao()+" minutos");


        Filme filme2 = new Filme();
        filme2.setNome("O resgate do soldado ryan");
        filme2.setAno(1998);
        filme2.setDuracao(200);
        filme2.avalia(8);
        filme2.avalia(10);
        filme2.avalia(10);

        CalculadoraDeTempo calculadora1 = new CalculadoraDeTempo();
        calculadora1.inclui(filme1);
        calculadora1.inclui(filme2);
        calculadora1.inclui(serie1);
        System.out.println(calculadora1.getTempoTotal());

        System.out.println("==========================================================================================================================================================================================");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);
        System.out.println("==========================================================================================================================================================================================");

        Episodio episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setSerie(serie1);
        episodio1.setTotalVizualizacoes(300);
        filtro.filtra(episodio1);
        System.out.println("=====================================================================================================================================================================================");

        var filme3 = new Filme();
        filme3.setNome("Dogville");
        filme3.setDuracao(200);
        filme3.setAno(2003);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("primeiro filme: "+ listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        

























        //filme1.somaAvaliacao = 10;
        //filme1.nome = "O poderoso chefao";
        //filme1.anoDelancamento = 1978;
        //filme1.duracaoEmMinutos = 180;


    }
}