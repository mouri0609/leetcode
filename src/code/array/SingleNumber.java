package code.array;

public class SingleNumber {
    public int singleNumber(int[] nums){
        int result = nums[0];
        for (int i = 1;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(2^2^1);
    }
}
