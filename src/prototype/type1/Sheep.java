package prototype.type1;

public class Sheep implements Cloneable {
    private String name;
    private Sheep hisFriend;
    public Sheep(String name){
        this.name = name;
    }
    public void setHisFriend(Sheep friend){
        this.hisFriend = friend;
    }
    public Sheep getHisFriend(){
        return this.hisFriend;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}