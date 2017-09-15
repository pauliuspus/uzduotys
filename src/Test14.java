public class Test14 {
    public Test14(){
        test();
        System.out.println("K1");
    }
    public Test14(int sk){
        this();
        System.out.println("K2");
    }
    private void test(){
        new Test14();
    }

    public static void main(String[] args) {
        Test14 t2 = new Test14(0);
        Test14 t1 = new Test14();
    }
}
// o va cia loopas gavosi 