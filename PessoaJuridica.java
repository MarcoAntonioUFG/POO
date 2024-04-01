public class PessoaJuridica extends Client {
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String email, String cnpj) {
        super(nome, idade, email);
        this.cnpj = cnpj;
    }


    public void setCpf(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

}
