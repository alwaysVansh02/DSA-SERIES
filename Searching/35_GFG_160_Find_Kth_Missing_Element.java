class Solution {

    public int kthMissing(int[] arr, int k) {

        int low = 0, high = arr.length - 1;
        int res = arr.length + k;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing >= k) {
                res = mid + k;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] arr1 = {2, 3, 4, 7, 11};
        int k1 = 5;
        System.out.println(obj.kthMissing(arr1, k1));

        int[] arr2 = {1, 2, 3};
        int k2 = 2;
        System.out.println(obj.kthMissing(arr2, k2));
    }
}
