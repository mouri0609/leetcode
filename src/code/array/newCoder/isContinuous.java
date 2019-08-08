package code.array.newCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/5
 */
public class isContinuous {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length==0){
            return false;
        }
        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();
        int zeroIndex = 0;
        for (int i=0;i<numbers.length-1;i++){
            if (numbers[i]==0){
                zeroIndex++;
            }else if(numbers[i]==numbers[i+1]){
                return false;
            }
        }
        if (zeroIndex>3){
            return true;
        }
        int sub = numbers[4]-numbers[zeroIndex];
        if (sub<=4){
            return true;
        }
        return false;
    }
}
