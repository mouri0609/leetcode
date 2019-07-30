package code.dp.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Agile_Mouri
 * @Date: 2019/6/7
 */


/**
 * leetcode 638
 * 大礼包问题  DFS
 */
public class ShoppingOffers {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return shoppingOffersIntenally(price,special,needs,0);
    }

    private int shoppingOffersIntenally(List<Integer> price, List<List<Integer>> special, List<Integer> needs,int pos){
        int cost = costWithoutSpecial(price,needs);

        //对大礼包的每一个礼包进行循环
        for (int i=pos;i<special.size();i++){
            //改变后的needs
            List<Integer> temp = new ArrayList<>();
            List<Integer> offer = special.get(i);
            //对礼包里面的每一个数据进行循环
            for (int j=0;j<price.size();j++){
                if (needs.get(j)<offer.get(j)){
                    temp = null;
                    break;
                }
                temp.add(needs.get(j)-offer.get(j));
            }
            if (temp!=null){
                System.out.println("--------------------");
                System.out.println(cost);
                System.out.println(temp);
                cost = Math.min(cost,offer.get(price.size())+shoppingOffersIntenally(price,special,temp,i));
                System.out.println(cost);
            }
        }

        return cost;
    }

    private int costWithoutSpecial(List<Integer> price, List<Integer> needs){
        int sum = 0;
        for (int i=0;i<price.size();i++){
            sum+=price.get(i)*needs.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> price = Arrays.asList(2, 5);
        List<Integer> needs = Arrays.asList(3, 2);
        List<List<Integer>> special = new ArrayList<>();
        List<Integer> offer1 = Arrays.asList(1, 2, 5);
        List<Integer> offer2 = Arrays.asList(3, 2, 3);
        List<Integer> offer3 = Arrays.asList(1, 0, 1);
        special.add(offer1);
        special.add(offer2);
        special.add(offer3);
        ShoppingOffers shoppingOffers = new ShoppingOffers();
        shoppingOffers.shoppingOffers(price,special,needs);
        System.out.println(price);
    }
}
