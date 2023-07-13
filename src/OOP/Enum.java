package OOP;

public class Enum {
    public static void main(String[] args) {
        System.out.println(City.SASKATOON.name);
        System.out.println(City.CALGARY.name);

        System.out.println(MyCity.CALGARY.name);
        System.out.println(MyCity.SASKATOON.name);

    }
}

enum City {

    SASKATOON("Saskatoon", 1001), CALGARY("Calgary", 1002);
    public String name;
    public int id;
    City(String name, int id) {
        this.id = id;
        this.name = name;
    }
}

class MyCity {
    String name;
    int id;

    public MyCity(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public static final MyCity SASKATOON = new MyCity("Saskatoon", 1001);
    public static final MyCity CALGARY = new MyCity("Calgary", 1002);
}

