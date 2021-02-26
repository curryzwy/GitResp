package cn.itcast.model.model2;

/**
 * @Auther:curryzwy
 * @Date:2021-02-26-17:58
 */
public class Test04 {
    //这是main方法，程序的入口
    public static void main(String[] args) throws ClassNotFoundException {

        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器-->开展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取开展类加载器的父类加载器-->根加载器(c/c++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器的
        ClassLoader classLoader = Class.forName("cn.itcast.model.model2.Test04").getClassLoader();
        System.out.println(classLoader);

        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);
    }
}
