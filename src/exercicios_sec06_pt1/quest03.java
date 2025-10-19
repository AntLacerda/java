package exercicios_sec06_pt1;

import java.util.Scanner;

public class quest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fuelType = 0;
        int alcoholAmount = 0;
        int gasolineAmount = 0;
        int dieselAmount = 0;

        while(fuelType != 4) {
            System.out.println("Select the fuel type: ");
            System.out.println("1. Alcohol");
            System.out.println("2. Gasoline");
            System.out.println("3. Diesel");
            System.out.println("4. Exit");

            fuelType = sc.nextInt();

            switch(fuelType){
                case 1:
                    alcoholAmount++;
                    break;
                case 2:
                    gasolineAmount++;
                    break;
                case 3:
                    dieselAmount++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter a correct value!");
            }
        }

        System.out.println("THANKS!");
        System.out.printf("Alcohol: %d%n", alcoholAmount);
        System.out.printf("Gasoline: %d%n", gasolineAmount);
        System.out.printf("Diesel: %d%n", dieselAmount);

        sc.close();
    }
}
