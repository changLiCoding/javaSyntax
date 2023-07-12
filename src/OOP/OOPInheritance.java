package OOP;

public class OOPInheritance {
    public static void main(String[] args) {
        System.out.println(AnimalClass.getClassName());
        Human kyle = new Human("Kyle", 2, "steak", 2);
        System.out.println(kyle.getName());
        kyle.shakeHands();
        kyle.speak("OH my GOD! You Killed Kenny! You Bastard! ");
    }
}

class AnimalClass {
    private String name;
    private String food;
    static private String className = "ANIMALCLASS";
    void AnimalClass(String name, String food) {
        this.name = name;
        this.food = food;
    }

    static String getClassName() {
        return className;
    }



}


class Human extends Animal {
    private int handsNum;

    Human(String name, int legsNum, String food, int handsNum) {
        super(name, legsNum, food);
        this.handsNum = handsNum;
    }

    public void speak(String words) {
        System.out.println(getName() + " can speak: " + words+ " I having " + handsNum + " hands! ");
    }
    public void shakeHands() {
        System.out.println("Hello!");
    }
}