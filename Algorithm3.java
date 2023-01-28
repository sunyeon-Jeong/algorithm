// [가운데글자 가져오기]
// 단어 s의 가운데 글자를 반환하는 함수
// s가 짝수 -> 가운데 두글자 반환

class Algorithm3_1 {
    public String solution(String s) {
        String answer = ""; // 공란으로 초기화

        // 매개변수로 받은 s 문자열의 길이 -> num 변수에 저장
        int num = s.length();
        int num2 = num/2;

        if (num % 2 == 0) { // 단어 짝수
            answer = s.substring(num2 - 1, num2 + 1);
        } else {
            answer = s.substring(num2, num2 + 1);
        }
        return answer;
        // 반환 값 String으로 정해줬기 때문에, return 안하면 Error!
    }
}