package exercicios_sec13_pt1.quest02.application;

import exercicios_sec13_pt1.quest02.entities.ImportedProduct;
import exercicios_sec13_pt1.quest02.entities.Product;
import exercicios_sec13_pt1.quest02.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the number of products: ");
        int N = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Product #" + (i+1) + " data: ");
            System.out.printf("Common, used or imported (c/u/i)? ");
            sc.nextLine();
            String resp = sc.nextLine();

            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Price: ");
            double price = sc.nextDouble();

            if (resp.equals("c")) {
                products.add(new Product(name, price));
            } else if(resp.equals("u")) {
                System.out.printf("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                String manufactureDate = sc.nextLine();

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date date = sdf.parse(manufactureDate);

                products.add(new UsedProduct(name, price, date));
            } else if(resp.equals("i")){
                System.out.printf("Customs fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product i : products) {
            System.out.println(i.priceTag());
        }

        sc.close();
    }
}
