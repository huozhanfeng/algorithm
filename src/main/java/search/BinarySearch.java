package search;

/**
 * Created by zfhuo on 8/27/17.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int target = 6;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    public static int search(int[] arr, int target, int begin, int end) {
        if(end < begin) {
            return -1;
        }
        int mid = begin + (end - begin)/2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return search(arr, target, begin, mid - 1);
        } else {
            return search(arr, target, mid + 1, end);
        }
    }

    // 0 1 2 3 4
    // 0 0 1 1 2
}
