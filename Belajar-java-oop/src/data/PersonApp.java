package data;

// Program Main
public class PersonApp {
    public static void main(String[] args) {

        // cara bikin Object, tinggal ketikkan new sebagai berikut:
        var person1 = new Person("Eko","Subang");
    //  person1.name = "Eko";
    //  person1.address = "Subang";
    //  person1.country = "Amerika"; //ERROR

        System.out.println(person1);
//        System.out.println(person1.name);
//        System.out.println(person1.address);
//        System.out.println(person1.country);

        // Kumpulan data bisa dijadikan Array, namun dengan object akan jauh lebih mudah untuk manage nya
        Person person2 = new Person();
        Person person3;
        person3 = new Person();

        System.out.println(person3);

        // Lanjutan panggil method
        person1.sayHello("Budi");
        // Jika name belum didefine maka hasil print masih null
        person3.sayHello("Jayjay");
        // Karena pada parameter person3, field name nya belum ditentukan valuenya
        person3.name = "Iqbal";
        person3.sayHello("Jajan");

        // Atau panggil coonstructor yang sesuai (yang ada paramName nya)
        var person4 = new Person("Iqbal");
        person4.sayHello("Jamban");


    }
}
