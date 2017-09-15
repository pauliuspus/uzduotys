public class sesi {
    public static void main(String[] args) {
        int[][] masyvas7 = { {4, 5, 6}};
        int[][] masyvas8 = masyvas7;
        if (masyvas7.equals(masyvas8)) {
            System.out.println("Lygus");
        } else {
            System.out.println("Nelygus");
        }
    }
}
//lygus - palygino pacius masyvus.