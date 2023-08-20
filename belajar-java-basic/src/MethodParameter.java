public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Budi", "Kurniawan");
        sayHello("Azis", "Gagap");
        sayHello("Ini", "Budi");

    }
    static void sayHello (String firstName, String lastName){
        System.out.println("Hello" + " " + firstName + " " + lastName);
    }
}
