package Day03.赋值运算符;
/*
    2023年1月11日
    扩展的赋值运算符和普通运算符的区别
 */
public class OperatorTest {
    public static void main(String[] args) {
        short s = 1;
        //s = s+1;报错
        s += 1;//扩展的赋值运算符其实隐含了一个强制类型转换，等价于s = (s的数据类型)(s+1)
        System.out.println(s);
    }
}
