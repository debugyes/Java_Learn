package Day03.选择结构;
/*
    三种if语句分别适合做什么事情呢？
        格式1：适合做单个判断
        格式2：适合做两个判断
        格式3：适合做多个判断
    需求：键盘录入x的值，计算出y的值并输出
    x>=3    y=2x+1;
    -1<=x<3 y=2x;
    x<=-1   y=2x-1;

    分析：
        A：由于数据要键盘录入，所以必须使用Scanner
        B：由于是三种判断，所以我们选择if语句格式3
 */
import java.util.Scanner;
public class IfTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值：");
        int x= sc.nextInt();
        int y;
        //用if语句格式3进行判断
        if (x >= 3) {
            y = (2 * x) + 1;
        } else if (x >= -1 && x < 3) {
            y = 2 * x;
        } else {
            y = (2 * x) - 1;
        }
        System.out.println("y:" + y);
    }
}
