package Day02.变量和数据类型;
/*
    2023年1月8日
    测试变量
 */
public class DataTypeDemo {
    public static void main(String[] args) {
        //定义一个字节变量
        byte b = 10;
        System.out.println(10);
        System.out.println(b);

        //定义一个短整型变量
        short s = 100;
        System.out.println(s);

        //定义一个整型变量
        int i = 1000;
        System.out.println(i);

        //超过了int的范围
        //int j = 100000000000000;//超过了int的范围
        long j = 100000000000000L;
        System.out.println(j);

        //定义浮点数据变量
        float f = 12.345f;
        System.out.println(f);

        double d = 12.345;
        System.out.println(d);

        //定义布尔变量
        boolean flag = true;
        System.out.println(flag);
    }
}
