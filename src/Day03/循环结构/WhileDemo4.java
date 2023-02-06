package Day03.循环结构;
/*
    2023年2月6日
    while循环和for循环的区别
 */
public class WhileDemo4 {
    public static void main(String[] args) {
        //for循环的实现
        for (int x = 0; x < 10; x++) {
            System.out.println("学习java");
        }
        //这里不能再继续访问了
        //System.out.println(x);

        //while循环实现
        int y = 0;
        while (y < 10) {
            System.out.println("学习java");
            y++;
        }
        System.out.println(y);
    }
}
