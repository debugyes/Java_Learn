package Day03.循环结构;

/*
    2023年2月6日
    需求：
        求1-100之和
        求1-100之间偶数和
        求1-100之间奇数和
 */
public class ForDemo4 {
    public static void main(String[] args) {
        //求1-100之和
        int sum1 = 0;
        for (int x = 1; x <= 100; x++) {
            sum1 += x;
        }
        System.out.println("1-100之和是"+sum1);
        System.out.println("--------------------");

        //求1-100之间偶数和
        int sum2 = 0;
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                sum2 += x;
            }
        }
        System.out.println("1-100偶数之和是"+sum2);
        System.out.println("--------------------");

        //求1-100之间奇数和
        int sum3 = 0;
        for (int x = 1; x <= 100; x++) {
            if (x % 2 != 0) {
                sum3 += x;
            }
        }
        System.out.println("1-100偶数之和是"+sum3);
        System.out.println("--------------------");


    }
}
