import java.util.ArrayList;
import java.util.Arrays;

public class Counting {
    public static final int MAX_VALUE = 9;

    public static Integer[] countingSort(int arr[]){
        int n = arr.length;
        int[] cnt = new int[MAX_VALUE+1];

        for (int i=0; i<n; i++) {
            cnt[arr[i]] += 1;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<=MAX_VALUE; i++) {
            for (int j=0; j<cnt[i]; j++) {
                list.add(i);
            }
        }
        Integer[] sortedArr = list.toArray(new Integer[list.size()]);
        return sortedArr;
    }

    public static void main(String args[]) {
        int arr[] = {0, 3, 8, 9, 5, 7, 4, 1, 2, 6, 5, 8};

        System.out.println(Arrays.toString(countingSort(arr)));
    }
}
