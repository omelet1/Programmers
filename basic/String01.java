package basic;

public class String01 {

    /*
     * 
     * <문자열의 뒤의 n 글자>
     * 
     * 문자열 my_string과 정수 n이 매개변수로 주어질 때,
     * my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
     * 
     * 제한사항
     * my_string은 숫자와 알파벳으로 이루어져 있습니다.
     * 1 ≤ my_string의 길이 ≤ 1,000
     * 1 ≤ n ≤ my_string의 길이
     */
    public static void main(String[] args) {

        String01.solution("ProgrammerS123", 11);
    }

    public static String solution(String my_string, int n) {

        my_string = my_string.substring(my_string.length() - n);

        System.out.println(my_string);

        return my_string;

    }
}

// 나의 접근법 -> 반복문
// substring() 메소드만 알고 있었으면 코드 한 줄이면 끝났을 문제
// 자바에서 제공하는 주요 메소드들부터 외워둬야 한다.
// 문자열 뒤의 n글자는 length() - n임을 명심하자! 이게 계산이 안되서 시간을 너무 많이 잡아먹었다.
// 역시 나는 이런 수학적 계산에 머리가 돌아가지 않는다. 어떡하지 ㅜㅜ

// for (int i = my_string.length() - n; i < my_string.length(); i++) {
// if (n < 1 || n > my_string.length())
// break;
// my_string = String.valueOf(my_string.charAt(i));
// }
// System.out.println(my_string);