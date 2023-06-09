import java.util.*;

class Solution {
    public List<Integer> solution(String my_string) {
        // 숫자만을 추출한 후, 각 숫자를 Integer로 변환하고 리스트에 추가
        List<Integer> nums = new ArrayList<>();
        for(char ch : my_string.toCharArray()) {
            if(Character.isDigit(ch)) {
                nums.add(Character.getNumericValue(ch));
            }
        }

        // 리스트를 정렬
        Collections.sort(nums);

        return nums;
    }
}
