public class Client {
    private String nome;
    public String email;
    public int idade;

    
    public Client(String nome, Integer idade, String email) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}