package Calculadora;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {

        public static void imprimirDadosArquivo(String nome) throws LeitorException {
        System.out.printf("\nConteúdo do arquivo texto:\n\n");
//colocar try Catch aqui
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            throw new LeitorException("Erro na leitura do arquivo!", e);
        }

//fim do try cath
        System.out.println("Sucesso!");
    }
}
