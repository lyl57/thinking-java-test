package pack1;

/**
 * Created by L on 2016/12/31.
 */
public class FirstClass {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
