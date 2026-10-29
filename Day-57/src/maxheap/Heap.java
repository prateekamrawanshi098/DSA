package maxheap;

public class Heap {
    int size;
    public void insertElement(int [] arr,int x){
        int childIndex=++size;
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
        arr[1]=x;
    }

    public void delete(int [] arr){
        if (size==0){
            System.out.println("Heap is empty");
            return;
        }

        arr[1]=arr[size--];

        int parentIndex=1;

        while (2*parentIndex<=size){

            int childIndex=2*parentIndex;

            if (childIndex+1<=size && arr[childIndex+1]>arr[childIndex]){
                childIndex++;
            }

            if (arr[childIndex]<=arr[parentIndex]){
                break;
            }

            int temp=arr[parentIndex];
            arr[parentIndex]=arr[childIndex];
            arr[childIndex]=temp;

            parentIndex=childIndex;

        }
    }
}
