import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    String caminho;

    public LerArquivo(String caminho) {
        this.caminho    = caminho;
    }

    public void Ler(){
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {

                String[] palavras = linha.split("\\s+");

                for (String palavra : palavras) {
                    System.out.print(palavra + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

