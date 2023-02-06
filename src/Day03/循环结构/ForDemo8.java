package Day03.循环结构;
/*
    2023年2月6日
    需求：统计水仙花数共有多少个
    分析：
        A：首先必须知道什么是水仙花数
        B：定义统计变量，初始化值是0
        C：三位数告诉了我们范围，用for循环就可以搞定
        D：获取每一个三位数的个，十，百的数据
        E：按照要求进行判断
        F：如果满足要求就奇数
 */
public class ForDemo8 {
    public static void main(String[] args) {
        int count = 0;
        for (int x = 100; x < 1000; x++) {
            //获取每一个三位数的个，十，百的数据
            int ge = x % 10;
            int shi = x / 10 % 10;
            int bai = x / 10 / 10 % 10;

            if (x == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
                //如果满足就奇数
                count++;
            }
        }

        System.out.println("水仙花数共有" + count + "个");
    }
}
