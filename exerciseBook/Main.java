package exerciseBook;

public class Main {
    
    public static void main(String[] args) {
     

        String answer = solution("18446744073709551615", "287346502836570928366");
        System.out.println(answer);
       

    }

    public static String solution(String a, String b) {
        String answer = "";
        
        long a1 = Long.parseLong(a);
        long b1 = Long.parseLong(b);
        
        answer = String.valueOf(a1 + b1);
        
        return answer;
    }
}
