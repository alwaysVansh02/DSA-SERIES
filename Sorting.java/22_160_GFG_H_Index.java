package Sorting;
import java.util.*;

public class Find_H_Index {
        public int hIndex(int[] citations) {
            int n = citations.length;

            int[] bucket = new int[n + 1];

            for (int c : citations) {
                if (c >= n) {
                    bucket[n]++;
                } else {
                    bucket[c]++;
                }
            }

            int count = 0;
            for (int i = n; i >= 0; i--) {
                count += bucket[i];
                if (count >= i) {
                    return i;
                }
            }

            return 0;
        }
    }


    class main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int T = sc.nextInt();   

            while (T-- > 0) {
                int n = sc.nextInt(); 
                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                Find_H_Index obj = new Find_H_Index();
                System.out.println(obj.hIndex(arr));
            }

            sc.close();
        }
    }





