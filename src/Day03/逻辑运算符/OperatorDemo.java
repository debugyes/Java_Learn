package Day03.逻辑运算符;
/*
    2023年1月11日
    测试逻辑运算符
 */
public class OperatorDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        //&
        System.out.println((a > b) & (a > c)); //false & false = false
        System.out.println((a > b) & (a < c)); //false & false = false
        System.out.println((a < b) & (a > c)); //true & false = false
        System.out.println((a < b) & (a < c)); //true & true = true
        System.out.println("------------------");
        //逻辑或
        System.out.println((a > b) | (a > c)); //false | false = false
        System.out.println((a > b) | (a < c)); //false | false = false
        System.out.println((a < b) | (a > c)); //true | false = true
        System.out.println((a < b) | (a < c)); //true | true = true
        System.out.println("------------------");
        //逻辑异或
        System.out.println((a > b) ^ (a > c)); //false ^ false = false
        System.out.println((a > b) ^ (a < c)); //false ^ false = true
        System.out.println((a < b) ^ (a > c)); //true ^ false = true
        System.out.println((a < b) ^ (a < c)); //true ^ true = false
        System.out.println("------------------");
        //逻辑非
        System.out.println(!(a > b));//true
        System.out.println(!!(a < b));//true
        System.out.println(!!!(a < b));//false
    }
}
