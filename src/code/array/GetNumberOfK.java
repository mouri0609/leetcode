package code.array;

public class GetNumberOfK {
    public int getNumberOfK(int [] array, int k){
        if(array.length<1){
            return 0;
        }

        int low = 0;
        int high = array.length-1;
        int mid = low;
        int res = 0;
        while (low<high){
            mid = low+(high-low)/2;
            if (array[mid]<k){
                low = mid+1;
            }else if (array[mid]>k){
                high = mid-1;
            }else {
                break;
            }
        }
        while (mid!=0&&array[mid-1]==array[mid]){
            mid--;
        }
        while (mid<array.length-1&&array[mid]==array[mid+1]&&array[mid]==k){
            mid++;
            res++;
        }
        System.out.println(res);
        return res+1;

    }


    public static void main(String[] args) {
        int[] a = {1,3,3,3,3,4,5};
        GetNumberOfK getNumberOfK = new GetNumberOfK();
        getNumberOfK.getNumberOfK(a,2);
    }
}
