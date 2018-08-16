package seven_kyu;

public class JadenCasingStrings {

    public String toJadenCase(String phrase) {
        final String[] WORDS = phrase.split(" ");
        final StringBuilder STRING_BUILDER = new StringBuilder();
        for (String word : WORDS) {
            final char FIRST_LETTER = Character.toUpperCase(word.charAt(0));
            final String END_WORD = word.substring(1, word.length());
            STRING_BUILDER.append(FIRST_LETTER).append(END_WORD);
        }

        return STRING_BUILDER.toString().trim();
    }

}

