import java.util.ArrayList;
import java.util.List;

public class IntIterator implements Iterator{
    private List<int[]> intCollection;
    private int currentElement;

    public IntIterator(List<int[]> intCollection) {
        this.intCollection = intCollection;
    }

    @Override
    public Boolean hasNext() {

        return intCollection.size()!=currentElement;
    }

    @Override
    public Object next() {
        if (hasNext()){
            return intCollection.get(currentElement++);
        }
        return null;
    }
}
