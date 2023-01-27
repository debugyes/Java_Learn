package Day03.选择结构;

public class IfDemo2 {
    public static void main(String[] args) {
        //关系表达式无论简单还是复杂，结果必须是boolean类型
        int x = 10;
        if (x == 10) {
            System.out.println("x等于10");
        }
        if (x > 5 || x == 10) {
            System.out.println("x大于或等于10");
        }
        System.out.println("------------------------------");
        //if语句控制的语句体如果是一条语句，大括号可以省略；如果是多条语句，就不能省略。建议永远不要省略
        int a = 100;
        if (a == 100) {
            System.out.println("a的值是100");
        }

    }
}
