package signleton.type7;
//利用枚举进行单例设计模式
//解决了线程安全问题，解决了通过反序列化创建对象的问题
//java作者推荐的单例设计模式
//创建枚举类型
enum Singleton{
    //只创建一个枚举对象
    INSTANCE();
    //对象的其他方法
    public void method(){
        System.out.println("That is a method~~");
    }
}

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        System.out.println(singleton == singleton.INSTANCE);
        singleton.method();
    }
}
