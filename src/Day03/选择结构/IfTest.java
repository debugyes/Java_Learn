package Day03.选择结构;
/*
    if语句格式2的练习
    获取两个数据中较大的值
    判断一个数据是奇数还是偶数
 */
import java.util.Scanner;
public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //获取两个数据中较大的值
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();

        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();

        //定义一个变量接收最大值
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("max:" + max);
        System.out.println("--------------");

        //判断一个数据是奇数还是偶数
        System.out.println("请输入你要判断的数据");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + "这个数据是偶数");
        } else {
            System.out.println(x + "这个数据是奇数");
        }
    }
}
