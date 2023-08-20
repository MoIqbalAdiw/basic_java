import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;
public class TugasJava3 {
    public static void main(String[] args) {
    // permintaan input bilangan pertama
            Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Masukkan bilangan bulat pertama : ");
            int bil1 = myObj1.nextInt();  // Read user input

    // permintaan input bilangan kedua
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat kedua: ");
        int bil2 = myObj2.nextInt();

    // proses perbandingan
        System.out.println(bil1 + " == " + bil2 + " : " + (bil1==bil2));
        System.out.println(bil1 + " != " + bil2 + " : " + (bil1!=bil2));
        System.out.println(bil1 + " > " + bil2 + " : " + (bil1>bil2));
        System.out.println(bil1 + " >= " + bil2 + " : " + (bil1>=bil2));
        System.out.println(bil1 + " < " + bil2 + " : " + (bil1<bil2));
        System.out.println(bil1 + " <= " + bil2 + " : " + (bil1<=bil2));
    }
}
