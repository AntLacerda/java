package exercicios_sec15.application;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            String line = br.readLine();
            String productName = "";
            double value = 0.0;
            int amount = 0;
            String outPath = new File(strPath).getParent();

            while(line != null) {
                String[] parts = line.split(", ");
                productName = parts[0];
                value = Double.parseDouble(parts[1]);
                amount = Integer.parseInt(parts[2]);

                String writeLine = new String(productName + ", " + (value * amount));

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath + "\\out.txt", true))) {

                    bw.write(writeLine);
                    bw.newLine();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
