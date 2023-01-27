// [직사각형 별찍기]
// *를 이용하여 가로n, 세로m인 직사각형 형태를 출력하라
// 1. 두 개의 정수 n, m
// 2. m, n -> 1000이하의 자연수

import java.util.Scanner; // 사용자입력값 받기위함
class Algorithm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 객체생성

        System.out.printf("가로 n값을 입력하시오 : ");
        int n = scanner.nextInt(); // 사용자입력값(문자열) -> 정수로 변환하여 n에 저장
        System.out.printf("세로 m값을 입력하시오 : ");
        int m = scanner.nextInt(); // 사용자입력값(문자열) -> 정수로 변환하여 m에 저장

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}