import java.util.Arrays;

public class Merge {

    /*
    임시 배열을 메서드에 넣는게 실제로는 효율적이지만 예제기때문에 매개변수를 적게하기 위해
    위로 빼둠
     */

    public static int tempArr[] = new int[10];


    // 우선 병합 로직
    public static void merge(int arr[], int m, int middle, int n){
        int i = m;
        int j = middle + 1;
        int k = m;
        // 1차 병합
        while (i <= middle && j <= n) {
            if (arr[i] <= arr[j]) {
                tempArr[k] = arr[i];
                i++;
            } else {
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }
        // i 완료 후 나머지 값 전부 처리
        if (i > middle) {
            for (int t = j; t <= n; t++) {
                tempArr[k] = arr[t];
                k++;
            }
        // j 완료 후도 마찬가지
        } else {
            for (int t = i; t <= middle; t++) {
                tempArr[k] = arr[t];
                k++;
            }
        }
        // 임시 저장 값 반영
        for (int t = m; t <= n; t++) {
            arr[t] = tempArr[t];
        }
    }

    public static void mergeSort(int arr[], int m, int n){
        if (m < n) {
            int middle = (m + n) / 2;
            mergeSort(arr, m, middle);
            mergeSort(arr, middle+1, n);
            merge(arr, m, middle, n);
        }
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int n = 10;
        int[] arr = {0, 2, 1, 4, 3, 9, 7, 5, 8, 6};
        mergeSort(arr, 0, n-1);

        long endTime = System.currentTimeMillis();

        System.out.println(Arrays.toString(arr));
        System.out.println(endTime - startTime);

    }
}
