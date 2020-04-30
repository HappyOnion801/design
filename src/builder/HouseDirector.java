package builder;

public class HouseDirector {
    HouseBuilder hb = null;
    public HouseDirector(HouseBuilder hb){
        this.hb = hb;
    }

    public HouseBuilder getHb() {
        return hb;
    }
    public void setHb(HouseBuilder hb) {
        this.hb = hb;
    }
    public House constructHouse(){
        this.hb.buildBaise();
        this.hb.buileWalls();
        this.hb.buildRoofed();
        return this.hb.getHouse();
    }
}
