package exerciseBook;

import java.math.BigInteger;

public class Main {
    
    public static void main(String[] args) {
     

        String answer = solution("18446744073709551615", "287346502836570928366");
        System.out.println(answer);
       

    }

    public static String solution(String a, String b) {
        String answer = "";
        
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);

        answer = String.valueOf(a1.add(b1));
        
        return answer;
    }
}
