package Day03.选择结构;
/*
    2023年1月24日
    if语句的嵌套使用
 */
public class IfTest4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;

        //三元实现
        int temp = (a > b) ? a : b;
        int max = (temp > c) ? temp : c;
        System.out.println("max:" + max);

        //用if实现
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
    }
}
