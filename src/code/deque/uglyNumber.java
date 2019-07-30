package code.deque;

public class uglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index<6){
            return index;
        }

        int[] res = new int[index];
        int queue2 = 0,queue3 = 0,queue5=0;
        res[0] =1;

        for(int i = 1;i<index;i++){

            res[i] = Math.min(res[queue2]*2,Math.min(res[queue3]*3,res[queue5]*5));

            if (res[i] == res[queue2]*2){
                queue2++;
            }
            if (res[i] == res[queue3]*2){
                queue3++;
            }
            if (res[i] == res[queue5]*2){
                queue5++;
            }

        }
        return res[index-1] ;
    }
}
