package test.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String leader = in.nextLine();
            int n = in.nextInt();
            in.nextLine();
            List<List<String>> numbers = new ArrayList<>();
            int isFirst = -1;
            int listNum =0;

            for(int i=0;i<n;i++){
                String str = in.nextLine();
                String[] strs = str.split(",");

                List<String> list = new ArrayList<>();
                for (int j=0;j<strs.length;++j){
                    if(isFirst==-1&&strs[j].equals(leader)){
                        isFirst = listNum;
                    }
                    list.add(strs[j]);
                }
                numbers.add(list);
                listNum++;
            }

            reciveNumber(numbers,isFirst);
        }
    }

    private static void reciveNumber(List<List<String>> numbers,int isFirst){
        List<String> list = numbers.get(isFirst);

        for (int i=0;i<numbers.size();i++){
            if(i==isFirst){
                continue;
            }
            List<String> strs = numbers.get(i);
            int index = 0;
            while (index<list.size()){
                String temp = list.get(index);
                for(int j=0;j<strs.size();++j){
                    String s = strs.get(j);
                    if(strs.contains(temp)&&!list.contains(s)){
                        list.add(s);
                    }
                }
                index++;
            }
        }
        System.out.println(list.size());
    }
}
