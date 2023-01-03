import java.util.ArrayList;
import java.util.Iterator;

// На вход приходит ArrayList<Integer> удалите из него четные числа (на итератор)

public class DZ_3_4 {
    public static void delEven(ArrayList<Integer> arrayList1) {
        arrayList1.removeIf(num -> (int) num % 2 == 0);
        System.out.println(arrayList1);
    }
}