import java.util.Arrays;

public class Bubble {
    // 이중 for문 대신 재귀문으로 작성
    public static void bubbleSort(int[] arr){
        bubbleSort(arr, arr.length-1);
    }

    public static void bubbleSort(int[] arr, int last) {
        if (last > 0) {
            for (int i = 1; i <= last; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            bubbleSort(arr, last-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 4, 3, 9, 7, 5, 8, 6};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
