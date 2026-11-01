package model.pessoas;

import java.time.LocalDate;
import java.time.Period;

public class Jovem extends Pessoa {

    private LocalDate dataNascimento;
    private String statusTriagem;

    public Jovem(int idPessoa, String nome, String cpf, Endereco endereco, LocalDate dataNascimento, String statusTriagem) {
        super(idPessoa, nome, cpf, endereco);
        setDataNascimento(dataNascimento);
        this.statusTriagem = statusTriagem;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento != null && dataNascimento.isBefore(LocalDate.now())){
            this.dataNascimento = dataNascimento;
        }

    }

    public String getStatusTriagem() {
        return statusTriagem;
    }

    public void setStatusTriagem(String statusTriagem) {
        this.statusTriagem = statusTriagem;
    }

    public int calcularIdade(){
        if (dataNascimento == null){
            return 0;
        }
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public boolean verificarElegibilidade() {
        if (dataNascimento == null) {
            System.out.println("Data inválida");
            return false;
        }else if (calcularIdade() >= 18) {
            System.out.println("Jovem deve ser menor de 18 anos");
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
        } if (!verificarElegibilidade()) {
            return false;
        }
        System.out.println("Cadastro Realizado");
        return true;

    }
}
