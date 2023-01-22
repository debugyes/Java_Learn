package Day02.变量和数据类型;
/*
    2023年1月8日
    默认转换
 */
public class DataTypeDemo2 {
    public static void main(String[] args) {
        //相同的作用域中不能定义两个同名变量
        int x = 100;
        //int x = 200;

        //没有初始化值的变量不能直接使用
        int y;//使用变量之前必须给值
        //System.out.println(y);

        int z;
        z = 100;

        //在一行上定义多个变量
        //int a = 10; int b = 20; int c = 30;
        int a = 10;
        int b = 20;
        int c = 30;

        int d, e;
        d = 40;
        e = 50;

        //int f, int g; //错误
        int h; int i;



    }
}
