import java.util.List;

public class Maker implements IteratorMaker {
    @Override
    public Iterator iterator(List<int[]> collection) {
        return new IntIterator(collection);
    }
}
