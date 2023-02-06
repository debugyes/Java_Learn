package Day03.循环结构;
/*
    2023年2月6日
    在控制台输出满足如下条件的五位数
    个位等于万位
    十位等于千位
    个位+十位+千位+万位=百位

    分析：
        A：五位数就告诉了我们范围
        B：分解每一个五位数的个，十，百，千，万位上的数据
        C：按照要求进行判断即可
 */
public class ForDemo7 {
    public static void main(String[] args) {
        for (int x = 10000; x <= 99999; x++) {
            int ge = x % 10;
            int shi = x / 10 % 10;
            int bai = x / 100 % 10;
            int qian = x / 1000 % 10;
            int wan = x /10000 % 10;

            if ((ge == wan) && (shi == qian) && (ge + shi + qian + wan == bai)) {
                System.out.println(x);
            }
        }
    }
}
