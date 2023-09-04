package data;

// ini child class dari class Manager
class VicePresident extends Manager {
    void sayHello(String name){
        //contoh overriding method "sayHello" dari parent class Manager
        System.out.println("Hello "+ name + " My Name Is Vice President " + this.name);
    }
    //dengan super constructor, maka wajib panggil cunstrocter di parent class yang berparameter, agar vice president class tidak error
    VicePresident(String name){
        super(name);
    }
    //karena di parent constructor ada dua macam, maka minimal dipanggil satu saja boleh, bebas pilih yg mana
//    VicePresident(String name){
//        super(name,null);
//    }

}
