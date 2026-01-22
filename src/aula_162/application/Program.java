package aula_162.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("/home/antonio/Documentos/temp/in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);

            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch(IOException e) {  //necessário para tratamento de erros
            System.out.println("Error: " + e.getMessage());
        } finally {  //necessário para garantir que o código não quebre
            if(sc != null) {
                sc.close();
            }
        }

    }
}
