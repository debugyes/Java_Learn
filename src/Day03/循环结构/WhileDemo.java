package Day03.循环结构;
/*
    2023年2月6日
    输出10次HelloWorld
 */
public class WhileDemo {
    public static void main(String[] args) {
        //for语句版
        for (int x = 0; x < 10; x++) {
            System.out.println("HelloWorld");
        }
        System.out.println("-----------------------------");
        //while语句版
        int x = 0;
        while (x < 10) {
            System.out.println("HelloWorld");
            x++;
        }
    }
}
