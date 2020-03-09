import com.cy.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class mytest {
    public static void main(String[] args) throws Exception {
        Class cls = Student.class;
        Student student = new Student();
        //通过反射获取成员变量
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);//强行加权限(不管修饰符)
        //通过反射设置成员变量的值
        name.set(student,"lcy");
        //通过反射获取成员变量的值
        Object o = name.get(student);
        //将成员变量的值输出
        System.out.println(o);

        //通过反射创建一个空构造方法(感觉没什么用)
        Object o1 = cls.newInstance();
        System.out.println(o1);

        //通过反射获取Student类中的speak方法,参数是string类型
        Method method = cls.getMethod("speak", String.class);
        //调用被反射的方法，并且传入参数("反射")
        method.invoke(student,"反射");

        //获得类名
        System.out.println(cls.getName());
    }
}
