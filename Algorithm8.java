// [평균구하기]
// arr[] : 정수를 담고 있는 배열
// arr[]의 평균값을 return하는 함수를 생성하라

class Algorithm8 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // 반드시 arr배열의 요소값을 변수에 더해주기
        }

        // 평균구하기
        answer = sum / arr.length;
        return answer;
    }
}