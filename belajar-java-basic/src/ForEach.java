public class ForEach {
    public static void main(String[] args) {
        String [] names = {
                "Moh", "Iqbal", "Adi",
                "Wijaya", "QA", "Engineer"
        };
// cara lama untuk memanggil array dg pengulangan:
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
//sekarang sudah ada for each, cara pakainya sebagai berikut:
        System.out.println("FOR EACH");
        for(String name : names){
            System.out.println(name);
        }

    }
}
