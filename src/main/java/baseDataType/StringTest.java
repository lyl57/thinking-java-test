package baseDataType;

/**
 * <p>
 * 字符串测试类
 * </p>
 *
 * @author liaoyalang
 * @since 2018-04-26
 **/
public class StringTest {
    public static void main(String[] args) {
        String a = "ab";
        String b = new String("a" + "b");
        String c = "a" + "b";//此处编译器会优化为 c ="ab";

        String d = "a";
        d = d + "b";//此处编译器无法优化，故会生成新的对象
        System.out.println("a:" + a + ",b:" + b + ",c:" + c);
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
    }
}