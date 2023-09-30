import java.util.List;

public class LettersList {
    public static String[] getLettersList(String word) {
        String[] letters = new String[word.length()];
        for(int i=0;i<word.length();i++) {
            letters[i] = word.substring(i, i+1);
        } return letters;
    }
}

    //code the getLetterList method that accepts a word as argument and returns a list of its letter