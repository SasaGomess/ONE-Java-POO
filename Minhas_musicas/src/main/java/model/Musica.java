package model;

public class Musica extends Audio{
    private String artista;
    private String album;
    private String genero;

    public Musica(String titulo, int duracao, int totalReproducoes, int curtidas, String artista, String album, String genero) {
        super(titulo, duracao, totalReproducoes, curtidas);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }
    public Musica(){

    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificao() {
        if (this.getTotalReproducoes() > 500){
            return 10;
        }else {
            return 5;
        }
    }
}
