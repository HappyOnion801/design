package builder;

public class CommonHouseBuilder extends HouseBuilder{

    @Override
    public void buildBaise() {
        System.out.println("创建普通房子的地基");
    }

    @Override
    public void buileWalls() {
        System.out.println("创建普通房子的墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("创建普通房子的房顶");
    }
}
