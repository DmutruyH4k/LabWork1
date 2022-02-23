import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedLists {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер связного списка: ");
        final int N = sc.nextInt();

        LinkedList<Integer> linList = new LinkedList<>();
        for (int i = 0; i < N; i++){
            linList.add((int) (Math.random()*100));
        }

        ListIterator<Integer> listIterator = linList.listIterator();
        System.out.print("Связный список до изменений: ");
        while (listIterator.hasNext()){
            System.out.print(listIterator.nextIndex()!=N-1?listIterator.next()+", ":listIterator.next()+".\n");
        }

        int midIndex = N/2;

        System.out.print("Введите число повторений: ");
        int reps = sc.nextInt();
        while (reps > 0){
            int lastElem = linList.removeLast();
            linList.add(midIndex, lastElem);
            reps--;
        }

        listIterator = linList.listIterator(0);
        System.out.print("Связный список после изменений: ");
        while (listIterator.hasNext()){
            System.out.print(listIterator.nextIndex()!=N-1?listIterator.next()+", ":listIterator.next()+".\n");
        }
    }
}
