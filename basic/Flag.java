package basic;

/*  <flag에 따라 다른 값 반환하기>
    
    두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
  
 */

public class Flag {
    public static void main(String[] args) {

        Solution sol = new Solution();
        Solution3 sol3 = new Solution3();

        int methodValue = 0;

        methodValue = sol.solution(4, 7, true);
        methodValue = sol3.solution(2, 7, false);

        System.out.println(methodValue);

    }
}

// 나의 풀이
// 조건문을 사용할 때 나는 if / else if에 갇혀있다. 코드가 늘어진다.
class Solution {

    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if (flag == true) {
            answer = a + b;
        } else if (flag == false) {
            answer = a - b;
        }

        return answer;

    }
}
// 삼항 연산자를 이용한 풀이
class Solution1 {

    public int solution(int a, int b, boolean flag) {

        return (flag ? a + b : a - b);

    }
}

// if else를 축약한 풀이
// 삼항 연산자보다 가독성이 좋은 것 같다. if else를 쓰면서 꼭 필요한 내용만 들어가 있다. 내가 이렇게 해야 하는데.. 
class Solution2 {

    public int solution(int a, int b, boolean flag) {

        if (flag) {
            return a+b;
        } else {
            return a-b;
        }

    }
}

// if else를 보다 더 간단하게..!
class Solution3 {

    public int solution(int a, int b, boolean flag) {

        if (flag) return a+b;
        else return a-b;
        
    }
}
