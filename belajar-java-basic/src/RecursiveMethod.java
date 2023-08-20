public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(1*2*3*4*5);
        System.out.println(factorialRecrusive(5));
    // contoh error stack overflow
        loop(10000);

    }

    // factorial loop (5 dikali angka-angka sebelumnya)
    static int factorialLoop (int value){
        var result =1;
        for (int counter=1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }

    // coba kita pakai Recursive Method untuk rumus factorial di atas
    static int factorialRecrusive (int value){
        if (value ==1){
            return 1;
        } else {
            return value * factorialRecrusive(value-1);
        }
    }

    // pemanggilan recursive yang terlalu dalam bisa menyebabkan stack Over flow error
    static void loop (int value){
        if (value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop" + value);
            loop(value -1);
        }
    }

}
