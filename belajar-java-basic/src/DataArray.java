import java.io.PrintStream;

public class DataArray {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];
/* atau disusun seperti ini juga bisa
    String[] stringArray2 = new String[3];
*/

        stringArray[0] = "Mohammad";
        stringArray[1] = "Iqbal";
        stringArray[2] = "Adiwijaya";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Adip";
        System.out.println(stringArray[0]);

// Array Initializer
        int[] arrayInt = new int[]{
                10, 90, 80, 67, 29
        };

        //atau seperti ini
        long[] arrayLong = {
                10, 90, 80, 67, 29
        };

        //atau seperti ini
        String[] namaNama = {
                "Mohammad", "iqbal", "Adiwijaya"
        };

/* Operasi di Array:
Mengambil data di Array --> array[index]
Mengubah data di Array --> array[index] = value
    untuk menghapus, di Java tidak ada istilah penghapusan data array,
    jadi yang awal panjangnya 10 ya tetap 10, panjangnya fix,
    tinggal value diberi null/ atau sesuai type data
Mengambil panjang Array --> array.length
 */

        arrayLong[0] = 100;
        arrayLong[3] = 0;
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong[3]);
        System.out.println(arrayLong.length);

    //Array dalam Array
        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };

        //untuk memanggil kurniawan maka:
        System.out.println(members[0][1]);



    }
}
