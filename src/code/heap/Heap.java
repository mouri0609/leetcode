package code.heap;


public class Heap {
    private int[] a;
    private int n;
    private int count;

    public Heap(int capacity){
        a = new int[capacity+1];
        n = capacity;
        count = 0;
    }

    public void insert(int data) {
        if (count>=n){
            return;
        }
        ++count;
        a[count] = data;
        int i = count;
        while (a[i]>a[i/2]){
            swap(a,i,i/2);
            i = i/2;
        }
    }

    public void remove(int data){
        if (count==0) return;
        a[1] = a[count];
        --count;
        heapify(a,count,1);
    }

    public void buildHeap(int[] a, int n){
        for (int i = n/2;i>=1;--i){
            heapify(a,n,i);
        }
    }

    public void sort(int[] a,int n){
        buildHeap(a,n);
        int k = n;
        while (k>1){
            swap(a,1,k);
            k--;
            heapify(a,k,1);
        }
    }


    public  void heapify(int[] a,int n,int i){

        while (true){
            int maxPos = i;
            if (i*2<n&&a[i]<a[i*2]){
                maxPos = 2*i;
            }
            if (i*2+1<n&&a[maxPos]<a[2*i+1]) {
                maxPos = 2*i+1;
            };
            if (maxPos==i) {
                break;
            }
            swap(a,i,maxPos);
            i = maxPos;
        }
    }

    public void swap(int[] a, int i,int j){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
