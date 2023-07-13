package OOP;

public class FinalKeyword {
    public static void main(String[] args) {
        VariableKeywords testVariable = new VariableKeywords("Chang");
        System.out.println(testVariable.name);

        VariableKeywordsChild child = new VariableKeywordsChild("childName");
        child.test();
    }
}

class VariableKeywords {
    final public String name;

    public VariableKeywords(String name) {
        this.name = name;
    }

     protected final void test() {
        System.out.println("Called method in parent. ");
    }



}
class VariableKeywordsChild extends VariableKeywords {
    public VariableKeywordsChild(String name) {
        super(name);
    }
}