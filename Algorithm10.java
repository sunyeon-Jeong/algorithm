// [행렬의 덧셈]
// arr1[] arr2[]를 입력받아 행렬 덧셈의 결과를 반환하는 함수를 작성하라

class Algorithm10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}