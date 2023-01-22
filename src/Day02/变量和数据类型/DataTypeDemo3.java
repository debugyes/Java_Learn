package Day02.变量和数据类型;

public class DataTypeDemo3 {
    public static void main(String[] args) {
        //直接输出的方式做加法
        System.out.println(3 + 4);
        //两个int类型做加法
        int x = 3;
        int y = 4;
        int z = x + y;
        System.out.println(z);

        //定义一个byte类型，一个int类型，做加法
        byte a = 3;
        int b = 4;
        System.out.println(a + b);
        //可能损失精度
        //byte c = a + b;
        //System.out.println(c);
    }
}
