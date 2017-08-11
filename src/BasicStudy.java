/**
 * Created by xiaoma on 2017/8/11.
 */
public class BasicStudy {

    public static void main(String[] args) {
        numberSolution();
    }

    //数字算法处理
    public static void numberSolution() {
        // 逆序输出 5 4 3 2 1
        int x = 12345;

        do {
            int d = x % 10;
            System.out.println("逆序输出" + d);
            x /= 10;
        } while (x > 0);

        //正序输出 1 2 3 4 5；
        int y = 12345;
        int mask = 1;
        int t = y;
        while (t > 9) {
            t /= 10;
            mask *= 10;
        }
        System.out.println("mask = " + mask);
        do {
            int d = y / mask;
            System.out.println("正序输出" + d);
            y %= mask;
            mask /= 10;
        } while (y > 0);
    }


}
