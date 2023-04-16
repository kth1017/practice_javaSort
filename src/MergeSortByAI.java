public class MergeSortByAI {
    // create merge sort algorithm
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int part1 = start;
        int part2 = mid + 1;
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (part1 > mid) {
                temp[index] = arr[part2];
                part2++;
            } else if (part2 > end) {
                temp[index] = arr[part1];
                part1++;
            } else if (arr[part1] < arr[part2]) {
                temp[index] = arr[part1];
                part1++;
            } else {
                temp[index] = arr[part2];
                part2++;
            }
            index++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
    }

    // practice previous sorting algorithms

    public static void main(String[] args) {
        int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
        System.out.println("Array Before Merge Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, arr.length - 1);// sorting array elements using merge sort
        System.out.println("Array After Merge Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
