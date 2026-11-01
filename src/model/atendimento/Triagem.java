package model.atendimento;

import java.time.LocalDate;

public class Triagem {

    private int idTriagem;
    private LocalDate dataTriagem;
    private String resultado;
    private String observacoes;

    public Triagem(int idTriagem, LocalDate dataTriagem, String resultado, String observacoes) {
        this.idTriagem = idTriagem;
        this.dataTriagem = dataTriagem;
        this.resultado = resultado;
        this.observacoes = observacoes;
    }

    public int getIdTriagem() {
        return idTriagem;
    }

    public void setIdTriagem(int idTriagem) {
        this.idTriagem = idTriagem;
    }

    public LocalDate getDataTriagem() {
        return dataTriagem;
    }

    public void setDataTriagem(LocalDate dataTriagem) {
        this.dataTriagem = dataTriagem;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }


}
