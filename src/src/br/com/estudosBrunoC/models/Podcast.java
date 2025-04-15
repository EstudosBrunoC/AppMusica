package br.com.estudosBrunoC.models;

public class Podcast extends Audio {
    private int episodio;
    private String descricao;

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 500) {
            return 10;
        } else if (this.getCurtidas() > 250 ) {
            return 8;
        } else {
            return 6;
        }
    }
}
