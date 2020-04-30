package prototype.type3;

import java.io.*;

public class Sheep implements Cloneable {
    private String name;
    private Sheep hisFriend;
    public Sheep(String name){
        this.name = name;
    }
    public Sheep getHisFriend(){
        return this.hisFriend;
    }
    public void setHisFriend(Sheep friend){
        this.hisFriend = friend;
    }
    public Object clone() throws CloneNotSupportedException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try{
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep res = (Sheep) ois.readObject();
            return res;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try{
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
