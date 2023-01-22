package Day03.比较运算符;
/*
    2023年1月11日
    测试关系运算符
 */
public class OperatorDemo {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = 3;
        System.out.println(x == y);//false
        System.out.println(x == z);//true
        System.out.println((x + y) == (x + z));//false

        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x < y);
        System.out.println(x <= y);

    }
}
