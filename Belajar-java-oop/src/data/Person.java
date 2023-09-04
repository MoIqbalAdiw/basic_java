package data;

class Person {
    String name; //Field
    String address; //Field
    final String country = "Indonesia"; //Field yg tidak bisa diubah

    // Menambahkan method untuk bisa dipakai/dipanggil jadi object
    void sayHello(String name){
        System.out.println("Hello " + name + " My Name is " + this.name);
    }

    /*
    // Membuat constructor, namanya sama dengan class, dan tidak perlu void2/type
    // Dibuat untuk memaksa/ memberi aturan main agar orang men-state data untuk object terkait
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName){
        name = paramName;
    }

    Person(){
    }

     */

    // Contoh memangil constructor lain dengan this()
    Person(String name, String address) {
        this.name = name; //contoh pemakaian this-keyword untuk menghindari variable shadowing - variabel dg nama yg sama
        this.address = address;
    }
    Person(String name){
        this(name, null);
    }
    Person(){
        this(null);
    }

}
