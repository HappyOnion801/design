package builder;

class HeighBuildingBuilder extends HouseBuilder{

    @Override
    public void buildBaise() {
        System.out.println("创建高楼的地基");
    }

    @Override
    public void buileWalls() {
        System.out.println("创建高楼的墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("创建高楼的屋顶");
    }
}
