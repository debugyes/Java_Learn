package Day03.三目运算符;

public class OperatorTest {
    public static void main(String[] args) {
        //获取两个整数中的最大值
        int x = 100;
        int y = 200;

        int max = x > y ? x : y;
        System.out.println("max:" + max);
        System.out.println("-----------");
        //获取三个整数中的最大值
        int a = 10;
        int b = 30;
        int c = 20;

        //分两步
        //先比较a,b的最大值
        //拿a,b的最大值和c进行比较
    }
}
