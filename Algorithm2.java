// [짝수와 홀수]
// 정수 num -> 짝수 -> "Even"
// 정수 num -> 홀수 -> "Odd"
// 1. num : int 타입 정수
// 2. 0은 짝수

import java.util.Scanner; // 사용자입력값 받기위함
class Algorithm2 {
    public String solution(int n) {
        Scanner scanner = new Scanner(System.in); // 객체생성

        System.out.printf("정수를 입력하시오 : ");
        int num = scanner.nextInt(); // 사용자입력값 -> 정수타입으로 num에 저장

        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        // main()없으면 컴파일러가 파일 실행 X
    }
}