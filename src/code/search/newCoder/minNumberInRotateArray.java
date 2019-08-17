package code.search.newCoder;

public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }

        if(array[0]<array[array.length-1]){
            return array[0];
        }

        int left =0;
        int right = array.length-1;
        int mid = 0;
        while(left<right){
            mid = left+(right-left)/2;
            if(array[mid]>array[right]){
                left = mid+1;
            }else if(array[mid]==array[right]){
                right = right-1;
            }else{
                right = mid;

            }
        }
        return array[left];
    }

    public static void main(String[] args) {
        int[] a = {5,6,1,2,3,4};
        minNumberInRotateArray test = new minNumberInRotateArray();
        int result = test.minNumberInRotateArray(a);
        System.out.println(result);
    }
}
