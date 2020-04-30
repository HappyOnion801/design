package signleton.type2;
//饿汉式单例设计模式（静态代码块写法）
//与Type1相同，只不过写法略有不同
//这种写法可以使用
 class Singleton{
    private static Singleton instance;
    //静态代码块也是在类加载时执行
    static {
        instance = new Singleton();
    }
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton == Singleton.getInstance());
    }
}
