package Day03.三目运算符;
/*
    2023年1月12日
    测试三目运算符
 */
public class OperatorDemo {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        //int z = x > y ? x : y;
        //int z = x < y ? x : y;
        int z = x == y ? x : y;
        System.out.println("z:" + z);

    }
}
