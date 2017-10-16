package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lyl57 on 2017/2/16.
 */
public class TestSet {
    public static void main(String[] args) {
        /*HashSet<Integer> set=new HashSet();
        set.add(2);
        set.add(4);
        for (Integer i:set){
            System.out.println(i);
        }

        Set<Integer> set1=new TreeSet();
        set1.add(2);
        set1.add(4);
        for (Integer i:set1){
            System.out.println(i);
        }*/

        HashMap<String,String> hashMap=new HashMap<String, String>();
        System.out.println(hashMap.put("11","2"));
        System.out.println(hashMap.put("11","2"));
    }
}
