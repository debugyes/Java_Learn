package Day03.键盘录入;
/*
    键盘录入练习
    1. 键盘录入两个数据，并对这两个数据求和，输出其结果
    2. 键盘录入两个数据，获取这两个数据中的最大值
    3. 键盘录入三个数据，获取这三个数据中的最大值
    4. 键盘录入两个数据，比较这两个数据是否相等
 */
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘录入两个数据，并对这两个数据求和，输出其结果
        System.out.println("请输入第一个数据");
        int x = sc.nextInt();
        System.out.println("请输入第二个数据");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println(sum);
        //键盘录入两个数据，获取这两个数据中的最大值
        System.out.println("请输入第一个数据");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println(max);
        //键盘录入三个数据，获取这三个数据中的最大值
        System.out.println("请输入第一个数据");
        a = sc.nextInt();
        System.out.println("请输入第二个数据");
        b = sc.nextInt();
        System.out.println("请输入第三个数据");
        int c = sc.nextInt();
        int temp = (a > b) ? a : b;
        max = (temp > c) ? temp : c;
        System.out.println(max);
        //键盘录入两个数据，比较这两个数据是否相等
        System.out.println("请输入第一个数据");
        a = sc.nextInt();
        System.out.println("请输入第二个数据");
        b = sc.nextInt();
        boolean flag = (a == b) ? true : false;
        System.out.println(flag);
    }
}
