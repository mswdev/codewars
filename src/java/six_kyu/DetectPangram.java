package java.six_kyu;

public class DetectPangram {

    public boolean check(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.toLowerCase().contains(c + "")) {
                return false;
            }
        }

        return true;
    }

}

