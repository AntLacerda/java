package aula_97;

public class Main {
    public static void main(String[] args) {
        String[] vect = new String[] {"Joao", "Maria", "Jose"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("----------------");

        for(String names : vect){
            System.out.println(names);
        }
    }
}
