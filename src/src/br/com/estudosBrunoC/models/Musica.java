package br.com.estudosBrunoC.models;

public class Musica extends Audio {
    private String genero;
    private String album;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

}
