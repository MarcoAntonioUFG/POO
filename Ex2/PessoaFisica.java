public class PessoaFisica extends Client{
    private String cpf;

    public PessoaFisica(String nome, Integer idade, String email, Pedido pedido, String cpf) {
        super(nome, idade, email, pedido);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}