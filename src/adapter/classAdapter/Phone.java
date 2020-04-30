package adapter.classAdapter;

public class Phone {
    public void charging(IVoltage5 iVoltage5){
        if(iVoltage5.output5() == 5){
            System.out.println("手机开始充电~~~");
        }else{
            System.out.println("手机没有开始充电");
        }
    }
}
