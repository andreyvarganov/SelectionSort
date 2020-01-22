import java.util.ArrayList;
import java.util.List;

public class Array {
    
    private List<Integer> array;
    
    public Array(int length) {
        array = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            array.add(i, ((int) (Math.random() * 10)));
        }
    }
    
    public void print() {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }

        System.out.println();
    }
    
    public void sort() {
        int min;

        for (int out = 0; out < array.size() - 1; out++) {
            min = out;
            for (int in = out + 1; in < array.size(); in++) {
                if (array.get(in) < array.get(min)) min = in;
            }
            swap(out, min);
        }
    }

    private void swap(int a, int b){
        int temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }
    
}
