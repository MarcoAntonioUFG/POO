public class PessoaJuridica extends Client {
    private String cnpj;

    public PessoaJuridica(String nome, Integer idade, String email, Pedido pedido, String cnpj) {
        super(nome, idade, email, pedido);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}