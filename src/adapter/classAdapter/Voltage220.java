package adapter.classAdapter;

public class Voltage220 {
    int src = 220;
    public int output220(){
        System.out.println("电源电压：" + this.src + "V");
        return this.src;
    }
}
