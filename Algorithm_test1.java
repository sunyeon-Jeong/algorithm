import java.util.Calendar;
/*
말랑이는 오늘 항해99를 시작했다.
항해 1일차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해라.
*/
public class Algorithm_test1 {
    public String solution(int month, int day) {
        String answer = "";
        int num = 98;
        Calendar cal = Calendar.getInstance(); // calendar 클래스 객체 생성
        cal.set(2023, month, day);
        cal.add(Calendar.DATE,num); // 일수에 num(98일) 더하기

        int mon = cal.get(Calendar.MONTH);
        int d = cal.get(Calendar.DATE);

        System.out.println(mon + "월 " + d + "일");

        return answer;
    }

    public static void main(String[] args) {
        Algorithm_test1 method = new Algorithm_test1();
        System.out.println(method.solution(1, 9));
    }
}