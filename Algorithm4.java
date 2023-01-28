// [두 정수 사이의 합]
// 두 정수 a, b 사이에 속한 모든 정수의 합을 리턴하는 함수
// a, b가 같은 경우 -> 둘 중 아무 수나 리턴

class Algorithm4 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else if (a < b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else answer = a;

        return answer;
    }
}