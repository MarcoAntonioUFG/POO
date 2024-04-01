public class PessoaFisica extends Client{
    private String cpf;

    public PessoaFisica(String nome, int idade, String email, String cpf) {
        super(nome, idade, email);
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nome:" + super.getNome() + "Idade:" + idade + "Email:" + email + "CPF:" + cpf + "CNPJ:" + + "}";
    }
} 
