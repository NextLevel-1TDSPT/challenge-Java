package model.pessoas;

public abstract class Pessoa {

    private int idPessoa;
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(int idPessoa, String nome, String cpf, Endereco endereco) {
        this.idPessoa = idPessoa;
        setNome(nome);
        setCpf(cpf);
        setEndereco(endereco);
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()){
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{11}")){
            this.cpf = cpf;
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        if (endereco != null
                && endereco.getRua() != null
                && endereco.getNumero() != null
                && endereco.getCidade() != null
                && endereco.getCep() != null){
            this.endereco = endereco;
        }

    }

    public abstract boolean validarCadastro();

}
