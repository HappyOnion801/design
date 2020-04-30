package signleton.type5;
//懒汉式单例设计模式
//双重检查写法，推荐使用，既保证了线程的安全，又实现了懒加载
class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        //首先进行判断是否需要进行创建对象
        if(instance == null){
            //创建对象时要保证线程的安全
            synchronized (Singleton.class){
                //保证instance是null才能创建对象
                if(instance == null) instance = new Singleton();
            }
        }
        return instance;
    }
}

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton == Singleton.getInstance());
    }
}
