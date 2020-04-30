package signleton.type4;
//懒汉式单例设计模式
//这种写法是对 type3 的改进，增加了synchronized关键字，实现了现成的同步，保证了线程安全
//由于synchrnized关键字的使用，使得程序的效率降低，不推荐使用
//可以使用
class Singleton{
    private static Singleton instance;
    private Singleton(){}
    //增加synchronized关键字，保证线程安全
    public static synchronized Singleton getInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }
}

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton == Singleton.getInstance());
    }
}
