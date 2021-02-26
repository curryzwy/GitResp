package cn.itcast.model.model2;

/**
 * @Auther:curryzwy
 * @Date:2021-02-26-13:28
 */
public class TestThread2 implements Runnable{
    private int ticketNums=10 ; //票数为10

    @Override
    public void run() {
        while (true) {
            if ( ticketNums <= 0) {
                break;
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNums--+"票");
        }
    }

    //这是main方法，程序的入口
    public static void main(String[] args) {
        TestThread2 ticket = new TestThread2();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛").start();
    }
}
