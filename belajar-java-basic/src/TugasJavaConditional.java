public class TugasJavaConditional {
    public static void main(String[] args) {
        for (var counter = -2; counter <= 20; counter++) {
            if (counter >0 && counter <=10 && counter % 2 == 0) {
                System.out.println(counter + " Genap");
            } else if (counter >0 && counter <=10 && counter %2 != 0) {
                System.out.println(counter + " Ganjil");
            } else {
                    System.out.println("Angka di luar jangkauan");
                }
            ;
        }
    }
}
