package OOP;

public class OOPBasic {
    public static void main(String[] args) {


        Animal piggy = new Animal("piggy", 4, "corn");

        piggy.sayHello("Dog", "Cat", "Cow", "Human");
        System.out.println(piggy.getName());
        piggy.setName("Little Piggy");
        System.out.println(piggy.getName());
        piggy.eatFood();

        System.out.println(Animal.getClassName());
//        Animal.setClassName("AnimalName");
        System.out.println(piggy.getClass());
    }
}

 class Animal {
    private String name;
    private int legsNum;
    private String food;

    static String className = "Animal";

    static String getClassName() {
        return className;
    }

//    static void setClassName(String className) {
//         this.className = className;
//    }


     Animal(String name, int legsNum, String food) {
        System.out.println("Animal Constructor Called. ");
        this.name = name;
        this.legsNum = legsNum;
        this.food = food;
    }
    public void sayHello(String... toWhom) {
        System.out.println("Hello! My name is: " + this.name + " And I have " + legsNum + " legs. " + toWhom[0] + " I wish you have a good day! ");
        for (String who: toWhom) {
            System.out.println(who + " I wish you have a good Day! ");
        }
    }

     String getName() {
        return name;
    }
     void setName(String name) {
        this.name = name;
    }

     void eatFood() {
         System.out.println("Me like eat " + this.food);
     }
}