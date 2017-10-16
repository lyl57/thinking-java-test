package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by lyl57 on 2017/2/17.
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<Integer>();
        Random rd=new Random(50);
        for(int i=0;i<10;i++){
            queue.offer(rd.nextInt(i+10));
        }
        pringQ(queue);

        Queue<Character>queue1=new LinkedList<Character>();
        for(char c:"My name is liao".toCharArray()){
            queue1.offer(c);
        }
        pringQ(queue1);
    }

    public static void pringQ(Queue queue){
        while (queue.peek()!=null){
            System.out.print(queue.remove()+"====>");
        }
        System.out.println();
    }
}
