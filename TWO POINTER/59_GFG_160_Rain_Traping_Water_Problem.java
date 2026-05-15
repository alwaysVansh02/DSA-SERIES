//Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

package DSATWOPointerTechnique;
public class Rain_Traping_Water_Problem {
    ///  3. aproach Using Two Pointer Technique in Time --> O(n), Space --> O(1)
    static int maxwater(int[]arr){
        int left = 0;
        int right = arr.length -1;
        int Lmax = arr[left];
        int Rmax = arr[right];
        int res =0;
        while (left <= right){
            if (Rmax <= Lmax){
                res += Math.max(0 , Rmax - arr[right]);
                Rmax = Math.max(Rmax, arr[right]);
                right -= 1;
            }else {
                res += Math.max(0 , Lmax - arr[left]);
                Lmax = Math.max(Lmax, arr[left]);
                left += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,3,1,0,4};
        System.out.println(maxwater(arr));
    }
}
