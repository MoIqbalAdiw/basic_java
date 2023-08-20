public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 50, 60, 70, 55};
        sayCongrats("Budi", values);

        // dengan memakai variabel arguman (int ...), sehingga tidak perlu membuat array seperti pada baris 3,
        // list nilai bisa langsung di ketik di statement pemanggilan method
        sayCongrats("Fikri", 80,70,80,95,85);

    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " +name + " Anda Lulus");
        } else {
            System.out.println("Maaf " +name + " Anda Tidak Lulus");
        }
    }
}
