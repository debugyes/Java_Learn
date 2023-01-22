package Day03.算术运算符;
/*
    2023年1月11日
    测试自增自减运算符
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        //定义两个变量
        int x = 3;
        int y = 4;

        System.out.println("x:" + x);
        System.out.println("y:" + y);
        //单独使用
        x++;
        y--;
        System.out.println("x:" + x + ",y:" + y);

        //意外类型，常量是不可以这样做的
        //System.out.println(10++);
        System.out.println("------------------");
        int a = 3;
        int b = 4;

        int c = a++;
        int d = b--;
        System.out.println("a:"+a); //4
        System.out.println("b:"+b); //3
        System.out.println("c:"+c); //3
        System.out.println("d:"+d); //4

        c = ++a;
        d = ++b;
        System.out.println("a:"+a); //4
        System.out.println("b:"+b); //3
        System.out.println("c:"+c); //4
        System.out.println("d:"+d); //3
    }
}
