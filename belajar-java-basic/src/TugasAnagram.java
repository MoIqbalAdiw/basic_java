import java.util.Arrays;
public class TugasAnagram {
    static boolean anagram(String a, String b) {
        String cek1 = a.toLowerCase(); String cek2 = b.toLowerCase();

        char x[] = cek1.toCharArray();char y[] = cek2.toCharArray();

        Arrays.sort(x); Arrays.sort(y);
        boolean result = Arrays.equals(x,y);
        return result;
    }
    public static void main (String[] args) {
        String stringA = "CAT"; String stringB = "tac";
        boolean hasil = anagram(stringA,stringB);
        System.out.println("Apakah " + stringA + " anagram terhadap "+stringB+ " ? ");
        System.out.println("Hasil = " + hasil);

        String stringC = "aTC"; String stringD = "tfC";
        boolean hasil1 = anagram(stringC,stringD);
        System.out.println("Apakah " + stringC + " anagram terhadap "+stringD+ " ? ");
        System.out.println("Hasil = " + hasil1);
    }
}
