public class Main {
    public static void main(String args[]) {
        Client cliente = new Client("Marco", 0, "marcao@exemplo.com");
        //PessoaFisica clienteCpf = new PessoaFisica("Marco", 0, "marcao@exemplo.com", "9999999-999");
        //PessoaJuridica clienteCnpj = new PessoaJuridica("Marco", 0, "marcao@exemplo.com", "999-9");
        System.out.println(cliente);
    }
}
