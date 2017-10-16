package collection;

import java.util.LinkedList;

/**
 * Created by lyl57 on 2017/2/16.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(1); list.add(2); list.add(3);
        System.out.println(list.element());
        System.out.println(list.getFirst());

        System.out.println(list.peek());
        System.out.println(list.remove());

        System.out.println(list);
        list.addFirst(1);
        System.out.println(list);
    }
}
