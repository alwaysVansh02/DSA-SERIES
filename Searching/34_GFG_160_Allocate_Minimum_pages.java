package Searching;

public class Allocate_Minimum_Pages {
        public int findPages(int[] arr, int k) {
            if (k > arr.length) return -1;

            int low = 0, high = 0;
            for (int pages : arr) {
                low = Math.max(low, pages);
                high += pages;
            }

            int ans = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (ispossible(arr, k, mid)) {
                    ans = mid;        
                    high = mid - 1;   
                } else {
                    low = mid + 1;  
                }
            }
            return ans;
        }

        static boolean ispossible(int[] arr, int k, int maxpages) {

            int students = 1;
            int pagesum = 0;

            for (int i = 0; i < arr.length; i++) {

                if (pagesum + arr[i] <= maxpages) {
                    pagesum += arr[i];
                } else {
                    students++;
                    pagesum = arr[i];

                    if (students > k)
                        return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {

           Allocate_Minimum_Pages obj = new Allocate_Minimum_Pages();

            int[] arr1 = {12, 34, 67, 90};
            int k1 = 2;
            System.out.println(obj.findPages(arr1, k1)); 

            int[] arr2 = {15, 17, 20};
            int k2 = 5;
            System.out.println(obj.findPages(arr2, k2)); 
        }
    }


