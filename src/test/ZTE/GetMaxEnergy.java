package test.ZTE;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/1
 */
public class GetMaxEnergy {
    static int INF=-10000;
    public int getMaxEnergies(int[] vloumes, int reactorCap, int[] masses, int criticalMass, int numberOfRadLiquid, int[] energies){

        int[][] f = new int[criticalMass+1][reactorCap+1];
        for(int i=1;i<=criticalMass;i++){
            for(int j=1;j<=reactorCap;j++){
                f[i][j]=0;
            }
        }
        f[0][0]=0;
        for(int i=0;i<numberOfRadLiquid;i++){
            for(int j=criticalMass;j>=vloumes[i];j--){
                for(int k=reactorCap;k>=masses[i];k--){
                    f[j][k]=Math.max(f[j-vloumes[i]][k-masses[i]]+energies[i],f[j][k]);
                }
            }
        }
        return f[criticalMass][reactorCap];
    }

    public static void main(String[] args){
        int reactorCap = 100;
        int numberOfRadLiquid = 5;
        int criticalMass = 15;
        int[] volumes = {50,40,30,20,10};
        int[] masses = {1,2,3,9,5};
        int[] energies = {300,480,270,200,180};

        GetMaxEnergy test = new GetMaxEnergy();
        int a = test.getMaxEnergies(volumes,reactorCap,masses,criticalMass,numberOfRadLiquid,energies);
        System.out.println(a);
    }
}
