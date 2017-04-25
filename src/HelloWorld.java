/**
 * Created by xiaoma on 17/4/24.
 */
public class HelloWorld {

    public static void main(String[] args) {

        //输出Hello，World！
        System.out.println("Hello, World!");

    }

    /*数据类型
        * 整形：int,long,short,byte
        * 浮点类型：float,double：正无穷大，负无穷大，NaN：判断是不是数字
        * char类型：char,Unicode
        * boolean类型：boolean:false,true
     * */
//    NaN判断
    public void doubleIsNaN {
        double str = 5;

//        String str = "aaaa";
        if (str == Double.NaN) {
            System.out.println("NaN这不是一个数字");
        } else {
            System.out.println("NaN这是一个数字");
        }

        if (Double.isNaN(str)) {
            System.out.println("isNaN这不是一个数字");
        } else {
            System.out.println("isNaN这是一个数字");
        }
    }

    /*变量与常量
    *
    * */
    public void varibleMethod {
        int varible;
        varible = 2;
        System.out.println(varible);
    }

    /*
    * 字符串
    * */
    public void stringMehod {
        String greetIng = "Hello";
        String s = greetIng.substring(0,3);
        String message = greetIng + s;
        System.out.println(message);

        if (greetIng.equals(s)) {
            //相等
        }

        //不区分大小写
        if (greetIng.equalsIgnoreCase(s)) {
            
        }
    }


}

public class Constants {

    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;//final修饰表示只能赋值一次

        /*数学函数与常量
        * */
        double x = 4;

        System.out.println(x);
        //平方根
        double y = Math.sqrt(x);

        System.out.println(y);
        //幂运算
        double w = Math.pow(x,y);

        System.out.println(w);
        //三角函数
        double z1 = Math.sin(30);
        double z2 = Math.cos(30);
        double z3 = Math.tan(30);
        double z4 = Math.atan(30);
        double z5 = Math.atan2(x,y);

        System.out.println(z1,z2,z3,z4,z5);

        //反函数－自然对数
        double e = Math.exp(4);
        double l = Math.log(4);
        System.out.println(e,l);

        //近似值
        double j = Math.PI;
        double j1 = Math.E;
        System.out.println(j,j1);

        //强制转换
        int nx = (int)x;
        System.out.println(nx);

    }
}
