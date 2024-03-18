package Alura.ScreenMatch.modelo;

public class Titulo {
    private String nome;
    private int anoDelancamento;
    private double somaAvaliacao;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;
    //encapsulamento: protecao dos atributos

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAno(int anoDelancamento){
        this.anoDelancamento=anoDelancamento;
    }
    public void setSoma(double somaAvaliacao) {
        this.somaAvaliacao=somaAvaliacao;
    }
    public void setTotal(int totalAvaliacoes){
        this.totalAvaliacoes=totalAvaliacoes;
    }
    public void setDuracao(int duracaoEmMinutos){
        this.duracaoEmMinutos=duracaoEmMinutos;
    }

    public String getNome(){
        return nome;
    }
    public int getAno(){
        return anoDelancamento;
    }
    public double getSoma(){
        return somaAvaliacao;
    }
    public int getTotal(){
        return totalAvaliacoes;
    }
    public int getDuracao(){
        return duracaoEmMinutos;
    }

    public void exibirFicha() {
        System.out.println("nome do filme: "+nome);
        System.out.println("ano de lancamento: "+anoDelancamento);
    }

    public void avalia(double nota){
        somaAvaliacao = somaAvaliacao + nota;
        totalAvaliacoes++;
    }

    public double retornaMedia() {
         return somaAvaliacao/totalAvaliacoes;
    }
}
