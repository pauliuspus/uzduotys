public class desimt {
    public static void main(String[] args) {
        String txt5 = "antras";
        System.out.println("1:" +  "  test");
        System.out.println("2:" +  "  test".trim());
        System.out.println("3:" + "  test".trim().length());
        System.out.println("4:" + txt5.indexOf('a'));
        System.out.println("5:" + txt5.charAt(0));
        System.out.println("6:" + txt5.concat("123"));
        System.out.println("7:" + txt5.equals("antras"));
        System.out.println("8:" + txt5.equals(txt5));
        System.out.println("8:" + txt5.lastIndexOf('a'));
    }
}
/*
public class ConcatenationExample {
public static void main(String args[]) {
    //One way of doing concatenation
    String str1 = "Welcome";
    str1 = str1.concat(" to ");
    str1 = str1.concat(" String handling ");
    System.out.println(str1);

    //Other way of doing concatenation in one line
    String str2 = "This";
    str2 = str2.concat(" is").concat(" just a").concat(" String");
    System.out.println(str2);
}
}
Output:

        Welcome to  String handling
        This is just a String*/
