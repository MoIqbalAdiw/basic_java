public class Variabel {
    public static void main(String[] args) {
        String name;
        name = "Mohammad Iqbal Adiwijaya";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Adip Sudipyanto";
        System.out.println(name);

        //var nama;
        //nama = "Moh Iqbal";
        /* error, karena penggunaan var untuk mengotomasi java mengenali type data variabel
        harus ditulis langsung bersama dengan nilai variabel bersangkuta*/
        var nama = "Moh Iqbal";

        var umur = 30;
        var alamat = "Surabaya";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(alamat);

        /* Kata kunci final/ konstan, untuk mengunci data pada variabel sehingga
        data variabel tersebut tidak bisa dirubah */
        final String asmo = "Moh Iqbal";

        //asmo = "Nama Diubah"; //error
        System.out.println(asmo);

    }

}
