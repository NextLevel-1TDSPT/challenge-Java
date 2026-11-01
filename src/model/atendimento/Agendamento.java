package model.atendimento;

import java.time.LocalDateTime;

public class Agendamento {

    private int idAgendamento;
    private LocalDateTime dataHora;
    private String status;

    public Agendamento(int idAgendamento, LocalDateTime dataHora, String status) {
        this.idAgendamento = idAgendamento;
        this.dataHora = dataHora;
        this.status = status;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
