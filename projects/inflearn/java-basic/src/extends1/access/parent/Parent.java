package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedValue() {
        System.out.println("Parent.protectedValue");
    }

    void setDefaultValue() {
        System.out.println("Parent.setDefaultValue");
    }

    private void PrivateValue() {
        System.out.println("Parent.PrivateValue");
    }

    public void printParent() {
        System.out.println("==Parent 메서드 안==");
    }
}
