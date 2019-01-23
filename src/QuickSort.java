public class QuickSort implements Sort {
    @Override
    public Object sort(Object object) {
        quickSort( (int[])object, 0, ((int[]) object).length-1 );
        return (int[]) object;
    }

    public void quickSort(int[] arr, int x, int y){
        int i,j,v,temp;

        i=x;
        j=y;
        v=arr[(x+y) / 2];
        do {
            while (arr[i]<v)
                i++;
            while (v<arr[j])
                j--;
            if (i<=j) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        while (i<=j);
        if (x<j)
            quickSort(arr,x,j);
        if (i<y)
            quickSort(arr,i,y);
    }

}
