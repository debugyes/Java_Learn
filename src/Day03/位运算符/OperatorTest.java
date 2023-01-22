package Day03.位运算符;
/*
    实现两个数的交换

 */
public class OperatorTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + ", b:" + b);

        //方式1：使用第三方变量
        int c = a;
        a = b;
        b = c;
        System.out.println("a:" + a + ",b:" + b);
        System.out.println("------------------");

        //方式2：用位异或实现
        //左边：a,b,c
        //右边：a ^ b
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a:" + a + ",b:" + b);

        //方式3：用变量相加的方法
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a + ", b" + b);

        //方式4：一句话搞定
        b = (a + b) - (a = b);
        System.out.println("a:" + a + ", b" + b);
    }
}
