package Day03.选择结构;

/*
    2023年2月5日
    键盘录入一个数据，根据这个数据，我们输出对应的星期
    键盘录入1，对应输出星期一

    分析：键盘录入，用Scanner实现
         判断我们既可以用if语句，也可以使用哦我们要讲解的switch语句
 */
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //控制键盘录入语句
        System.out.println("请输入一个数据(1-7)");
        int week = sc.nextInt();

        //switch判断语句
        switch(week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            default:
                System.out.println("输入的数据有误");
                //break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            case 8:
                System.out.println("您输入的数据有误");
                break;
        }

    }
}
