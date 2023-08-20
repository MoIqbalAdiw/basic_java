public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if (nilai >= 75) {
            ucapan = "selamat Anda Lulus";
        } else {
            ucapan = "Silahkan Coba Lagi";
        }
        System.out.println(ucapan);

        // Ternary Operator (menyingkat fungsi else)
        String ungkapan = nilai >= 75 ? "Selamat Elu Lulus" : "Silahkan Coba Maning";

        System.out.println(ungkapan);
    }
}
