public class MethodOverloading {
    public static void main(String[] args) {
    sayHello();
    sayHello("Budi");
    sayHello("Budi", "Anduk");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    // secara umum nama method tidak boleh sama, tetapi:
    // method bisa bernama sama, asalkan parameternya berbeda
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName+ " "+ lastName);
    }
}
