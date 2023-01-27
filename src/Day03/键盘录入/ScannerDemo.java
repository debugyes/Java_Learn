package Day03.键盘录入;
/*
    测试键盘录入
 */
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        //创建键盘录入数据对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入一个数据：");
        int x = sc.nextInt();
        System.out.println("你输入的数据是" + x);
    }
}
