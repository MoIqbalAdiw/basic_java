public class OperasiBoolean {
    public static void main(String[] args) {
        // && = dan ; || = atau ; ! = kebalikan

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

        var keringanan = lulusAbsen || lulusNilaiAkhir;
        System.out.println(keringanan);

/* If Statement & Else Statement = sekalian dicampur di bab boolean ini gpp ya
 */
        if (nilaiAkhir >= 75 && absen >= 75){
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        }
        // Else if statement
        if (nilaiAkhir >=80 && absen >= 80){
            System.out.println("Nilai Anda A");
        }else if (nilaiAkhir >=70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        }else if (nilaiAkhir >=60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        }else {
            System.out.println("Remidi");
        }

    }

}
