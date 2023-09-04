package data;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Adi");
        employee.sayHello("Eko");

        employee = new Manager("Ari");
        employee.sayHello("Eko");

        employee = new VicePresident("Aji");
        employee.sayHello("Eko");
    //manggil dari methode polymorphism
        sayHello(new Employee("Adi"));
        sayHello(new Manager("Ari"));
        sayHello(new VicePresident("Aji"));
    }
    // contoh memanfaatkan polymorphisme ke dalam methode untuk sayHello ke masing2 parameter turunan parent class employee
    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
