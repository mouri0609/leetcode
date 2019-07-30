package code.array;

public class moveZero {
    public void moveZeroes(int[] nums) {
        if (nums.length==0||nums.length<1){
            return;
        }
        int index = 0;
        for (int i = 0;i<nums.length-1;i++ ){
            if (nums[i]==0){
                index = i;
                for (int j = i+1;j<nums.length;j++){
                    if (nums[j]!=0){
                        int temp = nums[index];
                        nums[index] = nums[j];
                        nums[j] = temp;
                        break;
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        moveZero moveZero = new moveZero();
        int[] a = new int[]{0,1,0,3,12};
        moveZero.moveZeroes(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
