package code.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/9
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisInternally(result,"",0,0,n);
        return result;
    }

    private void generateParenthesisInternally(List<String> list,String cur, int left,int right,int n){
        if (cur.length()==n*2){
            list.add(cur);
            return;
        }
        if (left<n){
            generateParenthesisInternally(list,cur+"(",left+1,right,n);
        }
        if (right<left){
            generateParenthesisInternally(list,cur+")",left,right+1,n);
        }
    }

}
