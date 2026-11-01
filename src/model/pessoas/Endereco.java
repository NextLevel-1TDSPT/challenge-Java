package model.pessoas;

public class Endereco {

    private String rua;
    private String numero;
    private String cidade;
    private String cep;

    public Endereco(String rua, String numero, String cidade, String cep) {
        setRua(rua);
        setNumero(numero);
        setCidade(cidade);
        setCep(cep);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if (rua != null && !rua.isBlank()){
            this.rua = rua;
        }else {
            System.out.println("Rua inválida");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero != null && !numero.isBlank()){
            this.numero = numero;
        }else {
            System.out.println("Número da casa inválido");
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade != null && !cidade.isBlank()){
            this.cidade = cidade;
        }else {
            System.out.println("Cidade inválida");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep != null && cep.matches("\\d{8}")){
            this.cep = cep;
        }else {
            System.out.println("CEP inválido");
        }
    }

    public String obterEnderecoCompleto(){
        return "Rua: " + this.rua + " | n° " + this.numero + " | Cidade: " + this.cidade + " | CEP: " + this.cep;
    }

}
