package pack1;

/**
 * Created by lyl57 on 2017/1/18.
 */
public class TestEnum {
   static Spiciness s1=Spiciness.FLAMING;

    public static void main(String[] args) {
        System.out.println(s1);
        for (Spiciness s:Spiciness.values()){
            System.out.println(s+"-----"+s.ordinal());
        }

    }

}
