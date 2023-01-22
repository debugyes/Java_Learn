package Day03.逻辑运算符;
/*
    2023年1月11日
    测试&与&&的区别
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        //boolean b1 = (x++ == 3 & y++ ==4);//x = 4, y = 5
        boolean b1 = (++x == 3 && ++y ==4);
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println(b1);
    }
}
