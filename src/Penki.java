public class Penki {
    public static void main(String[] args) {
        int[][] masyvas5 = { { 4, 5, 6} };
        int[][] masyvas6 = { { 4, 5, 6} };
        if (masyvas5 == masyvas6) {
            System.out.println("Lygus");
        } else {
            System.out.println("Nelygus");
        }
    }
}
//  Nelygus - cia palygino masyvu adresus, o ne pacius masyvus.