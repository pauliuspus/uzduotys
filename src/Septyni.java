public class Septyni {
    public static void main(String[] args) {
        int skaicius = 5;
        System.out.println(--skaicius);
        System.out.println(skaicius--);
        System.out.println(skaicius++);
        System.out.println(++skaicius);
    }
}
//Increment and decrement operators can be placed before (prefix) or after (postfix) the variable
// they apply to. If you place an increment or decrement operator before its variable, the operator
// is applied before the rest of the expression is evaluated. If you place the operator
// after the variable, the operator is applied after the expression is evaluated.