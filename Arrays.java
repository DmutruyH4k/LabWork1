import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        final int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++){
            array[i] = (int) (Math.random()*100);
        }

        System.out.print("Массив вначале: ");
        for (int i = 0; i < N; i++)
            System.out.print(i<array.length-1?array[i]+", ":array[i]+".\n");

        int midIndex = N/2;

        System.out.print("Введите число повторений: ");
        int reps = sc.nextInt();
        while (reps > 0){
            int lastElem = array[N-1];
            int elemToReplace = array[midIndex];
            array[midIndex] = lastElem;

            int buf;
            for (int i = midIndex+1; i < array.length; i++){
                buf = array[i];
                array[i] = elemToReplace;
                elemToReplace = buf;
            }
            reps--;
        }

        System.out.print("Массив сейчас: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(i<array.length-1?array[i]+", ":array[i]+".\n");
    }
}
