import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<int []> list = new ArrayList<>();

        Maker maker = new Maker();

        Sort heap = new HeapSort();
        Sort quick = new QuickSort();
        Context context = new Context(heap);

        for(int i = 0; i < 10; i++){
            generate(list);
        }

        write(list);
        IntIterator iter  = new IntIterator(list);
        System.out.println("---");
        System.out.println("SORTED");
        System.out.println("---");

//        list = context.iterator(maker.iterator(list));
        list=context.iterator(iter);
        write(list);
    }

    private static void generate(List<int[]> list){
        Random generator = new Random();
        int[] tab = new int[5];

        for(int i = 0; i < 5; i++){
            tab[i] = generator.nextInt(10) + 1;
        }
        list.add(tab);
    }

    private static void write(List<int[]> list){
        for (int[] x: list) {
            System.out.println("---");
            System.out.print("[ ");
            for(int i = 0; i < x.length; i++){
                System.out.print(x[i] + " ; ");
            }
            System.out.println("]");
            System.out.println("---");
        }
    }
}