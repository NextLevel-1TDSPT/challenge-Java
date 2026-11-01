package model.pessoas;

public class Doador extends Pessoa{

    private String email;
    private String tipoPessoa;

    public Doador(int idPessoa, String nome, String cpf, Endereco endereco, String email, String tipoPessoa) {
        super(idPessoa, nome, cpf, endereco);
        setEmail(email);
        setTipoPessoa(tipoPessoa);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")){
            this.email = email;
        }
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        if (tipoPessoa != null && !tipoPessoa.isBlank()) {
            this.tipoPessoa = tipoPessoa;
        }
    }

    public boolean validarTipoPessoa() {
        if (tipoPessoa == null || tipoPessoa.isBlank()) {
            System.out.println("Tipo de pessoa vazio (preencha com fisica ou juridica)");
            return false;
        }else if (!tipoPessoa.matches("(?i)fisica|juridica")) {
            System.out.println("Tipo de pessoa deve ser fisica ou juridica");
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
        } if (getEmail() == null){
            System.out.println("Email inválido");
            return false;
        } if (!validarTipoPessoa()) {
            return false;
        }
        System.out.println("Cadastro Realizado");
        return true;

    }

}
