package Day02.变量和数据类型;
/*
    面试题：
        byte b1 = 3, b2 = 4, b;
        b = b1 + b2;
        b = 3+4;
        哪句是编译失败的呢？为什么呢？
        b = b1 + b2;是有问题的
        因为变量相加，会首先看类型问题，最终把结果赋值的时候也会考虑类型问题
        常量相加，会首先做加法，然后看结果是否在赋值的数据类型范围内，如果不是，才报错
 */
public class DataTypeDemo6 {
    public static void main(String[] args) {
        byte b1 = 3, b2 = 4, b;
        //b = b1 + b2;//这个是类型提升，所以有问题
        b = 3 + 4;//常量：先把结果计算出来，然后看是否在byte范围内，如果在就不报错

    }
}
