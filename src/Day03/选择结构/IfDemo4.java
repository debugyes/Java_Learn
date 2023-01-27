package Day03.选择结构;

public class IfDemo4 {
    public static void main(String[] args) {
        //获取两个数的最大值
        int a = 10;
        int b = 20;

        int max1;
        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }
        System.out.println("max:" + max1);

        //用三元改进
        int max2 = (a > b) ? a : b;
        System.out.println("max2:" + max2);
        System.out.println("----------------------------");

        //判断一个数据是奇数还是偶数
        int x = 100;
        if (x % 2 == 0) {
            System.out.println("100是一个偶数");
        } else {
            System.out.println("100是一个奇数");
        }

        //用三元改进
        //String s = (x % 2 == 0)? System.out.println("100是一个偶数"):System.out.println("100是一个奇数");
    }
}
