import java.util.ArrayList;
import java.util.Collections;

// На вход приходит ArrayList<Integer>.
// Отсортируйте в нем только четные числа.

public class DZ_3_3 {
    public static void sortEven(ArrayList<Integer> arrayList1) {
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int elem : arrayList1) {
            if (elem % 2 == 0) {
                arrayList2.add(elem);
            }
        }
        Collections.sort(arrayList2);
        int j = 0;
        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i) % 2 == 0) {
                arrayList1.set(i, arrayList2.get(j++));
            }
        }
        System.out.println(arrayList1);
    }
}