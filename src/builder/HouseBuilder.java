package builder;

abstract class HouseBuilder {
    House house = new House();
    public abstract void buildBaise();
    public abstract void buileWalls();
    public abstract void buildRoofed();
    public House getHouse(){
        return this.house;
    }
}

