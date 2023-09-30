public class GetShortestWord
{
    public static String getShortestWord(String word1, String word2) {
        int length = word1.length();
        int length2 = word2.length();

        if (length < length2) {
            return word1;
        } else if (length2 < length) {
            return word2;
        } else {
            return word1;
        }
        }
    public static void main(String[] args) {
        String word1 = "Adrian";
        String word2 = "ojeda";

        String shortest = getShortestWord(word1, word2);

        System.out.println("La palabra o palabras mas pequeñas son: " + shortest);
        //code the method getShortestWord that accepts two words and returns the shortest one
        /* Code a method that returns the shortest word of the two inputs*/
    }
}