package exerciseBook;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int i = 0; // i 초기값 0으로 설정
        int[] stk = null;
        int[] nstk = null;
        int[] arr = {0,1,1,1,0};
        
        while(i < arr.length) {
            if (stk == null) {
                stk = new int[]{arr[i]};
                ++i;
            }
            else if (stk.length != 0 && stk[stk.length-1] == arr[i]) {
                nstk = new int [stk.length-1];
                System.arraycopy(stk, 0, nstk, 0, stk.length-1);
                stk = new int[nstk.length];
                System.arraycopy(nstk, 0, stk, 0, nstk.length);
                ++i;
            }
            else if (stk.length != 0 && stk[stk.length-1] != arr[i]) {
                nstk = new int[stk.length+1];
                System.arraycopy(stk, 0, nstk, 0, stk.length);
                nstk[stk.length] = arr[i];
                stk = new int[nstk.length];
                System.arraycopy(nstk, 0, stk, 0, nstk.length);
                ++i;
            }
        }
        System.out.println(stk[0]);
        System.out.println(stk[1]);
        System.out.println(stk[2]);

        


        // Solution s1 = new Solution();

        // s1.solution(new int[]{0,1,1,1,0});


        // int[] stk = new int[] { 1, 2, 3, 4, 5 };

        // int[] nstk = new int[stk.length - 1];

        // // for (int i = 0; i < oldArr.length-1; i++) {
        // // newArr[i] = oldArr[i];
        // // System.out.println("newArr[" + i +"] " + newArr[i]);
        // // }

        // System.arraycopy(stk, 0, nstk, 0, stk.length-1);

        // for (int i = 0; i < stk.length-1; i++) {
        // // nstk[i] = stk[i];
        // System.out.println("newArr[" + i +"] " + nstk[i]);
        // }

    }
}
