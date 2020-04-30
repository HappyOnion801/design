package adapter.objectAdapter;

public class Phone {
    public void charging(Adapter adapter){
        if(adapter.output() == 5){
            System.out.println("手机正在充电~~~");
        }
    }
}
