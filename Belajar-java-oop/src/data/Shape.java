package data;

public class Shape {
    int getCorner() {
        return 0;
    }
}
    class Rectangle extends Shape {
        int getCorner(){
            return 4;
        }
        // contoh pemakaian super keyword untuk menarik method lagi di parents yagn terlanjur tershadow dengan overriding di child classnya
        int getParentCorner(){
            return super.getCorner(); // pakai super lalu titik lalu sebut field atau keyword di parent class yg mau ditarik
        }
    }
