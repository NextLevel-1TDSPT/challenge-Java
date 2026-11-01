package model.atendimento;

import java.time.LocalDate;

public class Avaliacao {

    private int idAvaliacao;
    private LocalDate dataAvaliacao;
    private String gravidade;

    public Avaliacao(int idAvaliacao, LocalDate dataAvaliacao, String gravidade) {
        this.idAvaliacao = idAvaliacao;
        this.dataAvaliacao = dataAvaliacao;
        this.gravidade = gravidade;
    }

    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public LocalDate getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(LocalDate dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }
}
