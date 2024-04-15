import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira nome:");
        String nome = scan.nextLine();
        System.out.println("Insira idade:");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.println("Insira email:");
        String email = scan.next();
        System.out.println("Insira cpf:");
        String cpf = scan.next();
        System.out.println("Insira cnpj:");
        String cnpj = scan.next();

        Client cliente = new Client(nome, idade, email);
        PessoaFisica clienteCpf = new PessoaFisica(nome, idade, email, cpf);
        PessoaJuridica clienteCnpj = new PessoaJuridica(nome, idade, email, cnpj);
        System.out.println(cliente);
        System.out.println(clienteCpf);
        System.out.println(clienteCnpj);
    }
}