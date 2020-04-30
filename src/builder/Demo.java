package builder;

/**
 * @author MaCode
 * @date 2020-04-30 8:29
 */
public class Demo {
    public static void main(String[] args) {
        House house = new HouseDirector(new CommonHouseBuilder()).constructHouse();
    }
}
