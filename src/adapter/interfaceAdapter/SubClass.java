package adapter.interfaceAdapter;

public class SubClass extends Adapter {
    @Override
    public void m1(){
        System.out.println("通过Adapter，只继承了m1（）方法");
    }
}
