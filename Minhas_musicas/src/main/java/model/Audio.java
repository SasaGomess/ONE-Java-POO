package model;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificao;

    public Audio(){

    }

    public Audio( String titulo, int duracao, int totalReproducoes, int curtidas) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalReproducoes = totalReproducoes;
        this.totalCurtidas = curtidas;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }


    public int getClassificao() {
        return classificao;
    }

}
