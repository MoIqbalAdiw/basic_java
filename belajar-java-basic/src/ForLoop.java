public class ForLoop {
    public static void main(String[] args) {

    // format for loop =
    /* for (init statement; kondisi; post statement) {
       // blok perulangan
       }
     */

    // dengan init state, kondisi, dan post state yang kosong, maka maknanya kondisi selalu bernilai true
    // yang menyebabkan perulangan dilakukan terus menerus, contoh sebagai berikut:
//        for (;;){
//            System.out.println("Perulangan");
//        }

    // contoh perulangan dengan kondisi:
        var counter = 1;
        for ( ; counter <=10; ) {
            System.out.println("Perulangan ke-" +counter);
            counter++;
        }

    // contoh perulangan dengan init statement, kondisi, dan post:
    for (var hitung = 1; hitung <= 10; hitung++) {
        System.out.println("Ngulang ke-" + hitung);
    }
    }
}
