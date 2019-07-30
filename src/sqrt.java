/**
 * Created by Mouri on 2019/2/21 22:03
 */
public class sqrt {
    public int mySqrt(int x) {
        int big = x/2;
        int small = 0;
        int temp = big;
        while(small<big){
            if(big*big>x){
                temp = big;
                big = (big-small)/2+small;
            }else{
                small = big;
                 big = temp;
            }
        }
        return small;
    }

    public static void main(String[] args) {
        sqrt sqrt = new sqrt();
        System.out.println(sqrt.mySqrt(99));
    }
}
