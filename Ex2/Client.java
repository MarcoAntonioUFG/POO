public class Client {
    private String nome;
    public String email;
    public int idade;
    public Pedido pedido;
    
    protected Client(String nome, Integer idade, String email, Pedido pedido) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}