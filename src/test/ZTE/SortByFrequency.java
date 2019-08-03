package test.ZTE;

import java.util.*;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/1
 */
public class SortByFrequency {
    public List<Integer> sortArrayByFrequency(int nums,int[] array){
        HashMap<Integer,Integer> frequency = new HashMap<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i=0;i<nums;i++){
            if (frequency.get(array[i])==null){
                frequency.put(array[i],1);
                map.put(array[i],i);
            }else {
                frequency.put(array[i],frequency.get(array[i])+1);
            }
            result.add(array[i]);
        }

        result.sort((a, b) -> {
            if (frequency.get(a).equals(frequency.get(b))){
                return map.get(a) - map.get(b);
            }
            return frequency.get(b) - frequency.get(a);
        });
        return result;

    }

    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,3,3,6,6,6,6};
        SortByFrequency test = new SortByFrequency();

        List<Integer> result = test.sortArrayByFrequency(11,a);
        System.out.println(Arrays.asList(result));
    }
}
