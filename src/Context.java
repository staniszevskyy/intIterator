

import java.util.ArrayList;
import java.util.List;

public class Context {
    private Sort currentSort;

    public Context(Sort currentSort) {
        this.currentSort = currentSort;
    }

    public Sort getCurrentSort() {
        return currentSort;
    }

    public void setCurrentSort(Sort currentSort) {
        this.currentSort = currentSort;
    }

    public List<int[]> iterator(Iterator iterator){
        List<int[]> list = new ArrayList<>();
        while (iterator.hasNext()){
            list.add((int[]) currentSort.sort((int[]) iterator.next()));
        }
        return list;
    }
}