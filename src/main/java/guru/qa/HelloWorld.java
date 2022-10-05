package guru.qa;
public class HelloWorld {
    public static void main(String[] args) {
        int a=25;
        int b=10;
        int c=30;
        double double1=15.5;
        byte byte1=100;
        byte byte2=127;
        //математические операторы:
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a/b=" + (a/b));
        System.out.println("a%b=" + (a%b));
        System.out.println("a*b=" + (a*b));

        //логические операторы:
        System.out.println(a>b && c>a);
        System.out.println(a>double1 || a>c);

        //переполнение:
        System.out.println(byte1*byte2);
    }
}
