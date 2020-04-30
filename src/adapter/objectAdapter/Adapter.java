package adapter.objectAdapter;

public class Adapter implements IVoltage5{
    private Voltage220 src;
    public Adapter(Voltage220 voltage220){
        this.src = voltage220;
    }
    @Override
    public int output() {
        int src = this.src.ouput();
        int dst = src / 44;
        System.out.println("适配器电压：" + dst + "V");
        return dst;
    }
}
