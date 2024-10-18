package MostlyArray;

public class PangramString {

    public static boolean checkIfPangram(String s) {

        for (char c = 'a'; c <= 'z'; c++) {
            if (!s.contains(String.valueOf(c)))
                return false;
        }

        return true;

    }

    public static void main(String[] a) {

        System.out.println(checkIfPangram("The quick brown fox jumps over the lazy dog"));

    }
}
