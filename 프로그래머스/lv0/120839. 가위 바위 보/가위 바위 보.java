class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();
         for (char c : rsp.toCharArray()) {
                switch (c) {
                    case '0':
                        // 0: 바위, 바위는 보(5)로 이김
                        result.append('5');
                        break;
                    case '2':
                        // 2: 가위, 가위는 바위(0)로 이김
                        result.append('0');
                        break;
                    case '5':
                        // 5: 보, 보는 가위(2)로 이김
                        result.append('2');
                        break;
                }
            }

            return result.toString();
    }
}