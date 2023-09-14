package exerciseBook;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int i = 0; // i 초기값 0으로 설정
        int[] stk = null;
        int[] nstk = null;

        while (i < arr.length) {
            if (stk == null) {
                stk = new int[] { arr[i] };
                ++i;
            } else if (stk.length != 0 && stk[stk.length - 1] == arr[i]) {
                nstk = new int[stk.length - 1];
                System.arraycopy(stk, 0, nstk, 0, stk.length - 1);
                stk = new int[nstk.length];
                System.arraycopy(nstk, 0, stk, 0, nstk.length);
                ++i;

            } else if (stk.length != 0 && stk[stk.length - 1] != arr[i]) {
                nstk = new int[stk.length + 1];
                System.arraycopy(stk, 0, nstk, 0, stk.length);
                nstk[stk.length] = arr[i];
                stk = new int[nstk.length];
                System.arraycopy(nstk, 0, stk, 0, nstk.length);
                ++i;

            } 

        }

        answer = stk;

        return answer;
    }
}
