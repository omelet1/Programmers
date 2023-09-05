package programmers.lv_0;

// <첫 번째로 나오는 음수>
// 정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.

public class NegativeNumber {

    public static void main(String[] args) {

        int[] num_list = { 1, 2, 3, 4, 5, -1 };

        solution2(new int[] { -2, 1, 2, 3, 4, 5, -3 });

    }

    // 나의 풀이 1
    // for ~ if ~ else를 토대로 코딩 진행
    // 음수 여부 판단 -> num_list[i] < 0;
    // 음수가 없다면>? -> num_list[i] > 0;
    // 첫 번째 음수라....
    // 첫 코딩때 나름 잘 풀었다고 생각했는데 이상하게 배열 관련 오류가 발생하였다.
    // 내 코딩은 의심하지 않고 메소드 실행시 매개변수를 배열로 받는 것에 대해 검색하기 시작하였다.
    // 나름 도움이 되었지만 lv.0 문제에 이렇게 어려운게 나오는 게 아닐텐데 하면서 내 코딩을 계속 돌아보았다.
    static int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }

            else
                answer = -1;
        }

        return answer;

    }

    // 다른 사람의 풀이 1
    // return에 대한 이해가 아직 부족하다..
    // 화면 출력과는 전혀 상관이 없다
    // 나는 if else에 갇혀있었기 때문에 메소드 마지막 return을 어떻게 처리해야 하는지 골머리를 앓았다.
    // 하지만 else를 안쓰면 그만인 문제였다.
    // 음수일때 return i외에는 전부 -1이기 때문에 else없이 바로 for문 바깥에다 return -1;을 입력하면 되는 것이었다..!
    // return이 곧 break;이므로 break도 안써도 되었었다.. 

    static int solution2(int[] num_list) {

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
