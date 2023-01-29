// [문자열을 정수로 바꾸기]
// 문자열 s를 숫자로 변환한 결과를 반환하는 함수
// s 맨앞에 부호가 올수도 있음

class Algorithm5 {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        // parseInt()메소드 : 파라미터로 문자열을 입력받고, 정수로 변환한 Int값 return
        return answer;
    }
}