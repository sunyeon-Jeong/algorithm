// [음양더하기]
// 정수배열 absolutes[] : 정수들의 절댓값을 차례대로 담음
// 불리언배열 signs[] : 정수들의 부호를 차례대로 담음
// 실제 정수들의 합을 구하여 return해라
// signs[i]가 true -> 양수, false -> 음수

class Algorithm7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) { // 정수배열 길이만큼 반복
            if (signs[i]) { // signs[i]가 참이면
                answer += absolutes[i]; // 양수형태로 더하기
            } else { // sings[i]가 거짓이면
                answer -= absolutes[i]; // 음수형태로 더하기
            }
        }
        return answer;
    }
}

// 삼항연산자도 사용가능
/* for (int i = 0; i < absolutes.length; i++) {
    answer += absolutes[i] * (signs[i]? 1: -1);
} */