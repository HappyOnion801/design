package adapter.classAdapter;

/**
 * @author MaCode
 * @date 2020-04-30 8:27
 */
public class Demo {
    public static void main(String[] args) {
        new Phone().charging(new VoltageAdapter());
    }
}
