package signleton.type6;
//静态内部类的单例设计模式
//利用内部静态类的加载特点，实现线程安全和懒加载
//推荐使用
class Singleton{
    private Singleton(){}
    //在外部类进行加载时静态内部类不加载
    //类的加载是线程安全的
    private static class SingletonInstance{
        //java底层对fanl有优化
        private static final Singleton INSTANCE = new Singleton();
    }
    //在进行调用时，加载类，实现了懒加载和现成的安全
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton == Singleton.getInstance());
    }
}
