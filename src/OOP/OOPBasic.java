package OOP;

public class OOPBasic {
    public static void main(String[] args) {


        Animal piggy = new Animal("piggy", 4, "corn");

        piggy.sayHello();
        System.out.println(piggy.getName());
        piggy.setName("Little Piggy");
        System.out.println(piggy.getName());
        piggy.eatFood();

    }
}

 class Animal {
    private String name;
    private int legsNum;
    private String food;

    public Animal(String name, int legsNum, String food) {
        this.name = name;
        this.legsNum = legsNum;
        this.food = food;
    }
    public void sayHello() {
        System.out.println("Hello! My name is: " + this.name + " And I have " + legsNum + " legs. ");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void eatFood() {
         System.out.println("Me like eat " + this.food);
     }
}