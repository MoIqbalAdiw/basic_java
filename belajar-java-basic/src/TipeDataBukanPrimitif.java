public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

// Konversi dari data primitif (integer) ke data non Primitif (Integer) - masih satu famili/ kompatibel
        int iniInt = 100;
        Integer iniObject = iniInt;
        int iniAgainInt = iniObject; // konversi balik dari non primitif ke primitif yang masih kompatibel

// Konversi dari data non primitif (integer) ke primitif yang bukan kompatibelnya
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat2 = iniObject.floatValue();

        Long amount = 1000000L;
        amount.floatValue();
        System.out.println(iniFloat2);
        System.out.println(amount);


    }
}
