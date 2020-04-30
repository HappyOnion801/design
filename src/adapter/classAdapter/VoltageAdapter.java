package adapter.classAdapter;

public class VoltageAdapter extends Voltage220 implements IVoltage5 {
    @Override
    public int output5() {
        int dst = output220()/44;
        System.out.println("输出：" + 5 + "V");
        return dst;
    }
}
