package Day03.赋值运算符;

public class OperatorDemo {
    public static void main(String[] args) {

        //基本赋值运算符
        int a, b;
        a = b = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------");

        //扩展赋值运算符
        int y = 10;
        y += 20;
        System.out.println(y);
    }
}
