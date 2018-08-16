package eight_kyu;

public class AlternatingCase {

    public static String toAlternativeString(String string) {
        final StringBuilder STRING_BUILDER = new StringBuilder();
        for (char c : string.toCharArray()) {
            STRING_BUILDER.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }

        return STRING_BUILDER.toString();
    }

}

