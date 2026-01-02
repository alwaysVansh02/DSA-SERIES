package Searching;

public class Count_Of_Occurance {
        int countFreq(int[] arr, int target) {
            int first = bound(arr, target, true);
            if (first == arr.length || arr[first] != target)
                return 0;

            int last = bound(arr, target, false);
            return last - first;
        }
        int bound(int[] arr, int target, boolean isfirst) {
            int low = 0, high = arr.length;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] > target || (isfirst && arr[mid] == target)) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
        public static void main(String[] args) {
           Count_Of_Occurance obj = new Count_Of_Occurance();
            int[] arr1 = {1, 1, 2, 2, 2, 2, 3};
            int target1 = 2;
            System.out.println(obj.countFreq(arr1, target1)); 
            int[] arr2 = {1, 1, 2, 2, 2, 2, 3};
            int target2 = 4;
            System.out.println(obj.countFreq(arr2, target2));
        }
    }


