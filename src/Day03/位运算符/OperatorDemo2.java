package Day03.位运算符;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b ^ b;
        b = b ^ b ^ b;
        System.out.println(a);
    }
}
