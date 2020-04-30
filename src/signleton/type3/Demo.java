package signleton.type3;
//懒汉式单例设计模式
//实现了对象示例的懒加载
//但是线程不安全，所以在不可以使用
class Singleton{
    //创建静态变量
    private static Singleton instance;
    //将构造方法上锁
    private Singleton(){}
    //由于判断和创建对象并不是一个原子操作，所以线程不安全
    public static Singleton getInstance(){
        //进行判断是否存在instan，实现Lazy Loading
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
