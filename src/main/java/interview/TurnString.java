package interview;

/**
 * Created by lyl57 on 2017/1/23.
 */
public class TurnString {
    public static void main(String[] args) {

        String a="a34567";
        System.out.println(a.codePointBefore(1));
//        System.out.println(turnString(a));
//        System.out.println(a.substring(0,a.length()-1));

    }

    public static String turnString(String s){
        if (null==s||0==s.length()){
            return s;
        }
        return turnString(s.substring(1,s.length()))+s.charAt(0);
    }
}
