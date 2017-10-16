package interview;

/**
 * Created by lyl57 on 2017/1/21.
 */
public class MathTest {


    public static void main(String[] args) {

        // System.out.println(Math.round(12.3));
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true Programming会存放在常量池中，
        System.out.println(s3 == s1.intern());
    }
}
