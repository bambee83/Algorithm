class Solution {
    public String solution(int age) {
   String ageString = String.valueOf(age);
    String result = "";
    for (char c : ageString.toCharArray()) {
        result += (char)(c - '0' + 'a');
    }
    return result;
    }
}