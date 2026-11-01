package model.doacoes;

import model.pessoas.Doador;

public class Doacao {

    private int idDoacao;
    private float valor;
    private String formaPagamento;
    private String status;

    public Doacao(int idDoacao, float valor, String formaPagamento, String status) {
        this.idDoacao = idDoacao;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.status = status;
    }

    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean processarPagamento(){
        if (valor <= 0){
            System.out.println("Pagamento deve ser maior que 0");
            return false;
        }else if (formaPagamento == null || !formaPagamento.matches("(?i)pix|credito|debito|boleto")) {
            System.out.println("Tipo de pagamento inválido, digite a forma de pagamento correta (PIX, Credito, Debito ou Boleto)");
            return false;
        }else {
            System.out.println("Pagamento realizado");
            this.status = "Pago";
            return true;
        }
    }

    public void emitirComprovante(Doador doador){
        if (this.status.matches("(?i)pago")) {
            System.out.println("---COMPROVANTE---");
            System.out.println("Nome: " + doador.getNome() +
                    "\nEmail: " + doador.getEmail() +
                    "\nPessoa: " + doador.getTipoPessoa()+
                    "\nValor: R$" + getValor() +
                    "\nForma de pagamento: " + getFormaPagamento() +
                    "\nStatus: " + getStatus());
        } else if (this.status.matches("(?i)pendente")) {
            System.out.println("Pagamento pendente");
        } else {
            System.out.println("Pagamento invalido");
        }

    }

}
