package test;

/**
 * Created by lyl57 on 2017/1/21.
 * 装箱-拆箱
 */
public class Boxing {
    public static void main(String[] args) {
        //在-128~127 之外的数
        Integer i1 =200;
        Integer i2 =200;
        System.out.println("i1==i2: "+(i1==i2));
        // 在-128~127 之内的数
        Integer i3 =100;
        Integer i4 =100;
        System.out.println("i3==i4: "+(i3==i4));

        System.out.println("默认值最大值"+Integer.MAX_VALUE );
        System.out.println("默认值最小值"+Integer.MIN_VALUE );


    }
}
