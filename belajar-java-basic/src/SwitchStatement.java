public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "F";

        switch (nilai){
        case "A":
        System.out.println("Wow, Anda Lulus dengan Baik");
        break; //break ini agar operasi dihentikan disini ketika sudah ada result
        case "B":
        case "C":
        System.out.println("Anda Lulus Cukup Baik");
        break;
        case "D" :
        System.out.println("Anda Tidak Lulus");
        break;
        default:
        System.out.println("Mungkin Anda Salah Jurusan");}

        //Switch Lambda
        switch (nilai){
            case "A" -> System.out.println("Wow wow wow");
            case "B", "C" -> System.out.println("ups ups ups");
            case "D" -> System.out.println("deng dong");
            default -> {
                System.out.println("wakwaw");
            }
        }

        // Switch dengan yield
        String ucapan;
        ucapan = switch (nilai){
            case "A" :
                yield "wow wow wow wow";
            case "B", "C" :
                yield "ups ups ups ups";
            case "D" :
                yield "deng dong deng dong";
            default :
                yield "wakwaw salah jurusan";
        };
        System.out.println(ucapan);
    }
}
