package java.six_kyu;

public class HighestScoringWord {

    public static String high(String s) {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        String highest_score_word = "";
        int word_score = 0;

        final String[] WORDS = s.split(" ");
        for (String word : WORDS) {

            int word_points = 0;
            for (char c : word.toCharArray()) {
                word_points += ALPHABET.indexOf(c);
            }

            if (word_points > word_score) {
                word_score = word_points;
                highest_score_word = word;
            }
        }

        return highest_score_word;
    }

}

