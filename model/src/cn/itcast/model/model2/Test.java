package cn.itcast.model.model2;

/**
 * @Auther:curryzwy
 * @Date:2021-02-26-12:11
 */
public class Test {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        int i=1;
        int j=0;
        try {
            System.out.println(i/j);
        } catch (ArithmeticException e) {
            System.out.println("程序出现异常，变量j不能为0");
        }
    }

}
