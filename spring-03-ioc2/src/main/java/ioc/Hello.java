package ioc;

public class Hello {
    private String name;

    public Hello(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("名字是" + this.name);
    }
}
