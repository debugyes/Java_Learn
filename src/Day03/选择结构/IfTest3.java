package Day03.选择结构;
/*
    键盘录入月份的值，输出对应的季节
    春：3，4，5
    夏：6，7，8
    秋：9，10，11
    冬：12，1，2
    分析
        A：键盘录入月份的值，所以我们要使用Scanner
        B：我们应该判断这个月份在哪个季节，而这个判断情况较多，所以用if语句格式3

 */
import java.util.Scanner;
public class IfTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = sc.nextInt();

        //第三种格式实现即可
        if (month < 1 || month > 12) {
            System.out.println("你输入的月份有误");
        } else if (month == 1) {
            System.out.printf("冬季");
        }else if (month == 2) {
            System.out.printf("冬季");
        }else if (month == 3) {
            System.out.printf("春季");
        }else if (month == 4) {
            System.out.printf("春季");
        }else if (month == 5) {
            System.out.printf("春季");
        }else if (month == 6) {
            System.out.printf("夏季");
        }else if (month == 7) {
            System.out.printf("夏季");
        }else if (month == 8) {
            System.out.printf("夏季");
        }else if (month == 9) {
            System.out.printf("秋季");
        }else if (month == 10) {
            System.out.printf("秋季");
        }else if (month == 11) {
            System.out.printf("秋季");
        }else if (month == 12) {
            System.out.printf("冬季");
        }
        System.out.println("---------------------");

        //这个程序确实是符合了我们的需求，但是看起来比较麻烦
        //可以用逻辑运算符给他们连接起来改进
        if (month < 1 || month > 12) {
            System.out.println("宁输入的月份有误");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("春季");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("夏季");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("秋季");
        } else {
            System.out.println("冬季");
        }

        //继续改进
        if (month < 1 || month > 12) {
            System.out.println("宁输入的月份有误");
        } else if (month >= 3 && month <= 5) {
            System.out.println("春季");
        } else if (month >= 6 && month <= 8) {
            System.out.println("夏季");
        } else if (month >= 9 && month <= 11) {
            System.out.printf("秋季");
        } else {
            System.out.println("冬季");
        }

        System.out.println("------------");
    }
}
