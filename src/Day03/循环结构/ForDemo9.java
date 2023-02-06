package Day03.循环结构;
/*
    2023年2月6日
    需求：请统计1-1000之间同时满足如下条件的数据有多少个
        对3整除余2
        对5整除余3
        对7整除余2
    分析：
        A：1-1000之间是一个范围，用for很容易就可以实现
        B：每个数据要同时满足如下要求
            x % 3 = 2
            x % 5 = 3
            x % 7 = 2
        C：如果满足条件，统计数据即可，最后输出统计变量
 */
public class ForDemo9 {
    public static void main(String[] args) {
        int count = 0;

        for (int x = 1; x <= 1000; x++) {
            if (x % 3 == 2) {
                if (x % 5 == 3) {
                    if (x % 7 == 2) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
