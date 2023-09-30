public class WordCutter {
    public static String cutInHalf(String palabra) {
        int longitud = palabra.length();
        int mitad = longitud / 2;

        String primeraMitad = palabra.substring(0, mitad);

        return primeraMitad;
    }

    public static void main(String[] args) {
        String palabra = "AdrianOjeda";
        String mitad2 = cutInHalf(palabra);
        System.out.println(mitad2);
        //code the method cutInHalf that returns the first half of the String passed as argument
        /* Code the cutInHalf method that returns the first half of the word input. */
    }
}