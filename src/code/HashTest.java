package code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: Agile����Mouri
 * @Date: 2019/7/26
 */
public class HashTest {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"world");

        //ͨ��key�����ķ�����Ч�����
        for (Integer key:map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }

        //�����Ҫͬʱ����Key��Value����entrySet����Ч�����
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

        //ֻ�ܱ���value,���ܱ���key����������Ǳ���value��Ч�����
        for(String v: map.values()){
            System.out.println(v);
        }

    }
}
