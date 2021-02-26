package cn.itcast.model.model2;

import java.util.concurrent.ForkJoinPool;

/**
 * @Auther:curryzwy
 * @Date:2021-02-26-11:06
 */
public class Dome {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //打印5行三角形

        for(int i=1;i<=5;i++){
            for (int j = 5; j >= i;j--) {
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            for(int j = 1;j < i;j++){
                System.out.print("*");
           }
            System.out.println();
        }
    }
}
