import java.util.ArrayList;

// На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.
public class DZ_3_1 {
    public static void equalityList(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        if (arrayList1.size() != arrayList2.size()) {
            System.out.println("Массивы не равны");
            return;
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i) != arrayList2.get(i)) {
                System.out.println("Массивы не равны");
                return;
            }
        }
        System.out.println("Массивы равны");
    }