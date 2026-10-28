package heap.maxheap;

public class Heap {
    public void insertElement(int [] arr,int x,int i){
        int childIndex=i;
        int parentIndex;

        while (childIndex>1){
            parentIndex=childIndex/2;
            if (arr[parentIndex]>x){
                arr[childIndex]=x;
                return;
            } else  {
                arr[childIndex]=arr[parentIndex];
                childIndex=parentIndex;
            }
        }
        arr[i]=x;
    }
}
