package data;

/*
// Ini parent class dari class VicePresident, berisi field dan method
class Manager {
    String name;
    String company;

    // simulasi pembuatan constructor berparameter di parents class (wajib dipanggil di setiap child class)
    Manager(String name){
        this.name= name;
    }
    // simulasi ada dua constructer di parent class
    Manager(String name, String company){
        this.name= name;
        this.company= company;
    }

    void sayHello (String name) {
//        System.out.println("Hello "+ name + "My Name Is " + this.name);
        System.out.println("Hello "+ name + " My Name Is Manager " + this.name); //contoh overriding method

    }
}
*/

// Coba praktek Polymorphisme, class manager dijadikan extend to employee class
class Manager extends Employee {
    String company;

    // simulasi pembuatan constructor berparameter di parents class (wajib dipanggil di setiap child class)
        Manager(String name){
        super(name);
    }
    // simulasi ada dua constructer di parent class
    Manager(String name, String company){
        super(name);
        this.company= company;
    }

    void sayHello (String name) {
//        System.out.println("Hello "+ name + "My Name Is " + this.name);
        System.out.println("Hello "+ name + " My Name Is Manager " + this.name); //contoh overriding method

    }
}