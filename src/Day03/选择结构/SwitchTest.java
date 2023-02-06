package Day03.选择结构;

/*
    2023年2月6日
    判断switch的结束条件
 */
public class SwitchTest {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        switch (x) {
            default:
                y++;
                break;
            case 3:
                y++;
                break;
            case 4:
                y++;
                break;
        }
        System.out.println("y=" + y);
        System.out.println("---------------------");

        int a = 2;
        int b = 3;
        switch (a) {
            default:
                b++;
            case 3:
                b++;
            case 4:
                b++;
        }
        System.out.println("b="+b);
    }
}
/*
    输出结果
    y=4
    ---------------------
    b=6
 */