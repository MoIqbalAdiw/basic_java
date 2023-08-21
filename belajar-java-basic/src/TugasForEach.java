public class TugasForEach {
    public static void main(String[] args) {
        String[] warna = {
                "hitam", "biru", "putih",
                "merah", "kuning"
        };

//for each
        for (String name : warna) {
            if (name != ("putih")) {
                System.out.println("Warnanya adalah " + name);
            }
        }
    }
}