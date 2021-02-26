package cn.itcast.model.model2;

/**
 * @Auther:curryzwy
 * @Date:2021-02-26-13:03
 */
public class TestThread extends Thread{
    public void run(){
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我"+i);
        }
    }

    //这是main方法，程序的入口
    public static void main(String[] args) {
        //main线程，主线程

        //创建一个线程对象
        TestThread testThread = new TestThread();

        //调用start开始
        testThread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("你"+i);
        }
    }
}
