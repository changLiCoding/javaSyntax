package OOP;

public class PublicAndPrivate {
    static public void main(String[] args) {

        Building house = Building.getInstance("house");
//        house.test();
        Building townhouse = Building.getInstance("townhouse");

        System.out.println(house.equals(townhouse));
        Building.BuildingInnerClass houseInner = house.new BuildingInnerClass();
    }

}

class Building {
    private String name;
    int height;
    protected int width;
    public int length;


    private static Building building = null;
    private Building(String name) {
        this.name = name;
    }

    public static Building getInstance(String name) {
        if(building == null) {
            building = new Building(name);
        }
        return building;
    }

    public class BuildingInnerClass {

    }
    public void test() throws Exception {
        clone();
    }
}