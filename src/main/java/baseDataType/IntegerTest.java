package baseDataType;

/**
 * <p>
 * IntegerTest
 * </p>
 *
 * @author liaoyalang
 * @since 2018-04-26
 **/
public class IntegerTest {
    public static void main(String[] args) {
        int a = 15;
        System.out.println(Integer.toBinaryString(a));
        int b = a | 1;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
    }
}