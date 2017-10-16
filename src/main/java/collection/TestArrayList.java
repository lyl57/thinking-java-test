package collection;

import sun.plugin.javascript.navig.Array;

import java.util.*;

/**
 * Created by lyl57 on 2017/2/15.
 */
public class TestArrayList {
    public static void main(String[] args) {
        //测试一
        /*ArrayList<Apple> apples=new ArrayList();
        for(int i=0;i<3;i++){
            apples.add(new Apple());
        }
        apples.add(new Orange());
        apples.add(new Orange1());
        for(int i=0;i<apples.size();i++){
            System.out.println(apples.get(i));
        }*/

        //测试二
        /*Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,4,5,6));
        Integer[] moreInts={7,8,9};
        collection.addAll(Arrays.asList(moreInts));
        for (Integer i:collection){
            System.out.println(i);
        }
        Collections.addAll(collection,12,3,5,6,7);
        Collections.addAll(collection,moreInts);
        System.out.println("-------------------");
        for (Integer i:collection){
            System.out.println(i);
        }
        List<Integer> list=Arrays.asList(11,2,3,5,6);
        for (Integer i:list){
            System.out.println(i);
        }
        System.out.println("-----------------------");
        list.set(1,23);
        for (Integer i:list){
            System.out.println(i);
        }*/


        //测试三
//        Collection<String> snows=Arrays.asList(new String("222"),new String("444"));

//        System.out.println(snows.toString());
//        List<Snow> snows1=Arrays.asList(new Light(),new Heavy());//Arrays.asList 只有Powder类型，所以只会创建Powder类型
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            list.add(i);
        }
        list.add(-1);
        /*
        Date date1 = new Date();

        for (int i=10000;i<10010;i++){

        }
        Date date2=new Date();
        System.out.println(date2.getTime()-date1.getTime());*/

        ArrayList<Integer>list2=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list2.add(i);
        }
        Date date3=new Date();

        System.out.println(list2.containsAll(list));
//        list2.retainAll(list);
        Random rand=new Random(5);
        System.out.println(list2);
//        Collections.shuffle(list2,rand);
//        System.out.println(list2);



        /*Iterator<Integer>iterator= list2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(list2);*/
    }
}

class Snow{}
class Powder extends  Snow{}
class Light  extends Powder{}
class Heavy extends  Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}


class Apple{
    private static long counter;
    private final long id=counter++;
    public long id(){
        return id;
    }
}
class Orange extends Apple{}
class Orange1 extends Apple{}