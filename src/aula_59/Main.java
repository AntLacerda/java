package aula_59;

public class Main {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";

        String minusculas = original.toLowerCase();
        String maiuscuas = original.toUpperCase();
        String semEspacos = original.trim();
        String selecionarInicioCarcter = original.substring(2);
        String selecionarInicioEFimCaracter = original.substring(2, 7);
        String substitui = original.replace("a", "x");
        int posicao = original.indexOf("bc");
        int ultimaPosicao = original.lastIndexOf("bc");
        String s = "potato apple lemon";
        String[] vet = s.split(" ");

        System.out.println(minusculas);
        System.out.println(maiuscuas);
        System.out.println(semEspacos);
        System.out.println(selecionarInicioCarcter);
        System.out.println(selecionarInicioEFimCaracter);
        System.out.println(substitui);
        System.out.println(posicao);
        System.out.println(ultimaPosicao);
        System.out.println(vet[0]);
        System.out.println(vet[1]);
        System.out.println(vet[2]);



    }
}
