package aula_99.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Antonio");
        list.add("Lacerda");
        list.add("Rolim");
        list.add("Neto");

        list.add(2, "-");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        list.remove("Neto");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("Index of Antonio: " + list.indexOf("Antonio"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    }
}
