package Day03.循环结构;
/*
    2023年2月6日
    需求：输出1-10之间数据之和
    我们要定义两个变量：
        一个变量用于存储第一个加数，第一个加数其实保存的是以前的所有数据和，默认初始化值应该是0
        一个变量用于存储第二个加数，第二个加数其实就是每次的数据变化的值
 */
public class ForDemo3 {
    public static void main(String[] args) {
        System.out.println(1+2+3+4+5+6+7+8+9+10);
        System.out.println("---------------------");
        //使用循环进行改进
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            //这里的i其实是第二个加数
            sum += i;
        }
        System.out.println(sum);
    }
}
