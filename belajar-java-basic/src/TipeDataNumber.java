public class TipeDataNumber {
    public static void main(String[] args) {
//        byte iniByte = 100;
//        short iniShort = 1000;
//        int iniInt = 10000000;
//        long iniLong = 1000000000;
//        long iniLong2 = 1000000000L;
//
//        float iniFloat = 10.12F;
//        double iniDouble = 12.2424;
//
//        int decimalint = 34;
//        int hexaDecimal = 0xFFFFF;
//        int binaryDecimal = 0b10101010;
//
//        long balance = 1_000_000_000_000L;
//        int sum = 60_000_000;

        // Konversi number data type otomatis - widening casting : byte > short > int > long > float > double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // Konversi number data type manual - narrowing casting : double > float > long > int > char > short > byte
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;



    }
}
