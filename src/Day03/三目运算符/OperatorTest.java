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
        int temp = ((a > b) ? a : b);
        System.out.println(temp);
        max = ((max > c) ? max : c);
        System.out.println(max);

        //一步搞定
        int max2 = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        //比较两个整数是否相同
        int m = 100;
        int n = 200;

        boolean flag = (m == n) ? true : false;
        System.out.println(flag);
    }
}
