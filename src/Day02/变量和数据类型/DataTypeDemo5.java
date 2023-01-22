package Day02.变量和数据类型;
/*
    2023年1月10日
    思考题1：请问下面这个有没有问题
        double d = 12.345;
        float f = d;
        可能损失精度
    思考题2：看看下面两个定义有没有区别呢？
        float f1 = (float)12.345;
        float f2 = 12.345f;
        f1其实是一个通过double类型专注拿过来的
        f2本身就是一个float类型
 */
public class DataTypeDemo5 {
    public static void main(String[] args) {
        //把double赋值给float，加了强制类型转换
        double d = 12.345;
        float f = (float)d;

        //看看下面两个定义有没有什么区别呢
        float f1 = (float)12.345;
        float f2 = 12.345F;
    }
}
