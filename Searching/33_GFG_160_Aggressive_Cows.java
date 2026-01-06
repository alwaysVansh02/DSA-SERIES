package Searching;

    import java.util.Arrays;
public class Aggressive_Cows {
        public int aggressiveCows(int[] stalls, int k) {

            Arrays.sort(stalls);

            int lo = 1;
            int hi = stalls[stalls.length - 1] - stalls[0];
            int res = 0;

            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;

                if (canPlace(stalls, k, mid)) {
                    res = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            return res;
        }


        private boolean canPlace(int[] stalls, int k, int dist) {
            int cows = 1;
            int lastPos = stalls[0];

            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - lastPos >= dist) {
                    cows++;
                    lastPos = stalls[i];
                }
                if (cows >= k) return true;
            }
            return false;
        }

    public static void main(String[] args) {
        Aggressive_Cows obj = new Aggressive_Cows();
        int[] stalls ={1,2,4,8,9};
        int k =3;
        System.out.println("the largest minimum distance is:" + obj.aggressiveCows(stalls, k));
    }
    }


