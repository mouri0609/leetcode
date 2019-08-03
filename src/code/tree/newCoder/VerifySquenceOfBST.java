package code.tree.newCoder;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/7/31
 * @Title: 二叉搜索树的后序遍历序列
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0||sequence==null){
            return false;
        }

        return verify(sequence,0,sequence.length-1);
    }

    private boolean verify(int[] sequence,int first,int end){
        if (end-first<=1){
            return true;
        }

        int index = first;

        while (sequence[index]<sequence[end]){
            index++;
        }

        for (int i=index;i<end;i++){
            if(sequence[i]<sequence[end]){
                return false;
            }
        }

        return verify(sequence,first,index-1)&&verify(sequence,index,end-1);
    }
}
