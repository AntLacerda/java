package exercicios_sec12_pt3.quest01.application;

import exercicios_sec12_pt3.quest01.entities.Client;
import exercicios_sec12_pt3.quest01.entities.Order;
import exercicios_sec12_pt3.quest01.entities.OrderItem;
import exercicios_sec12_pt3.quest01.entities.Product;
import exercicios_sec12_pt3.quest01.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        System.out.println("Enter client data: ");
        System.out.printf("Name: ");
        String name = sc.nextLine();
        System.out.printf("Email: ");
        String email = sc.nextLine();
        System.out.printf("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.printf("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.printf("How many items to this order? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.printf("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.printf("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.printf("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
