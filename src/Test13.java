public class Test13 {
    public Test13(){
        System.out.println("K1");
    }
    public Test13(int sk){
        this();
        System.out.println("K2");
    }

    public static void main(String[] args) {
        Test13 t2 = new Test13(0);
        Test13 t1 = new Test13();
    }
}
