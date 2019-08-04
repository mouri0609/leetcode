package code.array.newCoder;

import code.dfs.Permutation;

import java.util.ArrayList;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/4
 */
public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<numbers.length;i++){
            list.add(numbers[i]);
        }
        if (list.size()==1){
            return list.get(0).toString();
        }
        list.sort(((o1, o2) -> {
            String s1 = o1.toString()+o2.toString();
            String s2 = o2.toString()+o1.toString();
            return s1.compareTo(s2);

        }));
        StringBuffer s = new StringBuffer();
        for (int i=0;i<list.size();i++){
            s.append(list.get(i).toString());
        }
        return s.toString();
    }

    public static void main(String[] args) {
        int[] a = {3,5,1,4,2};
        PrintMinNumber test = new PrintMinNumber();
        test.PrintMinNumber(a);
    }
}
