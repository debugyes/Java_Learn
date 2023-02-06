package Day03.循环结构;

/*
    2023年2月6日
    需求：在控制台输出所有的水仙花数
    所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身
    153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27

    A：三位数其实是告诉了我们范围
    B：通过for循环我们就可以实现获取每一个三位数，但是麻烦是如何获取这个三位数的个、十、百位上的数据
    C：让ge*ge*ge + shi*shi*shi + bai*bai*bai和该数据比较
       如果相同，就把该数据在控制台输出
 */
public class ForDemo6 {
    public static void main(String[] args) {
        for (int x = 100; x < 1000; x++) {
            int ge = x % 10;
            int shi = x / 10 % 10;
            int bai = x / 10 / 10 % 10;
            if (x == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
                System.out.println(x);
            }
        }
    }
}
