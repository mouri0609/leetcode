package code.graph.leetcode;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/8
 */
public class FindJudge {
    public int findJudge(int N, int[][] trust) {
        int[][] people = new int[N][2];

        for (int[] one:trust){
            people[one[0]-1][0]++;
            people[one[1]-1][1]++;
        }

        for (int i=0;i<N;i++){
            if(people[i][0]==0&&people[i][1]==N-1){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3}};

        FindJudge test = new FindJudge();
        test.findJudge(3,trust);

    }
}
