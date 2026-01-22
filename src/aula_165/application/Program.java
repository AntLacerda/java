package aula_165.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String [] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night" };

        String path = "/home/antonio/Documentos/temp/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { //dessa forma apenas recria o arquivo caso rode o comando 2x. Se quiser adicionar informações no final do arquivo, basta add (path, true)
            for( String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch( IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
