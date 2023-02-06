package Day03.循环结构;
/*
    需求：求5的阶乘
    什么是阶乘呢？
        n! = n*(n-1)
        n! = n*(n-1) * (n-2) *...*3*2*1
    求阶乘思想
 */

public class ForDemo5 {
    public static void main(String[] args) {
        //定义最终结果变量
        int jc = 1;
        for (int i = 1; i <= 5; i++) {
            jc *= i;
        }
    }
}
