package signleton.type1;
//饿汉式单例设计模式
//java的Runtime类使用了这种设计模式
//优点：结构简单，实现了单例设计模式，在类加载时将创建对象，避免了线程问题；
//缺点：只要类加载就需要创建对象，不管有没有用到，没有实现Laz loading，可能浪费空间
//这种写法可以使用
class Singleton{
    //饿汉式将创建静态私有常量，在类加载的时候将创建一个对象
    private static final Singleton instance = new Singleton();
    //将构造方法私有化
    private Singleton(){}
    //创建公开的方法，得到对象实例
    public static Singleton getInstance(){
        return instance;
    }
}

public class Demo {
    public static void main(String args[]){
        Singleton singleton = Singleton.getInstance();
        //测试结果，是否是同一个对象
        System.out.println(singleton == Singleton.getInstance());
    }
}
