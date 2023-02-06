package Day03.循环结构;
/*
    2023年2月6日
    求出1-100之和
 */
public class WhileDemo2 {
    public static void main(String[] args) {
        //求出1-100之和
        //for语句版本
        int sum = 0;
        for (int x = 1; x <= 100; x++) {
            sum += x;
        }
        System.out.println("sum:" + sum);
        System.out.println("---------------------------");
        //while语句版本
        int sum2 = 0;
        int y = 1;

        while (y <= 100) {
            sum += y;
        }

    }
}
