package pack1;

/**
 * Created by lyl57 on 2017/1/18.
 */
public class Burriro {

    Spiciness degree;
    public Burriro(Spiciness s1){this.degree=s1;}


    /**
     * @Author liao
     * @Date date time
     * ${DESCRIPTION} 测试
     **/
    public void describe(){
        System.out.println("this burrito is ");
        switch (degree){
            case HOT:
                System.out.println("HOT");break;
            case MILE:
                System.out.println("MILE");break;
            default:
                System.out.println("other");
        }
    }

    public static void main(String[] args) {
        Burriro b1=new Burriro(Spiciness.HOT),b2=new Burriro(Spiciness.FLAMING),b3=new Burriro(Spiciness.MILE);
        b1.describe();
        b2.describe();
        b3.describe();
    }
}
