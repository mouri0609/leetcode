package code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/7/26
 */
public class HashTest {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"world");

        //通过key遍历的方法，效率最低
        for (Integer key:map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }

        //如果需要同时遍历Key和Value，则entrySet方法效率最高
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //只能遍历value,不能遍历key。如果仅仅是遍历value，效率最高
        for(String v: map.values()){
            System.out.println(v);
        }

    }
}
