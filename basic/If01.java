package basic;

/*

<수 조작하기 1>

정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, 
control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.

"w" : n이 1 커집니다.
"s" : n이 1 작아집니다.
"d" : n이 10 커집니다.
"a" : n이 10 작아집니다.

위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
 
 */

class Solution {

    public int solution(int n, String control) {

        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
                n += 1;
            } else if (control.charAt(i) == 'a') {
                n -= 10;
            } else if (control.charAt(i) == 's') {
                n -= 1;
            } else if (control.charAt(i) == 'd') {
                n += 10;
            }
        }
        System.out.println(n);
        return n;
    }
}

public class If01 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        sol.solution(14, "wa");
        System.out.println("커밋 테스트");
    }

}

/*  프로그래머스의 의도를 잘 이해하자
    메소드 안에 내가 임의로 지역변수를 지정하여 컴퓨터에서 틀린 답으로 인지하였다.
    문자열 비교는 무조건 equals()!!!!!!!!!! 제발 까먹지 말자
    다른 사람들의 풀이에 비해 내 코드는 여전히 길다...!
    지식이 많이 없기 때문..
 * 
 */