package javaa;

public class polymorphism {
    //多态
    public static void main(String[] args) {
        show(new Man()); //以男人对象调用show方法
        show(new Woman());//以女人对象调用show方法

        Huaman huaman = new Woman();//向上转型
        huaman.sex();               //调用的是子类的方法

        Woman woman2 = (Woman) huaman;//向下转型
        woman2.sex();
    }

    public static void show(Huaman a) {
        //instanceof类判断
        if (a instanceof Man) {//男人
            Man man = (Man) a;
            man.sex();
        } else {                //女人
            Woman woman = (Woman) a;
            woman.sex();
        }
    }
}

    abstract class Huaman {
        abstract void sex();
    }

   class Woman extends Huaman{

       public void sex() {
           System.out.println("女人");
       }
   }
   class Man extends Huaman{
        public void sex(){
            System.out.println("男人");
        }
   }