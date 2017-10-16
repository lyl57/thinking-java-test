package interview;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;

/**
 * Created by lyl57 on 2017/1/24.
 */
public class CalendarTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字符编码
        String s1 = "你好";
        String s2 = new String(new String(s1.getBytes("GB2312"), "ISO-8859-1").getBytes("ISO-8859-1"),"GB2312");
        System.out.println(s2);

        //获取年月日
        Calendar now=Calendar.getInstance();
        System.out.println(now.get(Calendar.YEAR));
    }
}
