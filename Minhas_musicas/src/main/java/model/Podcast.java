package model;

public class Podcast extends Audio{
    private int episodios;
    private String descricao;
    private String host;
    private String apresentador;

    public Podcast(String titulo, int duracao, int totalReproducoes, int curtidas, int episodios, String escricao, String host, String apresentador) {
        super(titulo, duracao, totalReproducoes, curtidas);
        this.episodios = episodios;
        this.descricao = escricao;
        this.host = host;
        this.apresentador = apresentador;
    }

    public Podcast(){

    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getClassificao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        }else {
            return 5;
        }
    }
}
