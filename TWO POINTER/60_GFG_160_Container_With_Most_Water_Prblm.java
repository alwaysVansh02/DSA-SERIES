// Given an array arr[] of non-negative integers, where each element arr[i] represents the height of the vertical lines, find the maximum amount of water that can be contained between any two lines, together with the x-axis.
// Note: In the case of a single vertical line it will not be able to hold water.

// Aproach Using Two Pointer technique in Time--> O(n) and Space--> O(1)

package DSATWOPointerTechnique;

public class Container_With_Max_Water {
   static int maxwater(int[] arr){
        int left =0, right = arr.length - 1;
        int res =0;
        while (left < right){
            int water = Math.min(arr[left], arr[right]) * (right - left);
            res = Math.max(res , water);

            if (arr[left] < arr[right])
                left++;
            else
                right--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr ={ 2,1,8,6,4,6,5,5};
        System.out.println(maxwater(arr));
    }
}
