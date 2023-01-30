// [핸드폰 번호 가리기]
// 전화번호 -> 문자열 phone_number
// 전화번호 뒷 4자리제외 모든 숫자를 *로 가려 문자열을 리턴해라

class Algorithm9 {
    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length(); i++) { // phone number = 11
            if (i < phone_number.length() - 4) { // 가려야하는부분
                answer += "*"; // * 저장
            }else {
                answer += phone_number.charAt(i);
                // 전화번호의 i번째 수 -> 문자로 변환하여 answer에 저장
            }
        }
        return answer;
    }
}

/* for (int i = 0; i < phone_number.length() - 4; i++) {
        answer += "*";
    answer += phone_number.substring(phone_number.length() - 4);
    // substring(7) -> 7번째 index부터 문자열 잘라서 answer에 저장
 */