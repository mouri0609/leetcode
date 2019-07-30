package code;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/7/30
 */
public class Test {
    public static void main(String[] args) {
        Integer a1 = new Integer(123);
        Integer b1 = new Integer(123);

        Integer a2 = Integer.valueOf(123);
        Integer b2 = Integer.valueOf(123);

        System.out.println(a1==b1);
        System.out.println(a1.equals(b1));
        System.out.println(a2==b2);
        Thread thread = new Thread();
        thread.start();

    }
}
