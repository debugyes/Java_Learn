package Day03.选择结构;

/*
    2023年1月24日
    测试第三种if语句的格式
    需求：键盘录入一个成绩，判断并输出成绩的等级
 */
import java.util.Scanner;
public class IfDemo5 {
    public static void main(String[] args) {
        //需求：键盘录入一个成绩，判断并输出成绩的等级
        /*
            90-100优秀
            80-90好
            70-80良好
            60-70及格
            0-60不及格
         */
        Scanner sc = new Scanner(System.in);
        //录入数据
        System.out.println("请输入你的考试成绩：");
        int score = sc.nextInt();
        if (score >= 90 && score < 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        //这样写已经满足我的基本要求，但是可能别人在使用的时候，不会按照你要求的数据给出了
        //在左一个程序的基本测试的时候，一定要考虑这样的几个问题
        //正确数据，错误数据，边界数据
        //而我们刚才写的数据并没有处理错误数据，这个恒旭不是很好，要改进
        System.out.println("请输入你的考试成绩：");
        score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("你输入的成绩有误");
        }
    }
}
