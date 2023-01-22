package Day03.算术运算符;
/*
    2023年1月11日
    测试+-&/和%
 */
public class OperatorDemo {
    public static void main(String[] args) {
        //定义变量
        int x = 3;//把3赋值给int类型的变量x
        int y = 4;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);//整数相除只能得到整数

        //我就想得到小数
        //只需要把操作的数据中任意的一个数据变为浮点数
        System.out.println(x*1.0/y);

        //%的应用
        System.out.println(x % y);//得到的余数

    }
}
