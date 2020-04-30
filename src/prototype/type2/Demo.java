package prototype.type2;

public class Demo {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom");
        Sheep sheep1 = new Sheep("aimy");
        sheep.setHisFriend(sheep1);
        try {
            Sheep sheep2 = (Sheep)sheep.clone();
            System.out.println("比较对象本身：" + (sheep == sheep2));
            System.out.println("比较对象的引用对象：" + (sheep.getHisFriend() == sheep2.getHisFriend()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
