package model.atendimento;

import java.time.LocalDate;

public class Procedimento {

    private int idProcedimento;
    private LocalDate dataProcedimento;
    private String tipoProcedimento;
    private String observacoes;

    public Procedimento(int idProcedimento, LocalDate dataProcedimento, String tipoProcedimento, String observacoes) {
        this.idProcedimento = idProcedimento;
        this.dataProcedimento = dataProcedimento;
        this.tipoProcedimento = tipoProcedimento;
        this.observacoes = observacoes;
    }

    public int getIdProcedimento() {
        return idProcedimento;
    }

    public void setIdProcedimento(int idProcedimento) {
        this.idProcedimento = idProcedimento;
    }

    public LocalDate getDataProcedimento() {
        return dataProcedimento;
    }

    public void setDataProcedimento(LocalDate dataProcedimento) {
        this.dataProcedimento = dataProcedimento;
    }

    public String getTipoProcedimento() {
        return tipoProcedimento;
    }

    public void setTipoProcedimento(String tipoProcedimento) {
        this.tipoProcedimento = tipoProcedimento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
