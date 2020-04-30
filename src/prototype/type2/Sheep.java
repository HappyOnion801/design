package prototype.type2;

public class Sheep implements Cloneable {
    private String name;
    private Sheep hisFriend;
    public Sheep(String name){
        this.name = name;
    }
    public void setHisFriend(Sheep frined){
        this.hisFriend = frined;
    }
    public Sheep getHisFriend(){
        return this.hisFriend;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Sheep res = (Sheep) super.clone();
        if(this.hisFriend != null) res.setHisFriend((Sheep)this.hisFriend.clone());
        return res;
    }
}
