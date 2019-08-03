package test.ZTE;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/1
 */
public class GetMaxEnergy {
    public int getMaxEnergies(int[] volumes, int reactorCap, int[] masses, int criticalMass, int numberOfRadLiquid, int[] energies){

        int[][] dp = new int[criticalMass+1][reactorCap+1];

        for(int i=0;i<numberOfRadLiquid;i++){
            for(int j=criticalMass;j>=masses[i];j--){
                for(int k=reactorCap;k>=volumes[i];k--){
                    dp[j][k]=Math.max(dp[j-masses[i]][k-volumes[i]]+energies[i],dp[j][k]);
                }
            }
        }
        return dp[criticalMass][reactorCap];
    }

    public static void main(String[] args){
        int reactorCap = 100;//容量
        int numberOfRadLiquid = 5;//小瓶子的数量
        int criticalMass = 15;//最大质量
        int[] volumes = {50,40,30,20,10};
        int[] masses = {1,2,3,9,5};
        int[] energies = {300,480,270,200,180};

        GetMaxEnergy test = new GetMaxEnergy();
        int a = test.getMaxEnergies(volumes,reactorCap,masses,criticalMass,numberOfRadLiquid,energies);
        System.out.println(a);
    }
}
