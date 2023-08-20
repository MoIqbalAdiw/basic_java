/* do while loop, pengecekan kondisi dilakukan setelah pengulangan dilakukan,
sehingga pasti minimal 1 perulangan dilakukan, walaupun kondisi tidak bernilai true
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 100;
        do {
            System.out.println("Perulangan" + counter);
            counter++;
        } while (counter <= 10);
    }
}
