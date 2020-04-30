package adapter.objectAdapter;

public class Demo {
    public static void main(String[] args) {
        new Phone().charging(new Adapter(new Voltage220()));
    }
}