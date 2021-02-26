package cn.itcast.model.model2;

import java.util.Arrays;

/**
 * @Auther:curryzwy
 * @Date:2021-02-26-11:43
 */
public class ArraysDome {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,2,1,8,9};
        //排序，升序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //对已排好序的数组进行二分查找
        System.out.println(Arrays.binarySearch(a,8));
    }
}
