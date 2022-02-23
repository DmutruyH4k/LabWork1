import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер динамического массива: ");
        final int N = sc.nextInt();

        ArrayList<Integer> arrrList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrrList.add((int) (Math.random() * 100));
        }

        System.out.print("Динамический массив до изменений: ");
        for (int i = 0; i < N; i++) {
            System.out.print(i != N - 1 ? arrrList.get(i) + ", " : arrrList.get(i) + ".\n");
        }

        int midIndex = N / 2;

        System.out.print("Введите число повторений: ");
        int reps = sc.nextInt();
        while (reps > 0){
            int lastElem = arrrList.get(N - 1);
            arrrList.add(midIndex, lastElem);
            arrrList.remove(N);
            reps--;
        }

        System.out.print("Динамический массив после изменений: ");
        for (int i = 0; i < N; i++) {
            System.out.print(i != N - 1 ? arrrList.get(i) + ", " : arrrList.get(i) + ".\n");
        }
    }
}
