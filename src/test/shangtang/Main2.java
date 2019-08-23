package test.shangtang;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/19
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] people = new String[n];
        for (int i = 0;i<n;i++){
            people[i] = in.next();
        }
        int  votes = in.nextInt();
        String[] votespeople = new String[votes];
        for (int i = 0;i<votes;i++){
            votespeople[i] = in.next();
        }

        int count = 0;
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i=0;i<people.length;i++){
            hashMap.put(people[i],0);
        }
        for (int i=0;i<votes;i++){
            if (hashMap.containsKey(votespeople[i])){
                int temp = hashMap.get(votespeople[i]);
                hashMap.put(votespeople[i],temp+1);
                count++;
            }
        }
        for (int i=0;i<people.length;i++){
            System.out.println(people[i]+" : "+hashMap.get(people[i]));
        }

        System.out.println("Invalid : "+(votes-count));
    }
}
