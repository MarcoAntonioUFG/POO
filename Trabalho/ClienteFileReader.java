import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClienteFileReader {
    public static List<Cliente> lerArquivo(String caminhoArquivo) {
        List<Cliente> clientes = new ArrayList<Cliente>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int idCliente = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String email = dados[2];
                String endereco = dados[3];
                int telefone = Integer.parseInt(dados[4]);
                String userName = dados[5];
                int senha = Integer.parseInt(dados[6]);
                Cliente cliente = new Cliente(idCliente, nome, email, endereco, telefone, userName, senha);
                clientes.add(cliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return clientes;
    }
}
