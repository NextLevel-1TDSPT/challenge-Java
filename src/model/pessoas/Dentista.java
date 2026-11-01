package model.pessoas;

public class Dentista extends Pessoa{

    private String cro;
    private String status;

    public Dentista(int idPessoa, String nome, String cpf, Endereco endereco, String cro, String status) {
        super(idPessoa, nome, cpf, endereco);
        setCro(cro);
        this.status = status;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        if (cro != null && !cro.isBlank()) {
            this.cro = cro;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean validarRegistro() {
        if (cro == null) {
            System.out.println("CRO vazio");
            return false;
        } else if (!cro.matches("[A-Za-z]{2} \\d{4,6}")) {
            System.out.println("CRO fora do formato (ex: SP 12345)");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean validarCadastro() {
        if (getNome() == null){
            System.out.println("Nome vazio");
            return false;
        } if (getCpf() == null){
            System.out.println("CPF inválido, digite 11 números");
            return false;
        } if (getEndereco() == null){
            System.out.println("Endereço incompleto");
            return false;
        } if (!validarRegistro()){
            return false;
        }
        System.out.println("Cadastro Realizado");
        return true;
    }

    public void registrarDisponibilidade(String agenda) {

        if (agenda == null || agenda.isBlank()) {
            System.out.println("Agenda inválida");
            return;
        }
        this.status = "Disponível";
        System.out.println("Disponibilidade registrada: " + agenda);
    }

}
