public class FuncaoString {
    public static void main(String[] args) {
        String frase = "ABCD abcde aeiou AEIOU";

        String minusculo = frase.toLowerCase();
        String maiusculo = frase.toUpperCase();

        System.out.println("Frase Original: " + frase);
        System.out.println("Minusculo: " + minusculo);
        System.out.println("Maiusculo: " + maiusculo);

    }
}
