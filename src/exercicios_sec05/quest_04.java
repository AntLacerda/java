package exercicios_sec05;

import java.util.Scanner;

public class quest_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start;
        int end;
        int gameTime;


        System.out.println("Enter the start and the end of the game: ");

        start = sc.nextInt();
        end = sc.nextInt();

        if(start < end) {
            gameTime = end - start;
        } else {
            gameTime = (24 - start) + end;
        }

        System.out.printf("The game had %d hour(s)!", gameTime);

        sc.close();
    }
}
