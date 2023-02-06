package Day03.选择结构;

/*
    2023年2月6日
    用switch语句实现键盘录入月份，输出对应的季节
    分析
        A：用键盘录入一个月份，用Scanner实现
        B：用switch语句实现即可
 */
import java.util.Scanner;
public class SwitchTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //录入数据
        System.out.println("请输入月份(1-12)");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("冬季");
                break;
            case 2:
                System.out.println("冬季");
                break;
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("春季");
                break;
            case 5:
                System.out.println("春季");
                break;
            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("夏季");
                break;
            case 8:
                System.out.println("夏季");
                break;
            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("秋季");
                break;
            case 11:
                System.out.println("秋季");
                break;
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("您输入的月份有误");
        }

        //case穿透
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("您输入的月份有误");
        }
    }
}
