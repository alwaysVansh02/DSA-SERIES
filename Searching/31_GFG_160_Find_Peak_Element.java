package Searching;

public class Finding_Peak_Element {
        public int peakElement(int[] arr) {

            int n = arr.length;

            if (n == 1)
                return 0;

            if (arr[0] > arr[1])
                return 0;

            if (arr[n - 1] > arr[n - 2])
                return n - 1;

            int lo = 1, hi = n - 2;

            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;

                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                    return mid;

                if (arr[mid] < arr[mid + 1])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }

            return 0;
        }
        public static void main(String[] args) {

            Finding_Peak_Element obj = new Finding_Peak_Element();

            int[] arr1 = {1, 2, 4, 5, 7, 8, 3};
            int index1 = obj.peakElement(arr1);
            System.out.println("Peak index: " + index1 +
                    ", Peak value: " + arr1[index1]);

            int[] arr2 = {10, 20, 15, 2, 23, 90, 67};
            int index2 = obj.peakElement(arr2);
            System.out.println("Peak index: " + index2 +
                    ", Peak value: " + arr2[index2]);
        }
    }


