package javaa;

public class Human2 {
    private String name;
    private String sex;

    public Human2(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
    public void name(String name) {
        System.out.println(name + "的名字");
    }

    public void sex() {
        System.out.println(sex + "的性别");
    }

    public void introduce() {
        System.out.println("大家好,我是" + name + "，性别" + sex);
    }
}
