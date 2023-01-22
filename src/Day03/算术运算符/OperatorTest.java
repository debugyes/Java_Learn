package Day03.算术运算符;
/*
    练习：算术运算符++--
 */
public class OperatorTest {
    public static void main(String[] args) {
        //第一题
        int a = 10;
        int b = 10;
        int c = 10;

        a = b++;//a = 10 b = 11 c = 10
        c = --a;//a = 9 b = 11 c = 9
        b = ++a;//a = 10 b = 10 c = 9
        a = c--;//a = 9 b = 10 c = 8

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);

        //第二题
        int x = 4;
        int y = (x++) + (++x) + (x * 10);
        //x = 6, y = 70
    }
}
