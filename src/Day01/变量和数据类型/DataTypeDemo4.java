package Day01.变量和数据类型;
/*
    2023年1月10日
    强制转换
 */
public class DataTypeDemo4 {
    public static void main(String[] args) {
        byte a = 3;
        int b = 4;

        //这个肯定没有问题
        //int c = a + b;

        //byte c = 7;
        //这个是有问题的
        //byte c = a + b;
        //用强制类型转换
        byte c = (byte) (a + b);
    }
}
