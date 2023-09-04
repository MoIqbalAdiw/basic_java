package data;

public class ManagerApp {
    public static void main(String[] args) {
/*        // contoh pemakaian inheritance Mnager-VicePresident
        var manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "Joko";
        vp.sayHello("Budi");
 */
        //karena sudah ada update bahwa di parent class (Manager) ada constructor, maka pembuatan object menjadi seperti berikut
        var manager = new Manager("Eko");
        manager.sayHello("Budi");

        var vp = new VicePresident("Joko");
        vp.sayHello("Budi");
    }
}
