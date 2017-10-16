package pack1;

/**
 * Created by L on 2017/1/3.
 */
public class TestDog {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="spot";
        d.says="Ruff!";
        Dog dd = new Dog();
        dd.name="scruffy";
        dd.says="Wurf";
        System.out.println(d.name+"===="+d.says);
        System.out.println(dd.name+"===="+dd.says);

        System.out.println(d==dd);

        System.out.println(d.equals(dd));
    }
}

class Dog{
    String name;
    String says;

}
