package code;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/7/30
 */
public class Test {
    public static void main(String[] args) {
       Alpa a= new Beta();
       a.f();
       System.out.println(a.getClass().getName());
       try {
            Beta b = (Beta) a;
            b.g();
        }catch (Exception e){
            System.out.println("Error");
        }

    }

}

class Beta implements Alpa{
    public void f(){
        System.out.println("Beta.f()");
    }

    public void g(){
        System.out.println("Beta.g()");
    }
}

interface  Alpa{
    void f();
}
