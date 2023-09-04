package application;

import data.City;
import data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); //ERROR karena manggil dari abstract
        // yang bisa panggil dari City untuk diubah object
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
        // Jadi fungsi abstract class ini seperti kontrak untuk semua turunan, pakem yang memegangi semua turunan kelasnya
    }
}
