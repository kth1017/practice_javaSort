import java.util.Arrays;

public class Quick {

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = start;
        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && arr[left] <= arr[pivot]) left++;
            while (right > start && arr[right] >= arr[pivot]) right--;
            // 파이썬, C++은 포인터를 이용하기에 temp가 필요없음
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            quickSort(arr, start, right-1);
            quickSort(arr, right + 1, end);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {0, 2, 1, 4, 3, 9, 7, 5, 8, 6};
        quickSort(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));

    }
}
