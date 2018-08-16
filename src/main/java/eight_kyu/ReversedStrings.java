package eight_kyu;

public class ReversedStrings {

    public static String solution(String str) {
        final StringBuilder STRING_BUILDER = new StringBuilder();
        for (int i = str.length(); i > 0; i--) {
            STRING_BUILDER.append(str.charAt(i - 1));
        }

        return STRING_BUILDER.toString();
    }

}

