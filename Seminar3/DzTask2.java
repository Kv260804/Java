import java.util.ArrayList;

// На вход методу приходят 2 ArrayList<Integer> и целое число num. Проверьте что число num встречается в
// обоих массивах одинаковое кол-во раз.

public class DZ_3_2 {
    public static void checkArray(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2, int num) {
        int count = 0;
        for (Integer integer : arrayList1) {
            if (integer == num) {
                count++;
            }
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList2.get(i) == num) {
                count--;
            }
        }
        if (count == 0) {
            System.out.println("Число " + num + " встречается в массивах одинаковое количество раз");
        } else {
            System.out.println("Число " + num + " встречается в массивах разное количество раз либо не встречается");
        }
    }
}