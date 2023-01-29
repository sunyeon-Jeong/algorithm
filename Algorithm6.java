// [없는 숫자 더하기]
// 0~9 숫자 중, 일부가 들어있는 정수배열 numbers가 매개변수
// numbers에서 찾을 수 없는 숫자를 모두 찾아 더한 수를 return

class Algorithm6 {
    public int solution(int[] numbers) {
        int answer = 45; // 0~9까지 합

        for (int i = 0; i < numbers.length; i++) { // numbers[] 길이만큼 반복
            answer -= numbers[i]; // i번째 요소값 answer에서 빼기
        }

        return answer;
    }
}

/* class Algorithm6 {
    public int solution(int[] numbers) {
        int answer = 45; // 0~9까지 합

        for (int i : numbers) { // numbers[] 요소값 i에 하나씩 대입
            answer -= i; // answer에서 요소값 하나씩 빼기
        }

        return answer;
    }
} */